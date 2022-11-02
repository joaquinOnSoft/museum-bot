package com.joaquinonsoft.bot.museum.publisher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.v1.Status;

public class PublisherTwitter implements IPublisher {
	protected static final Logger log = LogManager.getLogger(PublisherTwitter.class);

	/**
	 * Post a Tweet
	 * @see https://twitter4j.org/code-examples
	 */
	@Override
	public boolean publish(MuseumAsset asset) {
		Twitter twitter = Twitter.getInstance();
		Status status = null;
		try {
			status = twitter.v1().tweets().updateStatus(""); //TODO use asset content
		} catch (TwitterException e) {
			log.error("Publishing on Twitter: ", e);
		}
		log.info("Successfully updated the status to [" + status.getText() + "].");
		
		return false;
	}

}
