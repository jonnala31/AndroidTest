package com.androidbegin.splashtutorial;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ansconfuse extends Activity {
	boolean one=false,two=false,three=false,four=false;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		   if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_XLARGE) == Configuration.SCREENLAYOUT_SIZE_XLARGE) {     
//    	setContentView(R.layout.confuse);
//    	
//    	//Toast.makeText(this, "Large screen",3000).show();
//    	Log.i("screen", "it is big");
//
//    }
//    else  {  
//    	setContentView(R.layout.confuse_small);
//      //  Toast.makeText(this, "Normal sized screen" , Toast.LENGTH_LONG).show();
//    	Log.i("screen", "it is small" );
//    
//    } 
		//Configuration.sc
		setContentView(R.layout.confuse_small);
		//setContentView(R.layout.confuse);
		ImageView image = (ImageView) findViewById(R.id.imageView1);
		image.setImageBitmap(null);
		image.setImageResource(R.drawable.a);
		ImageButton image1 = (ImageButton) findViewById(R.id.button1);
		//image1.setImageBitmap(null);
		image1.setBackgroundResource(R.drawable.b);
		ImageButton image2 = (ImageButton) findViewById(R.id.button2);
		//image2.setImageBitmap(null);
		image2.setBackgroundResource(R.drawable.c);
		ImageButton image4 = (ImageButton) findViewById(R.id.button3);
		//image4.setImageBitmap(null);
		image4.setVisibility(View.INVISIBLE);
	//image4.setBackgroundResource(R.drawable.d);
		 one=false;
		 two=false;
		 three=false;
		 four=false;
		  TextView qText=(TextView)findViewById(R.id.textView1);
	        qText.setText("Select the long to short  root canal");
	        qText.setTextAppearance(getApplicationContext(), R.style.boldText);
	       // qText.setBackgroundResource(R.color.highlightedTextViewColor);
	        qText.setGravity(Gravity.CENTER);
	        qText.setTextColor(Color.BLACK);
	        Animation a4 = AnimationUtils.loadAnimation(this, R.anim.rightside);
	    	a4.reset();
	    	
	    	//TextView tv4=(TextView)findViewById(R.id.text3);
	    	//tv.setText("RAM");
	    	qText.clearAnimation();
	    	qText.startAnimation(a4);  
	   
	    	   Animation a = AnimationUtils.loadAnimation(this, R.anim.left);
		    	a.reset();
		    	
		    	//TextView tv4=(TextView)findViewById(R.id.text3);
		    	//tv.setText("RAM");
                image.clearAnimation();
		    	image.startAnimation(a);  
		    	  Animation a1 = AnimationUtils.loadAnimation(this, R.anim.leftside);
			    	a1.reset();
			    	
			    	//TextView tv4=(TextView)findViewById(R.id.text3);
			    	//tv.setText("RAM");
	                image1.clearAnimation();
			    	image1.startAnimation(a1);  
			    	
			  	  Animation a2 = AnimationUtils.loadAnimation(this, R.anim.leftside);
			    	a2.reset();
			    	
			    	//TextView tv4=(TextView)findViewById(R.id.text3);
			    	//tv.setText("RAM");
	                image2.clearAnimation();
			    	image2.startAnimation(a2); 
		    	
	    	
	        
	}
	public void one(View v){
	if(!two&&three){
		one=true;
		ImageButton img=(ImageButton)findViewById(R.id.button1);
		img.setVisibility(View.INVISIBLE);
	}else{
		QuestionActivity.counter=0;
		//Toast.makeText(ConfusingQuestion.this, "wrong", 2000).show();
		 one=false;
		 two=false;
		 three=false;
		 four=false;
		 setContentView(R.layout.looser);
		 Timer RunSplash = new Timer();

			// Task to do when the timer ends
			TimerTask ShowSplash = new TimerTask() {
				@Override
				public void run() {
					// Close SplashScreenActivity.class
					finish();
					
					// Start MainActivity.class
					Intent myIntent = new Intent(ansconfuse.this,
							MainActivity.class);
					startActivity(myIntent);
					
					overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
				}
			};
			
			// Start the timer 
			RunSplash.schedule(ShowSplash, 1000);
		 
//		 Intent myntent = new Intent(ansconfuse.this,
//					MainActivity.class);
//			startActivity(myntent);
//			
//			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
	}
	
	//Toast.makeText(Start.this,l+" :"+t, 2000).show();
	
//	ImageButton button = (ImageButton)findViewById(R.id.button2);
//	ImageButton button1 = (ImageButton)findViewById(R.id.button1);
//	int l=button.getLeft();
//	int t=button.getTop();
//	int l1=button1.getLeft();
//	int t1=button1.getTop();
//	RelativeLayout.LayoutParams absParams = 
//	    (RelativeLayout.LayoutParams)button.getLayoutParams();
//	RelativeLayout.LayoutParams absParams1 = 
//		    (RelativeLayout.LayoutParams)button1.getLayoutParams();
//	absParams.leftMargin = l1;
//	absParams.topMargin = t1;
//	absParams1.leftMargin = l;
//	absParams1.topMargin = t;
//button1.setLayoutParams(absParams1);
//	button.setLayoutParams(absParams);
	
		
	}
	public void two(View v){
	if(one&&three){
		two=true;
		Intent myIntent = new Intent(ansconfuse.this,
				QuestionActivity.class);
		startActivity(myIntent);
		
		overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				
		finish();
	}else{
		QuestionActivity.counter=0;
		//Toast.makeText(ConfusingQuestion.this, "wrong", 2000).show();
		 one=false;
		 two=false;
		 three=false;
		 four=false;
		 setContentView(R.layout.looser);
		 Timer RunSplash = new Timer();

			// Task to do when the timer ends
			TimerTask ShowSplash = new TimerTask() {
				@Override
				public void run() {
					// Close SplashScreenActivity.class
					finish();
					
					// Start MainActivity.class
					Intent myIntent = new Intent(ansconfuse.this,
							MainActivity.class);
					startActivity(myIntent);
					
					overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
				}
			};
			
			// Start the timer 
			RunSplash.schedule(ShowSplash, 1000);
//		 Intent myntent = new Intent(ansconfuse.this,
//					MainActivity.class);
//			startActivity(myntent);
//			
//			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
	}
//	int l=v.getLeft();
//	int t=v.getTop();
	
	//Toast.makeText(Start.this,l+" :"+t, 2000).show();
	}
	public void three(View v){
	if(one&&two){
		three=true;
		Intent myIntent = new Intent(ansconfuse.this,
				QuestionActivity.class);
		startActivity(myIntent);
		
		overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				
		// Toast.makeText(ConfusingQuestion.this, "success", 2000).show();
		finish();
	}else{
		QuestionActivity.counter=0;
		 one=false;
		 two=false;
		 three=false;
		 four=false;
		 setContentView(R.layout.looser);
		 Timer RunSplash = new Timer();

			// Task to do when the timer ends
			TimerTask ShowSplash = new TimerTask() {
				@Override
				public void run() {
					// Close SplashScreenActivity.class
					finish();
					
					// Start MainActivity.class
					Intent myIntent = new Intent(ansconfuse.this,
							MainActivity.class);
					startActivity(myIntent);
					
					overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
				}
			};
			
			// Start the timer 
			RunSplash.schedule(ShowSplash, 1000);
//		 Intent myntent = new Intent(ansconfuse.this,
//					MainActivity.class);
//			startActivity(myntent);
//			
//			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
		//Toast.makeText(ConfusingQuestion.this, "wrong", 2000).show();
		
	}
	 one=false;
	 two=false;
	 three=false;
		
	}
	public void four(View v){
		if(!three){
			three=true;
			
			// Toast.makeText(ConfusingQuestion.this, "success", 2000).show();
			
		}else{
			QuestionActivity.counter=0;
		 setContentView(R.layout.looser);
		 Timer RunSplash = new Timer();

			// Task to do when the timer ends
			TimerTask ShowSplash = new TimerTask() {
				@Override
				public void run() {
					// Close SplashScreenActivity.class
					finish();
					
					// Start MainActivity.class
					Intent myIntent = new Intent(ansconfuse.this,
							MainActivity.class);
					startActivity(myIntent);
					
					overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
				}
			};
			
			// Start the timer 
			RunSplash.schedule(ShowSplash, 1000);
		}
//		Intent myntent = new Intent(ansconfuse.this,
//				MainActivity.class);
//		startActivity(myntent);
//		
//		overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
		
//		if(one&&two&&three){
//			Intent myIntent = new Intent(ansconfuse.this,
//					QuestionActivity.class);
//			startActivity(myIntent);
//			
//			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				
//			 //Toast.makeText(ConfusingQuestion.this, "success", 2000).show();
//			
//		}else{
//			
//			 one=false;
//			 two=false;
//			 three=false;
//			 four=false;
//			 Intent myntent = new Intent(ansconfuse.this,
//						MainActivity.class);
//				startActivity(myntent);
//				
//				overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
//			//Toast.makeText(ConfusingQuestion.this, "wrong", 2000).show();
//			
//		}
		
			
		}
		
	
}
