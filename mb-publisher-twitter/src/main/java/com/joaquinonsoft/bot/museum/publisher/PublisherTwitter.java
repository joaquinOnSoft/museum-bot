package com.joaquinonsoft.bot.museum.publisher;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

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
				status.append(asset.getMuseum());
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
		String path = tDir +  File.pathSeparator + FileUtil.getRandomFileName(extension); 
		File file = new File(path); 
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
		Twitter twitter = Twitter.getInstance();
		Status status = null;
		
		try {
			// post a tweet link with image
			String statusMessage = toStatusMessage(asset);
			// Creates a URL with file protocol and convert it into File object.
	        File imagefile = FileUtils.toFile(new URL(asset.getImageLink()));
	        
			long[] mediaIds = new long[1];			
			UploadedMedia media = twitter.v1().tweets().uploadMedia(imagefile);
		    mediaIds[0] = media.getMediaId();

		    StatusUpdate statusUpdate = StatusUpdate.of(statusMessage);
		    statusUpdate.mediaIds(mediaIds) ;		  
					
			status = twitter.v1().tweets().updateStatus(statusUpdate);
			
			System.out.println("Successfully updated the status to [" + status.getText() + "]."); 
		} catch (TwitterException e) {
			log.error("Publishing on Twitter: ", e);
		} catch (MalformedURLException e) {
			log.error("Invalid museum asset URL: ", e);
		}
		if (status != null) {
			log.info("Successfully updated the status to [" + status.getText() + "].");
		}

		return false; //TODO result true when successful 
	}

}
