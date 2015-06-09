package com.androidbegin.splashtutorial;



import java.util.List;






import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener {
	ToggleButton toggleButton1;
	static boolean status=false;
	View v = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Answers.round=0;
		OptionsMulti.round=0;
		GamePlay.round=0;
	
		
		toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
		toggleButton1.setOnClickListener(this);
if(status==true){

	toggleButton1.setChecked(true);
			
		}
else{

	toggleButton1.setChecked(false);
}
    	//////////////////////////////////////////////////////////////////////
		//////// GAME MENU  /////////////////////////////////////////////////
		TextView playBtn = (TextView) findViewById(R.id.playBtn);
		//TextView settingBtn = (TextView) findViewById(R.id.settingsBtn);
	//	settingBtn.setOnClickListener(this);
		playBtn.setOnClickListener(this);
		playBtn.setTextColor(Color.BLACK);
	//	Button settingsBtn = (Button) findViewById(R.id.settingsBtn);
	//	settingsBtn.setOnClickListener(this);
	//	Button rulesBtn = (Button) findViewById(R.id.rulesBtn);
	//	rulesBtn.setOnClickListener(this);
		TextView exitBtn = (TextView) findViewById(R.id.exitBtn);
		exitBtn.setOnClickListener(this);
		exitBtn.setTextColor(Color.BLACK);
		Animation a1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
    	a1.reset();
    	

    	playBtn.clearAnimation();
    	playBtn.setVisibility(View.VISIBLE);
    	playBtn.startAnimation(a1);
    	Animation a2 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
    	a2.reset();
    	exitBtn.clearAnimation();
    	exitBtn.setVisibility(View.VISIBLE);
    	exitBtn.startAnimation(a2);
    	
    	Animation a3 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
    	a3.reset();
    	//settingBtn.clearAnimation();
    	//settingBtn.setVisibility(View.VISIBLE);
    	//settingBtn.startAnimation(a3);
    	//TextView tv2=(TextView)findViewById(R.id.);
    	//tv.setText("RAM");
    	//settingsBtn.clearAnimation();
    	//settingsBtn.startAnimation(a2);
    	
    //	Animation a3 = AnimationUtils.loadAnimation(this, R.anim.leftside);
    //	a3.reset();
    	
    	//TextView tv3=(TextView)findViewById(R.id.text6);
    	//tv.setText("RAM");
    //	rulesBtn.clearAnimation();
    //	rulesBtn.startAnimation(a3);
    	
    //	Animation a4 = AnimationUtils.loadAnimation(this, R.anim.rightside);
    //	a4.reset();
    	
    	//TextView tv4=(TextView)findViewById(R.id.text3);
    	//tv.setText("RAM");
    	
		
		
		
    }
    public void onClick(View v) {
		Intent i;
		
		switch (v.getId()){
		case R.id.playBtn :
		
	
			 // setContentView(R.layout.multiselect);
			Intent myntent = new Intent(MainActivity.this,
					choiceforImg.class);
			startActivity(myntent);
			
		//	overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
		//	finish();
			break;
			
		case R.id.toggleButton1 : 
			if (toggleButton1.isChecked()) {
				status=true;
				 SoundManager.getInstance();
				    SoundManager.initSounds(this.getApplicationContext());
				 
				 SoundManager.addMusic(R.raw.drskbgsong);
				    SoundManager.playMusic(true);
				 
	        } else {
	        	status=false;
	        	 SoundManager.stopMusic();
	        
	        }
			break;
			
	/*	case R.id.settingsBtn :
		   // setContentView(R.layout.settings);
			Intent myIntent = new Intent(MainActivity.this,
					Setting.class);
			startActivity(myIntent);
			
			//overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
			//finish();
			break;
		*/
		case R.id.exitBtn :
			 SoundManager.stopMusic();
			 DRSK.play=true;
			 Setting.mute=false;
			 toggleButton1.setChecked(false);
			 Intent  intent = new Intent(Intent.ACTION_MAIN);
	            intent.addCategory(Intent.CATEGORY_HOME);
	            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	            startActivity(intent);
	            finish();
			 System.exit(0);
			break;
		}

	}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    
   
    
   
   
//    @Override
//    public void onDestroy() {
//        // TODO Auto-generated method stub
//    	 SoundManager.stopMusic();
//    	 DRSK.play=true;
//    	 Setting.mute=false;
//    	super.onDestroy();
//        
//    }
    
    
}
