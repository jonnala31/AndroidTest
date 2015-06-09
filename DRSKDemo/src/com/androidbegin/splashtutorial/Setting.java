package com.androidbegin.splashtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Setting extends Activity {
	
	public static boolean mute=false;
	static boolean checked=false;
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.soundsetting);
	        CheckBox cbox=(CheckBox)findViewById(R.id.checkBox1);     
	  if(!mute){
		  
		  cbox.setChecked(false);
	  }else{
		  
		  cbox.setChecked(true); 
	  }
	  }
	  public void soundb(View v){
		  
		  CheckBox cbox=(CheckBox)findViewById(R.id.checkBox1);
			 if(cbox.isChecked()){
				 SoundManager.stopMusic();
				 mute=true;
			 }else{
				 
				 SoundManager.getInstance();
				    SoundManager.initSounds(this.getApplicationContext());
				 
				 SoundManager.addMusic(R.raw.drskbgsong);
				    SoundManager.playMusic(true);
				    mute=false;
				// }
			 }
			 
	  }
	 public void soundControl(View v){
		 
		 CheckBox cbox=(CheckBox)findViewById(R.id.checkBox1);
		 if(cbox.isChecked()){
			 SoundManager.stopMusic();
			 mute=true;
		 }else{
			 if(mute){
			 SoundManager.getInstance();
			    SoundManager.initSounds(this.getApplicationContext());
			 
			 SoundManager.addMusic(R.raw.drskbgsong);
			    SoundManager.playMusic(true);
			    mute=false;
			 }
		 }
		 
	 } 

}
