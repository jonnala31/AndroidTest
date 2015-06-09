package com.androidbegin.splashtutorial;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class video extends Activity{
	
	 private VideoView mVideoView;
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.firstpage);
	        
	        mVideoView = (VideoView) findViewById(R.id.surface_view);
	        mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.mvideo));
	      
	        MediaController controller=new MediaController(this);
	        mVideoView.setMediaController(controller);
	        controller.setVisibility(View.INVISIBLE);
	       // mVideoView.
	        mVideoView.start();
	        //mVideoView.requestFocus();
	        
	        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
	            public void onCompletion(MediaPlayer mp) {
//	                Intent i = new Intent(getBaseContext(),
//	                        com.PlayerOrange.ViewPlaylist.class);
//	                i.putExtra("id", idPlaylist);
//	                i.putExtra("timer", timer);
//	                startActivity(i);
//	                finish(); 
	            	Intent myIntent = new Intent(video.this,
							MainActivity.class);
					startActivity(myIntent);
	            	Log.i("finish", "finish");
	            	//Toast.makeText(getApplicationContext(), "hhhh", 3000).show();
	                }
	          });
	        }
	  }