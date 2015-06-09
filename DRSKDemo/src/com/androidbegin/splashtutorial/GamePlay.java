/**
 * 
 */
package com.androidbegin.splashtutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * @author robert.hinds
 * 
 * This class represents the current game being played
 * tracks the score and player details
 *
 */
public class GamePlay {
	
	public static int numRounds;
	public static int difficulty;
	public static String playerName;
	public static int right;
	public static int wrong;
	public static int round;
	
	public static List<String> questions = new ArrayList<String>();
	
	
	/**
	 * @return the playerName
	 */
	public static String getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the right
	 */
	public int getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(int right) {
		this.right = right;
	}
	/**
	 * @return the wrong
	 */
	public int getWrong() {
		return wrong;
	}
	/**
	 * @param wrong the wrong to set
	 */
	public void setWrong(int wrong) {
		this.wrong = wrong;
	}
	/**
	 * @return the round
	 */
	public static int getRound() {
		return round;
	}
	/**
	 * @param round the round to set
	 */
	public static void setRound(int roun) {
		round = roun;
	}
	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}
	/**
	 * @param questions the questions to set
	 */
	public static void setQuestions(List<String> question) {
		//questions.clear();
		questions = question;
	}
	
	/**
	 * @param q the question to add
	 */

	

	
	
	public static String getNextQuestion(){
		
		//get the question
		String next = questions.get(getRound());
		//update the round number to the next round
		setRound(getRound()+1);
		return next;
	}
	
	/**
	 * method to increment the number of correct answers this game
	 */
	public void incrementRightAnswers(){
		right ++;
	}
	
	/**
	 * method to increment the number of incorrect answers this game
	 */
	public void incrementWrongAnswers(){
		wrong ++;
	}
	/**
	 * @param numRounds the numRounds to set
	 */
	public static void setNumRounds(int numRound) {
		numRounds = numRound;
	}
	/**
	 * @return the numRounds
	 */
	public static int getNumRounds() {
		return numRounds;
	}
	
	/**
	 * method that checks if the game is over
	 * @return boolean
	 */
	public static boolean isGameOver(){
		return (getRound() >= getNumRounds());
	}


}
