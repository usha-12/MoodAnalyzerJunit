package com.brideglabz.moodanalyser;

import org.junit.jupiter.api.*;

public class MoodAnalyzerTest {
    @BeforeAll
    static void show_msg_before_all_test_case (){
        System.out.println("---Welcome to Mood Analyzer---");
    }
    @AfterAll
    public static void show_Msg_After_All_Test_Case(){
        System.out.println("All Test Case Completed");
    }
    @AfterEach
    void after_Each_Test_Case_Print_Msg(){
        System.out.println("Pass");
    }
    MoodAnalyser object ;
    @BeforeEach
    public void setUp() {
        object = new MoodAnalyser();
    }
    @Test
    public void moodAnalyser(){
        String ans = object.moodAnalyser("I am in Sad Mood");
        Assertions.assertEquals("SAD",ans);;
        System.out.println(ans);
    }
}
