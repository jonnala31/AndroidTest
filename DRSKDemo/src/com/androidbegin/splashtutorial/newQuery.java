/**
 * 
 */
package com.androidbegin.splashtutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;



/**
 * @author mohan
 *
 */
public class newQuery extends Activity implements OnClickListener{

	private String currentQ,currentA;
	private GamePlay currentGame=new GamePlay();
	//OptionsMulti
	String currenOptions;
	public static ArrayList<String> query=new ArrayList<String>();
	public static ArrayList<String>options=new ArrayList<String>();
	public static ArrayList<String>answers=new ArrayList<String>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        /**
         * Configure current game and get question
         */
        getQuestions();
        getOptions();
        getAnswers();
        Answers.setQuestions(answers);
        OptionsMulti.setQuestions(options);
        currentGame.setQuestions(query);
        currentA=Answers.getNextQuestion();
        currenOptions=OptionsMulti.getNextQuestion();
        currentQ = currentGame.getNextQuestion();
		Button nextBtn = (Button) findViewById(R.id.nextBtn);
		nextBtn.setOnClickListener(this);
        
        /**
         * Update the question and answer options..
         */
        setQuestions();
		
    }


	/**
	 * Method to set the text for the question and answers from the current games
	 * current question
	 */
	private void setQuestions() {
		//set the question text from current question
		String question = currentQ+ "?";
        TextView qText = (TextView) findViewById(R.id.textView1);
        qText.setText(question);
        String [] optionsmulti=currenOptions.split(",");
        
       qText.setTextAppearance(getApplicationContext(), R.style.boldText);
        qText.setBackgroundResource(R.color.highlightedTextViewColor);
        qText.setGravity(Gravity.CENTER);
        //set the available options
       // List<String> answers = currentQ.getQuestionOptions();
        if(optionsmulti.length>3){
        ImageView option1 = (ImageView) findViewById(R.id.imageView1);
        //option1.setText(optionsmulti[0]);
        String uri = "@drawable/"+optionsmulti[0];

        int imageResource = getResources().getIdentifier(uri, null, getPackageName());

       
        Drawable res = getResources().getDrawable(imageResource);
        option1.setImageDrawable(res);
        option1.setTag(optionsmulti[0]);
        
        
        ImageView option2 = (ImageView) findViewById(R.id.imageView2);
        //option1.setText(optionsmulti[0]);
        String uri1 = "@drawable/"+optionsmulti[1];

        int imageResource1 = getResources().getIdentifier(uri1, null, getPackageName());

       
        Drawable res1 = getResources().getDrawable(imageResource1);
        option2.setImageDrawable(res1);
        option2.setTag(optionsmulti[1]);
        
        ImageView option3 = (ImageView) findViewById(R.id.imageView3);
        //option1.setText(optionsmulti[0]);
        String uri3 = "@drawable/"+optionsmulti[2] ;

        int imageResource3 = getResources().getIdentifier(uri3, null, getPackageName());

       
        Drawable res3 = getResources().getDrawable(imageResource3);
        option3.setImageDrawable(res3);  
        option3.setTag(optionsmulti[2]);
        
        ImageView option4 = (ImageView) findViewById(R.id.imageView4);
        //option1.setText(optionsmulti[0]);
        String uri4 = "@drawable/"+optionsmulti[3];

        int imageResource4 = getResources().getIdentifier(uri3, null, getPackageName());

       
        Drawable res4 = getResources().getDrawable(imageResource4);
        option4.setImageDrawable(res4);  
        option4.setTag(optionsmulti[3]); 
        
//        TextView option2 = (TextView) findViewById(R.id.answer2); 
//        option2.setText(optionsmulti[1]);
//        
//        TextView option3 = (TextView) findViewById(R.id.answer3);
//        option3.setText(optionsmulti[2]);
//        
//        TextView option4 = (TextView) findViewById(R.id.answer4);
//        option4.setText(optionsmulti[3]);
        }
	}
    

	public void onClick(View v) {
		//Log.d("Questions", "Moving to next question");
		
		
		String answer;
		Intent i;
		switch (v.getId()){
		case R.id.imageView1 :
		
			 answer = (String) v.getTag();
			if(currentA.equalsIgnoreCase(answer)){
				 i = new Intent(this, newQuery.class);
			startActivity(i);
			}else{
				
				 i = new Intent(this, MainActivity.class);
					startActivity(i);
			}
			 // setContentView(R.layout.multiselect);
			
			break;
			
		case R.id.imageView2 :
			 answer = (String) v.getTag();
				if(currentA.equalsIgnoreCase(answer)){
					 i = new Intent(this, newQuery.class);
						startActivity(i);
				}
				else{
					
					 i = new Intent(this, MainActivity.class);
						startActivity(i);
				}
		  //  setContentView(R.layout.rules);
			break;
			
		case R.id.imageView3 :
			 answer = (String) v.getTag();
				if(currentA.equalsIgnoreCase(answer)){
					 i = new Intent(this, newQuery.class);
						startActivity(i);
				}
				else{
					
					 i = new Intent(this, MainActivity.class);
						startActivity(i);
				}
		   // setContentView(R.layout.settings);
			
			break;
			
		case R.id.imageView4 :
			 answer = (String) v.getTag();
				if(currentA.equalsIgnoreCase(answer)){
					 i = new Intent(this, newQuery.class);
						startActivity(i);
				}
				else{
					
					 i = new Intent(this, MainActivity.class);
						startActivity(i);
				}
			 //SoundManager.stopMusic();
			//finish();
			break;
		}

		
//		/**
//		 * validate a checkbox has been selected
//		 */
//		if (!checkAnswer()) {
//			Intent i = new Intent(this, MainActivity.class);
//			startActivity(i);
//			finish();
//			
//		}
////
////		
////		/**
////		 * check if end of game
////		 */
////		if (currentGame.isGameOver()){
////			//Log.d("Questions", "End of game! lets add up the scores..");
////			//Log.d("Questions", "Questions Correct: " + currentGame.getRight());
////			//Log.d("Questions", "Questions Wrong: " + currentGame.getWrong());
////			Intent i = new Intent(this, MainActivity.class);
////			startActivity(i);
////			finish();
////		}
//		//else{
//			Intent i = new Intent(this, newQuery.class);
//			startActivity(i);
//			//finish();
//		//}
	}
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		switch (keyCode)
		{
		case KeyEvent.KEYCODE_BACK :
			return true;
		}
		
		return super.onKeyDown(keyCode, event);
	}


	/**
	 * Check if a checkbox has been selected, and if it
	 * has then check if its correct and update gamescore
	 */
	private boolean checkAnswer() {
		String answer = getSelectedAnswer();
		if (answer==null){
			//Log.d("Questions", "No Checkbox selection made - returning");
			return false;
		}
		else {
			//Log.d("Questions", "Valid Checkbox selection made - check if correct");
			if (currentA.equalsIgnoreCase(answer))
			{
				//Log.d("Questions", "Correct Answer!");
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
	        new InputStreamReader(getAssets().open("c.txt")));

	    // do reading, usually loop until end of file reading  
	    String mLine = reader.readLine();
	    while (mLine != null) {
	     //Toast.makeText(this.getApplicationContext(), mLine, 2000).show();
	      answers.add(mLine);
	       mLine = reader.readLine(); 
	    }

	    reader.close();
	} catch (IOException e) {
	    //log the exception
	}
	
	
}

	
}
