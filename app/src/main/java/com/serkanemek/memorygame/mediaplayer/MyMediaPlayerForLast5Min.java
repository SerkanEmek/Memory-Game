package com.serkanemek.memorygame.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;

import com.serkanemek.memorygame.R;
import com.serkanemek.memorygame.data.SharedPForAdvAndTotalQuestionCounter;

public class MyMediaPlayerForLast5Min {

    static MediaPlayer mediaPlayer;
    Integer maxVolume = 50;
    Integer currVolume = 50;
    float log1=(float)(Math.log(maxVolume-currVolume)/Math.log(maxVolume));
    SharedPForAdvAndTotalQuestionCounter sharedPForAdvAndTotalQuestionCounter;



    public void playLast5Min(Context context){
        try {
            Integer i;
            sharedPForAdvAndTotalQuestionCounter = new SharedPForAdvAndTotalQuestionCounter();
            i = sharedPForAdvAndTotalQuestionCounter.getCheckSoundForOnOff(context);
            if(i == 1){
                if(mediaPlayer == null){
                    mediaPlayer = MediaPlayer.create(context, R.raw.timefivesecond);

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            stopLast5Min();
                        }
                    });
                }
                mediaPlayer.setVolume(log1,log1);
                mediaPlayer.start();
            }else{
                mediaPlayer = null;
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pauseCorrectAnswerSound(){
        if(mediaPlayer != null){
            mediaPlayer.pause();
        }
    }

    public void stopLast5Min(){
        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


}
