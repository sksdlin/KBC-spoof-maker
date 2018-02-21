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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

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

        MobileAds.initialize(this, "ca-app-pub-7498702078465081~3837704630");
        AdView mAdView = (findViewById(R.id.adView));
        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);

        StartMediaPlayer();

        ibIntro1 = findViewById(R.id.ibIntro1);
        ibIntro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayIntro1();
            }
        });

        ibIntro2 = findViewById(R.id.ibIntro2);
        ibIntro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayIntro2();
            }
        });

        ibNextQuestion = findViewById(R.id.ibNextAnswer);
        ibNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               PlayNextQuestion();
            }
        });
        ibSuspense1 = findViewById(R.id.ibSuspense1);
        ibSuspense1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlaySuspense1();
            }
        });

        ibSuspense2 = findViewById(R.id.ibSuspense2);
        ibSuspense2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlaySuspense2();
            }
        });

        ibSuspense3 = findViewById(R.id.ibSuspense3);
        ibSuspense3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlaySuspense3();
            }
        });



        ibSuspense4 = findViewById(R.id.ibSuspense4);
        ibSuspense4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlaySuspense4();
            }
        });



        ibLock = findViewById(R.id.ibLock);
        ibLock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayLock();
            }
        });
        //ibCorrect = (ImageButton)findViewById(R.id.ibCorrect);
        ibIncorrect= findViewById(R.id.ibIncorrectAns);
        ibIncorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayIncorrect();
            }
        });

        ibDramatic = findViewById(R.id.ibDramaticTone);
        ibDramatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayDramatic();
            }
        });
        ibPhoneAFriend =findViewById(R.id.ibPhoneAFriend);
        ibPhoneAFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayPhoneAFriend();
            }
        });

        ibHooter = findViewById(R.id.ibHooter);
        ibHooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayHooter();
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
        StartMediaPlayer();

    }

    @Override
    protected void onResume() {
        super.onResume();
        StartMediaPlayer();
    }

    public void StartMediaPlayer() {
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

    public void PlayIntro1(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlayIntro1.seekTo(0);
            mPlayIntro1.start();
            Toast.makeText(this,"Introduction 1.",Toast.LENGTH_SHORT).show();
        }
        else{
            mPlayIntro1.seekTo(0);
            mPlayIntro1.start();
            Toast.makeText(this,"Introduction 1.",Toast.LENGTH_SHORT).show();

        }

    }


    public void PlayIntro2(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlayIntro2.seekTo(0);
            mPlayIntro2.start();
            Toast.makeText(this,"Introduction 2.",Toast.LENGTH_SHORT).show();
        }
       else{
            mPlayIntro2.seekTo(0);
            mPlayIntro2.start();
            Toast.makeText(this,"Introduction 2.",Toast.LENGTH_SHORT).show();

        }


    }

    public void PlayNextQuestion(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlayNextQuestion.seekTo(0);
            mPlayNextQuestion.start();
            Toast.makeText(this,"Next Question.",Toast.LENGTH_SHORT).show();
        }
        else{
            mPlayNextQuestion.seekTo(0);
            mPlayNextQuestion.start();
            Toast.makeText(this,"Next Question.",Toast.LENGTH_SHORT).show();


        }
    }

    public void PlaySuspense1(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlaySuspense1.seekTo(0);
            mPlaySuspense1.start();
            Toast.makeText(this,"Suspense 1",Toast.LENGTH_SHORT).show();

        } else {
            mPlaySuspense1.seekTo(0);
            mPlaySuspense1.start();
            Toast.makeText(this,"Suspense 1",Toast.LENGTH_SHORT).show();
        }

        /*
        if(!mPlaySuspense1.isPlaying()){
            mPlaySuspense1.start();
            Toast.makeText(this,"Suspense 1",Toast.LENGTH_SHORT).show();
        }else{
            mPlaySuspense1.seekTo(0);

        }
        */
    }

    public void PlaySuspense2(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlaySuspense2.seekTo(0);
            mPlaySuspense2.start();
            Toast.makeText(this,"Suspense 2",Toast.LENGTH_SHORT).show();

        } else {
            mPlaySuspense2.seekTo(0);
            mPlaySuspense2.start();
            Toast.makeText(this,"Suspense 2",Toast.LENGTH_SHORT).show();
        }
/*
        if(!mPlaySuspense2.isPlaying()){
            mPlaySuspense2.start();
            Toast.makeText(this,"Suspense 2",Toast.LENGTH_SHORT).show();
        }else{
            mPlaySuspense2.seekTo(0);

        }
        */
    }

    public void PlaySuspense3(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlaySuspense3.seekTo(0);
            mPlaySuspense3.start();
            Toast.makeText(this,"Suspense 3",Toast.LENGTH_SHORT).show();
        }else{
            mPlaySuspense3.seekTo(0);
            mPlaySuspense3.start();
            Toast.makeText(this,"Suspense 3",Toast.LENGTH_SHORT).show();
        }

    }

    public void PlaySuspense4(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlaySuspense4.seekTo(0);
            mPlaySuspense4.start();
            Toast.makeText(this,"Suspense 4",Toast.LENGTH_SHORT).show();
        } else {
            mPlaySuspense4.seekTo(0);
            mPlaySuspense4.start();
            Toast.makeText(this,"Suspense 4",Toast.LENGTH_SHORT).show();
        }


    }


    public void PlayLock(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlayLock.seekTo(0);
            mPlayLock.start();
            Toast.makeText(this,"Lock The Answer",Toast.LENGTH_SHORT).show();
        }else{
            mPlayLock.seekTo(0);
            mPlayLock.start();
            Toast.makeText(this,"Lock The Answer.",Toast.LENGTH_SHORT).show();
        }


    }


/*
    public void PlayCorrect(){

        mPlay = new MediaPlayer().create(this,R.raw.);
        mPlay.start();
        Toast.makeText(this,"Introduction 1.",Toast.LENGTH_SHORT).show();

    }
    */


    public void PlayIncorrect(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlayIncorrect.seekTo(0);
            mPlayIncorrect.start();
            Toast.makeText(this,"Incorrect Answer.",Toast.LENGTH_SHORT).show();
        }else{
            mPlayIncorrect.seekTo(0);
            mPlayIncorrect.start();
            Toast.makeText(this,"Incorrect Answer.",Toast.LENGTH_SHORT).show();
        }



    }


    public void PlayDramatic(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlayDramatic.seekTo(0);
            mPlayDramatic.start();
            Toast.makeText(this,"Dramatic Tone.",Toast.LENGTH_SHORT).show();
        } else {
            mPlayDramatic.seekTo(0);
            mPlayDramatic.start();
            Toast.makeText(this,"Dramatic Tone.",Toast.LENGTH_SHORT).show();
        }


    }

    public void PlayPhoneAFriend(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlayPhoneAFriend.seekTo(0);
            mPlayPhoneAFriend.start();
            Toast.makeText(this,"Phone A Friend.",Toast.LENGTH_SHORT).show();
        } else {
            mPlayPhoneAFriend.seekTo(0);
            mPlayPhoneAFriend.start();
            Toast.makeText(this,"Phone A Friend.",Toast.LENGTH_SHORT).show();
        }

    }

    public void PlayHooter(){
        if (IsAnyMediaPlaying()){
            StopAllMediaPlayback();
            mPlayHooter.seekTo(0);
            mPlayHooter.start();
            Toast.makeText(this,"Hooter.",Toast.LENGTH_SHORT).show();
        } else {
            mPlayHooter.seekTo(0);
            mPlayHooter.start();
            Toast.makeText(this,"Hooter.",Toast.LENGTH_SHORT).show();
        }



    }

    boolean IsAnyMediaPlaying (){
        return mPlayIntro1.isPlaying() || mPlayIntro2.isPlaying() ||
                mPlayNextQuestion.isPlaying() ||
                mPlaySuspense1.isPlaying() || mPlaySuspense2.isPlaying() ||
                mPlaySuspense3.isPlaying() || mPlaySuspense4.isPlaying() ||
                mPlayLock.isPlaying() || mPlayIncorrect.isPlaying() ||
                mPlayDramatic.isPlaying() || mPlayPhoneAFriend.isPlaying() || mPlayHooter.isPlaying();
    }

    void StopAllMediaPlayback(){
        int length;

        length = mPlayIntro1.getDuration();
        mPlayIntro1.seekTo(length);

        length = mPlayIntro2.getDuration();
        mPlayIntro2.seekTo(length);

        length = mPlayNextQuestion.getDuration();
        mPlayNextQuestion.seekTo(length);

        length = mPlaySuspense1.getDuration();
        mPlaySuspense1.seekTo(length);

        length = mPlaySuspense2.getDuration();
        mPlaySuspense2.seekTo(length);

        length = mPlaySuspense3.getDuration();
        mPlaySuspense3.seekTo(length);

        length = mPlaySuspense4.getDuration();
        mPlaySuspense4.seekTo(length);

        length = mPlayLock.getDuration();
        mPlayLock.seekTo(length);


        //mPlayCorrect.seekTo(length);
       // mPlayIncorrect.seekTo(length);

        length = mPlayDramatic.getDuration();
        mPlayDramatic.seekTo(length);


        length = mPlayPhoneAFriend.getDuration();
        mPlayPhoneAFriend.seekTo(length);

        length = mPlayHooter.getDuration();
        mPlayHooter.seekTo(length);


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

