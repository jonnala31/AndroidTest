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
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ConfusingQuestion extends Activity implements OnClickListener {
	boolean one=false,two=false,three=false,four=false;
	TextView image, image1, image2, image4;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		   if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_XLARGE) == Configuration.SCREENLAYOUT_SIZE_XLARGE) {     
//	        	setContentView(R.layout.confuse);
//	        	//Toast.makeText(this, "Large screen",3000).show();
//	        	Log.i("screen", "it is big");
//
//	        }
//	        else  {  
//	        	setContentView(R.layout.confuse_small);
//	          //  Toast.makeText(this, "Normal sized screen" , Toast.LENGTH_LONG).show();
//	        	Log.i("screen", "it is small" );
//	        
//	        } 
		setContentView(R.layout.confuse); 
		//setContentView(R.layout.confuse);
		 one=false;
		 two=false;
		 three=false;
		 four=false;
		  TextView qText=(TextView)findViewById(R.id.textView1);
	        qText.setText("Click on the material from hard to soft ");
	        qText.setTextAppearance(getApplicationContext(), R.style.boldText);
	       // qText.setBackgroundResource(R.color.highlightedTextViewColor);
	        qText.setTextColor(Color.BLACK);
	        qText.setGravity(Gravity.CENTER);
	        Animation a4 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
	    	a4.reset();
	    	
	    	//TextView tv4=(TextView)findViewById(R.id.text3);
	    	//tv.setText("RAM");
	    
	         image = (TextView) findViewById(R.id.textView2d);
	         image.setOnClickListener( this);
	         image1 = (TextView) findViewById(R.id.textView3e);
	         image1.setOnClickListener(this);
			//image1.setImageBitmap(null);
			
	         image2 = (TextView) findViewById(R.id.textView4p);
	         image2.setOnClickListener(this);
			//image2.setImageBitmap(null);
		
	         image4 = (TextView) findViewById(R.id.textView5c);
	         image4.setOnClickListener(this);
	         
	    	qText.clearAnimation();
	    	qText.setVisibility(View.VISIBLE);
	    	qText.startAnimation(a4); 
	            
	    
	    	
	    	//TextView tv4=(TextView)findViewById(R.id.text3);
	    	//tv.setText("RAM");
	    	//qText.clearAnimation();
	    //	qText.setVisibility(View.VISIBLE);
	    //	qText.startAnimation(a4);  
	   
	    	 Animation a3 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		    	a3.reset();
		    	
		    	//TextView tv4=(TextView)findViewById(R.id.text3);
		    	//tv.setText("RAM");
             image4.clearAnimation();
             image4.setVisibility(View.VISIBLE);
		    	image4.startAnimation(a3);  
	    	
	    	   Animation a = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		    	a.reset();
		    	
		    	//TextView tv4=(TextView)findViewById(R.id.text3);
		    	//tv.setText("RAM");
                image.clearAnimation();
                image.setVisibility(View.VISIBLE);
		    	image.startAnimation(a);  
		    	  Animation a1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
			    	a1.reset();
			    	
			    	//TextView tv4=(TextView)findViewById(R.id.text3);
			    	//tv.setText("RAM");
	                image1.clearAnimation();
	                image1.setVisibility(View.VISIBLE);
			    	image1.startAnimation(a1);  
			    	
			  	  Animation a2 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
			    	a2.reset();
			    	
			    	//TextView tv4=(TextView)findViewById(R.id.text3);
			    	//tv.setText("RAM");
	                image2.clearAnimation();
	                image2.setVisibility(View.VISIBLE);
			    	image2.startAnimation(a2); 
	}
	
	public void onClick(View v) {
		
		
		switch (v.getId()){
		case R.id.textView3e :
			if(!two&&!three){
				one=true;
				  image1.setVisibility(View.INVISIBLE);
				
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
							Intent myIntent = new Intent(ConfusingQuestion.this,
									MainActivity.class);
							startActivity(myIntent);
							
					//		overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
						}
					};
					
					// Start the timer 
					RunSplash.schedule(ShowSplash, 1000);
				//	finish();
				 
//				 Intent myntent = new Intent(ConfusingQuestion.this,
//							MainActivity.class);
//					startActivity(myntent);
//					
//					overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
			}
			
	
	
			break;
			
		case R.id.textView2d : 
			if(one&&!three){
				two=true;
				 image.setVisibility(View.INVISIBLE);
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
							Intent myIntent = new Intent(ConfusingQuestion.this,
									MainActivity.class);
							startActivity(myIntent);
							
						//	overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
						}
					};
					
					// Start the timer 
					RunSplash.schedule(ShowSplash, 1000);
				//	finish();
//				 Intent myntent = new Intent(ConfusingQuestion.this,
//							MainActivity.class);
//					startActivity(myntent);
//					
//					overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
			}
			break;
	
		case R.id.textView5c:
			if(one&&two){
				three=true;
				 image4.setVisibility(View.INVISIBLE);
				// Toast.makeText(ConfusingQuestion.this, "success", 2000).show();
				
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
							Intent myIntent = new Intent(ConfusingQuestion.this,
									MainActivity.class);
							startActivity(myIntent);
							
					//		overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
						}
					};
					
					// Start the timer 
					RunSplash.schedule(ShowSplash, 1000);
				//	finish();
//				 Intent myntent = new Intent(ConfusingQuestion.this,
//							MainActivity.class);
//					startActivity(myntent);
//					
//					overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
				//Toast.makeText(ConfusingQuestion.this, "wrong", 2000).show();
				
			}
			break;
		
		case R.id.textView4p:
			if(one&&two&&three){
				 image2.setVisibility(View.INVISIBLE);
				Intent myIntent = new Intent(ConfusingQuestion.this,
						three.class);
				startActivity(myIntent);
				
				//overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				
			//	finish();
				//Toast.makeText(ConfusingQuestion.this, "success", 2000).show();
				
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
							Intent myIntent = new Intent(ConfusingQuestion.this,
									MainActivity.class);
							startActivity(myIntent);
							
				//			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
						}
					};
					
					// Start the timer 
					RunSplash.schedule(ShowSplash, 1000);
				//	finish();
//				 Intent myntent = new Intent(ConfusingQuestion.this,
//							MainActivity.class);
//					startActivity(myntent);
//					
//					overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
				//Toast.makeText(ConfusingQuestion.this, "wrong", 2000).show();
				
			}
			 one=false;
			 two=false;
			 three=false;
			 four=false;
			break;
		}
		
	}
		
	
}
