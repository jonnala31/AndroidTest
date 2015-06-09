/**
 * 
 */
package com.androidbegin.splashtutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;



/**
 * @author mohan
 *
 */
public class QuestionActivity extends Activity implements OnClickListener{

	private String currentQ,currentA;
	private GamePlay currentGame=new GamePlay();
	static int counter=0;
	int fontsize=25;
	//OptionsMulti
	String currenOptions;
	public static ArrayList<String> query=new ArrayList<String>();
	public static ArrayList<String>options=new ArrayList<String>();
	public static ArrayList<String>answers=new ArrayList<String>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_XLARGE) == Configuration.SCREENLAYOUT_SIZE_XLARGE) {     
//        	setContentView(R.layout.question);
//        	//Toast.makeText(this, "Large screen",3000).show();
//        	Log.i("screen", "it is big");
//
//        }
//        else  {  
//        	setContentView(R.layout.question_small);
//          //  Toast.makeText(this, "Normal sized screen" , Toast.LENGTH_LONG).show();
//        	Log.i("screen", "it is small" );
//        
//        } 
        setContentView(R.layout.question_small);
       // setContentView(R.layout.question);
        /**
         * Configure current game and get question
         */
        counter++;
        Log.i("counter", ""+counter);
        if(counter==3){
        	 Intent myntent = new Intent(this,
        			 ansconfuse.class);
 			startActivity(myntent);
 			
 			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
      finish();
      //counter=0;
        }
        else if(counter==5){
        	 Intent myntent = new Intent(this,
        			 MainActivity.class);
 			startActivity(myntent);
 			
 			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
 			finish();
       counter=0;
        }
        else{
       // if(query.size()>0){
   
        getQuestions();
        getOptions();
        getAnswers();
      //  }
        Answers.setQuestions(answers);
        OptionsMulti.setQuestions(options);
        currentGame.setQuestions(query);
        currentA=Answers.getNextQuestion();
        currenOptions=OptionsMulti.getNextQuestion().trim();
        currentQ = currentGame.getNextQuestion().trim();
        if(currentQ.trim().length()<=0||currentA.length()<=0||currenOptions.length()<=0){
        	 Intent myntent = new Intent(this,
        			 MainActivity.class);
 			startActivity(myntent);
 			
 			overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);				 
        }
		Button nextBtn = (Button) findViewById(R.id.nextBtn);
		nextBtn.setOnClickListener(this);
        
        /**
         * Update the question and answer options..
         */
        setQuestions();
        }
		
    }
   /* @Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		switch (keyCode)
		{
		case KeyEvent.KEYCODE_BACK :
			return true;
		}
		
		return super.onKeyDown(keyCode, event);
	}*/

	/**
	 * Method to set the text for the question and answers from the current games
	 * current question
	 */
	private void setQuestions() {
		//set the question text from current question
		String question = currentQ+ "?";
        TextView qText = (TextView) findViewById(R.id.question);
        qText.setText(question);
        String [] optionsmulti=currenOptions.split(",");
        
       qText.setTextAppearance(getApplicationContext(), R.style.boldText);
       // qText.setBackgroundResource(R.color.highlightedTextViewColor);
        qText.setGravity(Gravity.CENTER);
        Animation a4 = AnimationUtils.loadAnimation(this, R.anim.rightside);
  	    	a4.reset();
  	    	
  	    	//TextView tv4=(TextView)findViewById(R.id.text3);
  	    	//tv.setText("RAM");
  	    	qText.clearAnimation();
  	    	qText.startAnimation(a4);
  	    	qText.setTextColor(Color.BLACK);
        //set the available options
       // List<String> answers = currentQ.getQuestionOptions();
        if(optionsmulti.length>3){
        TextView option1 = (TextView) findViewById(R.id.answer1);
        option1.setText(optionsmulti[0]);
        option1.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontsize);
        TextView option2 = (TextView) findViewById(R.id.answer2); 
        option2.setText(optionsmulti[1]);
        option2.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontsize);
        TextView option3 = (TextView) findViewById(R.id.answer3);
        option3.setText(optionsmulti[2]);
        option3.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontsize);
        TextView option4 = (TextView) findViewById(R.id.answer4);
        option4.setText(optionsmulti[3]);
      
        option4.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontsize);
    	Animation a1 = AnimationUtils.loadAnimation(this, R.anim.leftside);
    	a1.reset();
    	

    	option1.clearAnimation();
    	option1.startAnimation(a1);
    	Animation a2 = AnimationUtils.loadAnimation(this, R.anim.rightside);
    	a2.reset();
    	
    	//TextView tv2=(TextView)findViewById(R.id.);
    	//tv.setText("RAM");
    	option2.clearAnimation();
    	option2.startAnimation(a2);
    	
    	Animation a3 = AnimationUtils.loadAnimation(this, R.anim.leftside);
    	a3.reset();
    	
    	//TextView tv3=(TextView)findViewById(R.id.text6);
    	//tv.setText("RAM");
    	option3.clearAnimation();
    	option3.startAnimation(a3);
    	
    	//Animation a4 = AnimationUtils.loadAnimation(this, R.anim.rightside);
    	a4.reset();
    	
    	//TextView tv4=(TextView)findViewById(R.id.text3);
    	//tv.setText("RAM");
    	option4.clearAnimation();
    	option4.startAnimation(a4);
        
        
        
        
        
        }
	
	
	}
    

	public void onClick(View arg0) {
		//Log.d("Questions", "Moving to next question");
		
		/**
		 * validate a checkbox has been selected
		 */
		if (!checkAnswer()) {
			QuestionActivity.counter=0;
			Answers.round=0;
			OptionsMulti.round=0;
			GamePlay.round=0;
			 setContentView(R.layout.looser);
			 Timer RunSplash = new Timer();

				// Task to do when the timer ends
				TimerTask ShowSplash = new TimerTask() {
					@Override
					public void run() {
						// Close SplashScreenActivity.class
						finish();
						
						// Start MainActivity.class
						Intent myIntent = new Intent(QuestionActivity.this,
								MainActivity.class);
						startActivity(myIntent);
						
						overridePendingTransition(R.anim.grow_fadein_center, R.anim.grow_fadein_center);			
						 
					}
				};
				
				// Start the timer 
				RunSplash.schedule(ShowSplash, 1000);
			finish();
			
		}else{
			
			Intent i = new Intent(this, QuestionActivity.class);
			startActivity(i);
			finish();
		}
		
//
//		
//		/**
//		 * check if end of game
//		 */
//		if (currentGame.isGameOver()){
//			//Log.d("Questions", "End of game! lets add up the scores..");
//			//Log.d("Questions", "Questions Correct: " + currentGame.getRight());
//			//Log.d("Questions", "Questions Wrong: " + currentGame.getWrong());
//			Intent i = new Intent(this, MainActivity.class);
//			startActivity(i);
//			finish();
//		}
		//else{
			
			//finish();
		//}
	}
	
	
	


	/**
	 * Check if a checkbox has been selected, and if it
	 * has then check if its correct and update gamescore
	 */
	private boolean checkAnswer() {
		String answer = getSelectedAnswer();
		Log.i("Questions", "Correct Answer!" + answer+":"+currentA);
		if (answer==null){
			Log.i("Questions", "No Checkbox selection made - returning");
			return false;
		}
		else {
			//Log.d("Questions", "Valid Checkbox selection made - check if correct");
			if (currentA.equalsIgnoreCase(answer))
			{
				Log.i("Questions", "Correct Answer!");
				//currentGame.incrementRightAnswers();
			}
			else{
				//Log.d("Questions", "Incorrect Answer!");
				return false;
				//currentGame.incrementWrongAnswers();
			}
			return true;
		}
	}


	/**
	 * 
	 */
	private String getSelectedAnswer() {
		RadioButton c1 = (RadioButton)findViewById(R.id.answer1);
		RadioButton c2 = (RadioButton)findViewById(R.id.answer2);
		RadioButton c3 = (RadioButton)findViewById(R.id.answer3);
		RadioButton c4 = (RadioButton)findViewById(R.id.answer4);
		if (c1.isChecked())
		{
			return c1.getText().toString();
		}
		if (c2.isChecked())
		{
			return c2.getText().toString();
		}
		if (c3.isChecked())
		{
			return c3.getText().toString();
		}
		if (c4.isChecked())
		{
			return c4.getText().toString();
		}
		
		return null;
	}
public  void getQuestions(){
		
		try {
		    BufferedReader reader = new BufferedReader(
		        new InputStreamReader(getAssets().open("q.txt")));

		    // do reading, usually loop until end of file reading  
		    String mLine = reader.readLine();
		    while (mLine != null) {
		     //Toast.makeText(this.getApplicationContext(), mLine, 2000).show();
		      query.add(mLine);
		       mLine = reader.readLine(); 
		    }

		    reader.close();
		} catch (IOException e) {
		    //log the exception
		}
		
		
	}
public  void getOptions(){
	
	try {
	    BufferedReader reader = new BufferedReader(
	        new InputStreamReader(getAssets().open("c.txt")));

	    // do reading, usually loop until end of file reading  
	    String mLine = reader.readLine();
	    while (mLine != null) {
	     //Toast.makeText(this.getApplicationContext(), mLine, 2000).show();
	      options.add(mLine);
	       mLine = reader.readLine(); 
	    }

	    reader.close();
	} catch (IOException e) {
	    //log the exception
	}
	
	
}
public  void getAnswers(){
	
	try {
	    BufferedReader reader = new BufferedReader(
	        new InputStreamReader(getAssets().open("ans.txt")));

	    // do reading, usually loop until end of file reading  
	    String mLine = reader.readLine();
	    while (mLine != null) {
	     //Toast.makeText(this.getApplicationContext(), mLine, 2000).show();
	      answers.add(mLine);
	       mLine = reader.readLine(); 
	    }
	   // Toast.makeText(this.getApplicationContext(), mLine, 2000).show();
	    reader.close();
	} catch (IOException e) {
	    //log the exception
	}
	
	
}

	
}
