package ca.ualberta.cs.lonelytwitter.test;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;


public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListModelTest() {
		super(LonelyTwitterActivity.class);	
	}

	public void testFiveIsFive() {
		assertEquals(5, 5);
	}
	
	public void testTweetListModel() {
		TweetListModel tlm = new TweetListModel();
	}
	
	public void testAddTweet() {
		try {
			TweetListModel tlm = new TweetListModel();
			LonelyTweetModel newTweet = new LonelyTweetModel("test");
			
			if (testHasTweet(newTweet)) {
				throw new IllegalArgumentException();
			} else {
				tlm.addTweet(newTweet);
			}
		} catch (IllegalArgumentException e) {
			assertEquals(e.getClass(), IllegalArgumentException.class);
		}
	}
	
	public void testGetItem() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("test");
		tlm.addTweet(firstTweet);
		assertSame(firstTweet, tlm.getItem(1));
	}

	public void testGetTweets() {
		TweetListModel tlm = new TweetListModel();
		
		for (int i = 0; i < tlm.getCount(); i++) {
			System.out.println(tlm.getItem(i));
		}
		
	}
	
	public boolean testHasTweet(LonelyTweetModel test) {
		TweetListModel tlm = new TweetListModel();
		
		for (int i = 0; i < tlm.getCount();) {
			if (test ==  tlm.getItem(i)) {
				return true;
			} else {
				return false;
			}
		} return false;
	}
	
	public void testRemoveTweet() {
		try {
			TweetListModel tlm = new TweetListModel();
			LonelyTweetModel removeTweet = new LonelyTweetModel("test");
			
			if (testHasTweet(removeTweet)) {
				tlm.removeTweet(removeTweet);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			assertEquals(e.getClass(), IllegalArgumentException.class);
		}
	}
	
	public int testGetCount() {
		TweetListModel tlm = new TweetListModel();
		return tlm.getCount();
	}
	
}
