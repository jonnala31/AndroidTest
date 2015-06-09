package com.androidbegin.splashtutorial;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class complete extends Activity implements OnClickListener {

	public complete() {
		// TODO Auto-generated constructor stub
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    // TODO Auto-generated method stub
	    
	    setContentView(R.layout.complete);
    
	    
	    TextView com = (TextView) findViewById(R.id.textViewcomplete);
		com.setTextAppearance(getApplicationContext(), R.style.boldText);
		com.setTextColor(Color.BLACK);
		Animation a2 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
    	a2.reset();
    	
    	
    	com.clearAnimation();
    	com.setVisibility(View.VISIBLE);
    	com.startAnimation(a2);
	    
		TextView playagn = (TextView) findViewById(R.id.textViewagn);
		playagn.setOnClickListener(this);
		playagn.setTextColor(Color.BLACK);

		
		Animation a1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
    	a1.reset();
    	

    	playagn.clearAnimation();
    	playagn.setVisibility(View.VISIBLE);
    	playagn.startAnimation(a1);
    	
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.textViewagn :
			   // setContentView(R.layout.settings);
				Intent myIntent = new Intent(complete.this,
						choiceforImg.class);
				startActivity(myIntent);
				
			
				break;
		}
		}
		
	

}
