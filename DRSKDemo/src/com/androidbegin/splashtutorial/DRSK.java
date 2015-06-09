package com.androidbegin.splashtutorial;

import java.util.Timer;
import java.util.TimerTask;









import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DRSK extends Activity {

	// Set Duration of the Splash Screen
	long Delay = 6000;
	static boolean play=true;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Remove the Title Bar
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		// Get the view from splash_screen.xml
		setContentView(R.layout.splash_screen);
		play=false;
		if(play){
		 SoundManager.getInstance();
		    SoundManager.initSounds(this.getApplicationContext());
		 SoundManager.addMusic(R.raw.drskbgsong);
		    SoundManager.playMusic(true);
		    play=false;
		}
		ProgressBar pb=(ProgressBar)findViewById(R.id.ProgressBar);
		pb.setVisibility(View.INVISIBLE);
		Animation a = AnimationUtils.loadAnimation(this, R.anim.left);
    	a.reset();
    	ImageView img=(ImageView)findViewById(R.id.LogoImage);
    	img.clearAnimation();
    //	img.
    	img.startAnimation(a);
    	Animation aa = AnimationUtils.loadAnimation(this, R.anim.right);
    	aa.reset();	
    	TextView tv=(TextView)findViewById(R.id.textView1);    	
    	//tv.clearAnimation();
    	tv.startAnimation(aa);
    	  final Handler mHandler = new Handler();
    	runOnUiThread(new Runnable() {

            public void run() {
            	mHandler.postDelayed(new Runnable() {
                public void run() {
                   // exitCount = 0;
                  //  Log.d("exitCount", "exitCount: " + exitCount);
				ProgressBar pb=(ProgressBar)findViewById(R.id.ProgressBar);
				pb.setVisibility(View.VISIBLE);
                	
                }
            }, 2600);
            }
        });
    	
//    	SplashScreenActivity.this.runOnUiThread(new Runnable() {
//
//    	        public void run() {
//    	        //    Toast.makeText(MainActivity.this, "This is Toast!!!", Toast.LENGTH_SHORT).show();
////    	        	try {
////						//Thread.sleep(4000);
////						ProgressBar pb=(ProgressBar)findViewById(R.id.ProgressBar);
////						pb.setVisibility(View.VISIBLE);
////					} catch (InterruptedException e) {
////						// TODO Auto-generated catch block
////						e.printStackTrace();
////					}
//    	        }
//    	    });
    	 // Handler mHandler = new Handler();
    	
		// Create a Timer
		Timer RunSplash = new Timer();

		// Task to do when the timer ends
		TimerTask ShowSplash = new TimerTask() {
			@Override
			public void run() {
				// Close SplashScreenActivity.class
			
				
				// Start MainActivity.class
//				Intent myIntent = new Intent(DRSK.this,
//						MainActivity.class);
				Intent myIntent = new Intent(DRSK.this,
						video.class);
				startActivity(myIntent);
				
				overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
			}
		};
		
		// Start the timer 
		RunSplash.schedule(ShowSplash, Delay); 
	}

	// Not using options menu for this tutorial
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
  @Override
  public void onDestroy() {
      // TODO Auto-generated method stub
  	 SoundManager.stopMusic();
  	 DRSK.play=true;
  	 Setting.mute=false;
  	super.onDestroy();
      
  }
}
