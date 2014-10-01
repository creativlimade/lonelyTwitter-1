package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetListModel {
	
	private ArrayList<LonelyTweetModel> tweets;
	
	public void addTweet(LonelyTweetModel lonelyTweetModel) {
		tweets.add(lonelyTweetModel);
	}
	
	public void removeTweet(LonelyTweetModel lonelyTweetModel) {
		tweets.remove(lonelyTweetModel);
	}
	
	public TweetListModel() {
		super();
		tweets = new ArrayList<LonelyTweetModel>();
	}

	public int getCount() {
		return tweets.size();
	}
	
	public LonelyTweetModel getItem(int i) {
		return tweets.get(i-1);
	}
}
