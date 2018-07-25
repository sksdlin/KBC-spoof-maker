package com.example.shri.playkbcwithme;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    ImageButton ibIntro1;
    ImageButton ibIntro2;
    ImageButton ibNextQuestion;
    ImageButton ibSuspense1;
    ImageButton ibSuspense2;
    ImageButton ibSuspense3;
    ImageButton ibSuspense4;
    ImageButton ibLock;
    ImageButton ibCorrect;
    ImageButton ibIncorrect;
    ImageButton ibDramatic;
    ImageButton ibPhoneAFriend;
    ImageButton ibHooter;

    MediaPlayer mPlayIntro1;
    MediaPlayer mPlayIntro2;
    MediaPlayer mPlayNextQuestion;
    MediaPlayer mPlaySuspense1;
    MediaPlayer mPlaySuspense2;
    MediaPlayer mPlaySuspense3;
    MediaPlayer mPlaySuspense4;
    MediaPlayer mPlayLock;
    MediaPlayer mPlayCorrect;
    MediaPlayer mPlayIncorrect;
    MediaPlayer mPlayDramatic;
    MediaPlayer mPlayPhoneAFriend;
    MediaPlayer mPlayHooter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startMediaPlayer();

        ibIntro1 = findViewById(R.id.ibIntro1);
        ibIntro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //PlayIntro1();

                playSound(mPlayIntro1,"Introduction 1.");
            }
        });

        ibIntro2 = findViewById(R.id.ibIntro2);
        ibIntro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlayIntro2,"Introduction 2.");
            }
        });





        ibNextQuestion = findViewById(R.id.ibNextAnswer);
        ibNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               playSound(mPlayNextQuestion,"Next Question.");
            }
        });
        ibSuspense1 = findViewById(R.id.ibSuspense1);
        ibSuspense1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlaySuspense1,"Suspense 1.");

            }
        });

        ibSuspense2 = findViewById(R.id.ibSuspense2);
        ibSuspense2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlaySuspense2,"Suspense 2.");
            }
        });

        ibSuspense3 = findViewById(R.id.ibSuspense3);
        ibSuspense3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlaySuspense3,"Suspense 3.");
            }
        });



        ibSuspense4 = findViewById(R.id.ibSuspense4);
        ibSuspense4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlaySuspense4,"Suspense 4.");
            }
        });



        ibLock = findViewById(R.id.ibLock);
        ibLock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlayLock,"Lock.");
            }
        });

        ibCorrect = findViewById(R.id.ibCorrectAns);
        ibCorrect.setClickable(false);

        ibIncorrect= findViewById(R.id.ibIncorrectAns);
        ibIncorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlayIncorrect,"Incorrect Answer.");
            }
        });

        ibDramatic = findViewById(R.id.ibDramaticTone);
        ibDramatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlaySuspense1,"Dramatic.");
            }
        });
        ibPhoneAFriend =findViewById(R.id.ibPhoneAFriend);
        ibPhoneAFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlayPhoneAFriend,"Phone A Friend.");
            }
        });

        ibHooter = findViewById(R.id.ibHooter);
        ibHooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(mPlayHooter,"Hooter.");
            }
        });





    }// onCreate

    @Override
    protected void onStop() {
        super.onStop();
        CleanMediaPlayerObject();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        startMediaPlayer();

    }

    @Override
    protected void onResume() {
        super.onResume();
        startMediaPlayer();

    }

    public void startMediaPlayer() {
        mPlayIntro1 = new MediaPlayer().create(this,R.raw.intro1);
        mPlayIntro2 = new MediaPlayer().create(this,R.raw.intro2);
        mPlayNextQuestion = new MediaPlayer().create(this,R.raw.next_question);
        mPlaySuspense1 = new MediaPlayer().create(this,R.raw.suspense1);
        mPlaySuspense2= new MediaPlayer().create(this,R.raw.suspense2);
        mPlaySuspense3= new MediaPlayer().create(this,R.raw.suspense3);
        mPlaySuspense4= new MediaPlayer().create(this,R.raw.suspense4);
        mPlayLock = new MediaPlayer().create(this, R.raw.lock);
        //mPlayCorrect = new MediaPlayer().create(this, R.raw.);
        mPlayIncorrect= new MediaPlayer().create(this, R.raw.incorrect_ans);
        mPlayDramatic= new MediaPlayer().create(this, R.raw.dramatic_tone);
        mPlayPhoneAFriend= new MediaPlayer().create(this, R.raw.phone_a_friend);
        mPlayHooter= new MediaPlayer().create(this, R.raw.hooter);
    }


    public void playSound(MediaPlayer sound,String toastMessage) {
        try {
            stopAllMediaPlayback();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sound.start();
        Toast.makeText(this,toastMessage,Toast.LENGTH_SHORT).show();
    }

    void stopAllMediaPlayback() throws IOException {

        mPlayIntro1.stop();
        mPlayIntro1.prepare();
        //mPlayIntro1.

        mPlayIntro2.stop();
        mPlayIntro2.prepare();


        mPlayNextQuestion.stop();
        mPlayNextQuestion.prepare();


        mPlaySuspense1.stop();
        mPlaySuspense1.prepare();

        mPlaySuspense2.stop();
        mPlaySuspense2.prepare();

        mPlaySuspense3.stop();
        mPlaySuspense3.prepare();

        mPlaySuspense4.stop();
        mPlaySuspense4.prepare();

        mPlayLock.stop();
        mPlayLock.prepare();

       // mPlayIncorrect.seekTo(mPlayCorrect.seekTo(length));

        mPlayDramatic.stop();
        mPlayDramatic.prepare();

        mPlayPhoneAFriend.stop();
        mPlayPhoneAFriend.prepare();

        mPlayHooter.stop();
        mPlayHooter.prepare();


    }

    void CleanMediaPlayerObject () {

        mPlayIntro1.release();
        mPlayIntro2.release();
        mPlayNextQuestion.release();
        mPlaySuspense1.release();
        mPlaySuspense2.release();
        mPlaySuspense3.release();
        mPlaySuspense4.release();
        mPlayLock.release();
        //mPlayCorrect.release();
        mPlayIncorrect.release();
        mPlayDramatic.release();
        mPlayPhoneAFriend.release();
        mPlayHooter.release();


        mPlayIntro1=null;
        mPlayIntro2=null;
        mPlayNextQuestion=null;
        mPlaySuspense1=null;
        mPlaySuspense2=null;
        mPlaySuspense3=null;
        mPlaySuspense4=null;
        mPlayLock=null;
        //mPlayCorrect = null;
        mPlayIncorrect=null;
        mPlayDramatic=null;
        mPlayPhoneAFriend=null;
        mPlayHooter=null;
    }



}//main activity class

