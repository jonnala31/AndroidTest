package com.androidbegin.splashtutorial;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Four extends Activity implements OnClickListener {
static int fourcount;
	public Four() {
		// TODO Auto-generated constructor stub
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    // TODO Auto-generated method stub
	    
	    setContentView(R.layout.four);
	    fourcount=0;
	       // setContentView(R.layout.choiceforimg);
	        TextView qText=(TextView)findViewById(R.id.textView1);
	     //   qText.setText("Click on incisive tooth ?");
	        qText.setTextAppearance(getApplicationContext(), R.style.boldText);
	        qText.setTextColor(Color.BLACK);
	        Animation a4 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
	    	a4.reset();
	    	
	    	//TextView tv4=(TextView)findViewById(R.id.text3);
	    	//tv.setText("RAM");
	    	qText.clearAnimation();
	    	qText.setVisibility(View.VISIBLE);
	    	qText.startAnimation(a4); 
	       // qText.setBackgroundResource(R.color.highlightedTextViewColor);
	        qText.setGravity(Gravity.CENTER);
	    	ImageView img = (ImageView) findViewById(R.id.imageView1);
	    	img.setOnClickListener(this);
	     	ImageView img1 = (ImageView) findViewById(R.id.imageView2);
	    	img1.setOnClickListener(this);
	    	ImageView img2 = (ImageView) findViewById(R.id.imageView3);
	    	img2.setOnClickListener(this);
		
	    	
	    	
	    	 Animation a = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		    	a.reset();
		    	
		    	//TextView tv4=(TextView)findViewById(R.id.text3);
		    	//tv.setText("RAM");
	         img.clearAnimation();
	         img.setVisibility(View.VISIBLE);
		    	img.startAnimation(a);  
		    	  Animation a1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
			    	a1.reset();
			    	
			    	//TextView tv4=(TextView)findViewById(R.id.text3);
			    	//tv.setText("RAM");
			    	img1.clearAnimation();
			    	img1.setVisibility(View.VISIBLE);
			    	img1.startAnimation(a1);  
			    	
			  	  Animation a2 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
			    	a2.reset();
			    	
			    	//TextView tv4=(TextView)findViewById(R.id.text3);
			    	//tv.setText("RAM");
			    	img2.clearAnimation();
			    	img2.setVisibility(View.VISIBLE);
			    	img2.startAnimation(a2); 
	    	
	    
	    
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.imageView1 :
			 setContentView(R.layout.looser);
			 Timer RunSplash = new Timer();

				// Task to do when the timer ends
				TimerTask ShowSplash = new TimerTask() {
					@Override
					public void run() {
						// Close SplashScreenActivity.class
						finish();
						
						// Start MainActivity.class
						Intent myIntent = new Intent(Four.this,
								MainActivity.class);
						startActivity(myIntent);
						
					//	overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
					}
				};
				
				// Start the timer 
				RunSplash.schedule(ShowSplash, 1000);
				//finish();
	
			 // setContentView(R.layout.multiselect);
//			Intent myntent = new Intent(choiceforImg.this,
//					MainActivity.class);
//			startActivity(myntent);
//			
//			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
			break;
			
		case R.id.imageView3:
			 setContentView(R.layout.looser);
			 Timer RunSplash1 = new Timer();

				// Task to do when the timer ends
				TimerTask ShowSplash1 = new TimerTask() {
					@Override
					public void run() {
						// Close SplashScreenActivity.class
						finish();
						
						// Start MainActivity.class
						Intent myIntent = new Intent(Four.this,
								MainActivity.class);
						startActivity(myIntent);
						
					//	overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
					}
				};
				
				// Start the timer 
				RunSplash1.schedule(ShowSplash1, 1000);
				//finish();
//			Intent myntent1 = new Intent(choiceforImg.this,
//					MainActivity.class);
//			startActivity(myntent1);
//			
//			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
		   // setContentView(R.layout.rules);
			break;
			
		case R.id.imageView2 :
			fourcount++;
			if(fourcount==3){
				fourcount=0;
		   // setContentView(R.layout.settings);
			Intent myIntent = new Intent(Four.this,
					five.class);
			startActivity(myIntent);
			}
		//	overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
		//	finish();
			break;
			
		
		}

	}

}
