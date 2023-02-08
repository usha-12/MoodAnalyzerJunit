package com.brideglabz.moodanalyser;

public class MoodAnalyser {
    public String moodAnalyser(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }
    }
}
