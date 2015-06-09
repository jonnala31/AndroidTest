package com.androidbegin.splashtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FadeInActivity extends Activity implements AnimationListener {


	// Animation
	Animation animFadein;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fadein);
		ImageView image = (ImageView) findViewById(R.id.imageView1);

		// load the animation
		animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.fade_in);
		
		// set animation listener
		animFadein.setAnimationListener(this);
		image.setVisibility(View.VISIBLE);
		image.startAnimation(animFadein);

		
	}

	public void onAnimationEnd(Animation animation) {
		// Take any action after completing the animation

		// check for fade in animation
		if (animation == animFadein) {
			Toast.makeText(getApplicationContext(), "DRSK Quiz Menu",
					Toast.LENGTH_SHORT).show();
			Intent myIntent = new Intent(FadeInActivity.this,
					MainActivity.class);
			startActivity(myIntent);
			
		}

	}


	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}


	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	}

}
