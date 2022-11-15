package com.joaquinonsoft.bot.museum.publisher;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.util.FileUtil;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.v1.Status;
import twitter4j.v1.StatusUpdate;
import twitter4j.v1.UploadedMedia;

public class PublisherTwitter implements IPublisher {
	/**
	 * In most cases, the text content of a Tweet can contain up to 280 characters 
	 * or Unicode glyphs. Some glyphs will count as more than one character. 
	 * @see https://developer.twitter.com/en/docs/counting-characters#:~:text=In%20most%20cases%2C%20the%20text,as%20more%20than%20one%20character.
	 **/
	private static final int TWITT_MAX_LENGTH = 280;
	private static final Logger log = LogManager.getLogger(PublisherTwitter.class);

	protected String toStatusMessage(MuseumAsset asset) {
		StringBuilder status = new StringBuilder();

		if(asset != null) {
			status.append(asset.getTitle()).append("\n")
			.append(asset.getArtistName()).append("\n")
			.append("(").append(asset.getDate()).append(")");
			
			int length = status.toString().length();
			if( length < TWITT_MAX_LENGTH &&
					asset.getMuseum() != null &&
					asset.getMuseum().length() + length <= TWITT_MAX_LENGTH){
				status.append("\n").append(asset.getMuseum());
			}
		}

		return status.toString();
	}
	
	/**
	 * Generates a temporal file with a random file name
	 * @param extension - file extension (without a dot), i.e `png`or `jpg`
	 * @return
	 */
	protected File generateTmpFile(String extension) {
		String tDir = System.getProperty("java.io.tmpdir"); 
		StringBuilder path = new StringBuilder();
		path.append(tDir);
		
		if(!tDir.endsWith(File.separator)) {
			path.append(File.separator);
		}
		
		path.append( FileUtil.getRandomFileName(extension) ); 
		
		File file = new File(path.toString());  
		file.deleteOnExit();
		
		return file;
	}

	/**
	 * Post a Tweet
	 * @see https://twitter4j.org/code-examples
	 * @see https://roytuts.com/how-to-post-image-tweets-to-twitter-using-twitter4j-java-api/
	 */
	@Override
	public boolean publish(MuseumAsset asset) {
		boolean published = false;
		Twitter twitter = Twitter.getInstance();
		Status status = null;
		
		try {
			// post a tweet link with image
			String statusMessage = toStatusMessage(asset);
			// Creates a URL with file protocol and convert it into File object.
	        //File imagefile = FileUtils.toFile(new URL(asset.getImageLink()));
	        
			Path path = Paths.get("tmp-image");
	        InputStream in = new URL(asset.getImageLink()).openStream();
	        Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
	        /*
			long[] mediaIds = new long[1];			
			UploadedMedia media = twitter.v1().tweets().uploadMedia(path.toFile());
		    mediaIds[0] = media.getMediaId();
	        */ 
		    StatusUpdate statusUpdate = StatusUpdate.of(statusMessage);
		    //statusUpdate.mediaIds(mediaIds) ;		  
					
			status = twitter.v1().tweets().updateStatus(statusUpdate);
			published = true;
			
			log.debug("Successfully updated the status to [" + status.getText() + "]."); 
		} catch (TwitterException e) {
			log.error("Publishing on Twitter: ", e);
		} catch (MalformedURLException e) {
			log.error("Invalid museum asset URL: ", e);
		} catch (IOException e) {
			log.error("URL to File: ", e);
		}
		
		return published; //TODO result true when successful 
	}

}
