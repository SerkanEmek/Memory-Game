package com.serkanemek.memorygame.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPForAdvAndTotalQuestionCounter {


    SharedPreferences sharedPreferencesForMemoryGameTotalQuestion;
    SharedPreferences sharedPreferencesForMemoryGameCorrectAnswers;

    SharedPreferences sharedPreferencesForCheckMusicForOnOff;
    SharedPreferences sharedPreferencesForCheckSoundForOnOff;
    SharedPreferences sharedPreferencesForCheckVibrationOnOff;


    public void updateMemoryGameTotalQuestionData(Context context, Integer counterNumber){
        try {
            Integer storedMemoryGameTotalQuestion = -1;
            sharedPreferencesForMemoryGameTotalQuestion = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMemoryGameTotalQuestion = sharedPreferencesForMemoryGameTotalQuestion.getInt("storedMemoryGameTotalQuestionData",0);
            storedMemoryGameTotalQuestion = storedMemoryGameTotalQuestion + counterNumber;
            sharedPreferencesForMemoryGameTotalQuestion.edit().putInt("storedMemoryGameTotalQuestionData" , storedMemoryGameTotalQuestion).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getMemoryGameTotalQuestionData(Context context){
        Integer storedMemoryGameTotalQuestion = -1;
        try {
            sharedPreferencesForMemoryGameTotalQuestion = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMemoryGameTotalQuestion = sharedPreferencesForMemoryGameTotalQuestion.getInt("storedMemoryGameTotalQuestionData",0);
            return storedMemoryGameTotalQuestion;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedMemoryGameTotalQuestion;

    }

    public void updateMemoryGameCorrectAnswersData(Context context, Integer counterNumber){
        try {
            Integer storedMemoryGameCorrectAnswers = -1;
            sharedPreferencesForMemoryGameCorrectAnswers = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMemoryGameCorrectAnswers = sharedPreferencesForMemoryGameCorrectAnswers.getInt("storedMemoryGameCorrectAnswersData",0);
            storedMemoryGameCorrectAnswers = storedMemoryGameCorrectAnswers + counterNumber;
            sharedPreferencesForMemoryGameCorrectAnswers.edit().putInt("storedMemoryGameCorrectAnswersData" , storedMemoryGameCorrectAnswers).apply();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getMemoryGameCorrectAnswersData(Context context){
        Integer storedMemoryGameCorrectAnswers = -1;
        try {
            sharedPreferencesForMemoryGameCorrectAnswers = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            storedMemoryGameCorrectAnswers = sharedPreferencesForMemoryGameCorrectAnswers.getInt("storedMemoryGameCorrectAnswersData",0);
            return storedMemoryGameCorrectAnswers;
        }catch (Exception e){
            e.printStackTrace();
        }
        return storedMemoryGameCorrectAnswers;

    }


    public void updateCheckMusicForOnOff(Context context,Integer integer){  // false is off, true is on.
        try {
            sharedPreferencesForCheckMusicForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckMusicForOnOff.edit().putInt("storedCheckMusicOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckMusicForOnOff(Context context){
        Integer checkMusic = -1;
        try {
            sharedPreferencesForCheckMusicForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkMusic = sharedPreferencesForCheckMusicForOnOff.getInt("storedCheckMusicOnOffData", 1);
            return checkMusic;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkMusic;
    }


    public void updateCheckSoundForOnOff(Context context,Integer integer){  // 0 is off, 1 is on.
        try {
            sharedPreferencesForCheckSoundForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckSoundForOnOff.edit().putInt("storedCheckSoundOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckSoundForOnOff(Context context){
        Integer checkSound = -1;
        try {
            sharedPreferencesForCheckSoundForOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkSound = sharedPreferencesForCheckSoundForOnOff.getInt("storedCheckSoundOnOffData", 1);
            return checkSound;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkSound;
    }

    public void updateCheckVibrationForOnOff(Context context,Integer integer){  // 0 is off, 1 is on.
        try {
            sharedPreferencesForCheckVibrationOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            sharedPreferencesForCheckVibrationOnOff.edit().putInt("storedCheckVibrationOnOffData",integer).apply();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Integer getCheckVibrationForOnOff(Context context){
        Integer checkVibrator = -1;
        try {
            sharedPreferencesForCheckVibrationOnOff = context.getSharedPreferences("com.serkanemek.garrybarry.Activities", Context.MODE_PRIVATE);
            checkVibrator = sharedPreferencesForCheckVibrationOnOff.getInt("storedCheckVibrationOnOffData", 1);
            return checkVibrator;
        }catch (Exception e){
            e.printStackTrace();
        }
        return checkVibrator;
    }


}
