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
import android.widget.TextView;

public class five extends Activity implements OnClickListener {
	TextView image, image1, image2;
	boolean one=false,two=false,three=false;
	public five() {
		// TODO Auto-generated constructor stub
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    // TODO Auto-generated method stub
	    
	    setContentView(R.layout.five); 
		//setContentView(R.layout.confuse);
		 one=false;
		 two=false;
		 three=false;
		 
		  TextView qText=(TextView)findViewById(R.id.textView1);
	      //  qText.setText("Click on the material from hard to soft ");
	        qText.setTextAppearance(getApplicationContext(), R.style.boldText);
	       // qText.setBackgroundResource(R.color.highlightedTextViewColor);
	        qText.setTextColor(Color.BLACK);
	        qText.setGravity(Gravity.CENTER);
	        Animation a4 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
	    	a4.reset();
	    	
	    	//TextView tv4=(TextView)findViewById(R.id.text3);
	    	//tv.setText("RAM");
	    
	         image = (TextView) findViewById(R.id.textViewMc);
	         image.setOnClickListener( this);
	         image1 = (TextView) findViewById(R.id.textViewM);
	         image1.setOnClickListener(this);
			//image1.setImageBitmap(null);
			
	         image2 = (TextView) findViewById(R.id.textViewMli);
	         image2.setOnClickListener(this);
			//image2.setImageBitmap(null);
		
	         
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
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.textViewMli:
			if(!two&&!one){
				three=true;
				  image2.setVisibility(View.INVISIBLE);
				
			}else{
				QuestionActivity.counter=0;
				//Toast.makeText(ConfusingQuestion.this, "wrong", 2000).show();
				 one=false;
				 two=false;
				 three=false;
				 
				 setContentView(R.layout.looser);
				 Timer RunSplash = new Timer();

					// Task to do when the timer ends
					TimerTask ShowSplash = new TimerTask() {
						@Override
						public void run() {
							// Close SplashScreenActivity.class
							finish();
							
							// Start MainActivity.class
							Intent myIntent = new Intent(five.this,
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
			
		case R.id.textViewMc : 
			if(three&&!two){
				one=true;
				 image.setVisibility(View.INVISIBLE);
			}else{
				QuestionActivity.counter=0;
				//Toast.makeText(ConfusingQuestion.this, "wrong", 2000).show();
				 one=false;
				 two=false;
				 three=false;
			
				 setContentView(R.layout.looser);
				 Timer RunSplash = new Timer();

					// Task to do when the timer ends
					TimerTask ShowSplash = new TimerTask() {
						@Override
						public void run() {
							// Close SplashScreenActivity.class
							finish();
							
							// Start MainActivity.class
							Intent myIntent = new Intent(five.this,
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
	
	
		
		case R.id.textViewM:
			if(one&&three){
				two=true;
				 image1.setVisibility(View.INVISIBLE);
				Intent myIntent = new Intent(five.this,
						six.class);
				startActivity(myIntent);
				
				//overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				
			//	finish();
				//Toast.makeText(ConfusingQuestion.this, "success", 2000).show();
				
			}else{
				QuestionActivity.counter=0;
				 one=false;
				 two=false;
				 three=false;
				 
				 setContentView(R.layout.looser);
				 Timer RunSplash = new Timer();

					// Task to do when the timer ends
					TimerTask ShowSplash = new TimerTask() {
						@Override
						public void run() {
							// Close SplashScreenActivity.class
							finish();
							
							// Start MainActivity.class
							Intent myIntent = new Intent(five.this,
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
		
			break;
		}
	}

}
