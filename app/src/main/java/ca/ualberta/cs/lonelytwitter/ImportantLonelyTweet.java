package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantLonelyTweet extends Tweet {

    public ImportantLonelyTweet() {
    }

    public ImportantLonelyTweet(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() < 50) {  // Changed to 50 instead of 10 for regular tweet
            return false;
        }

        return true;
    }
}
