package pu.course.web.springmvcdemo.logic;

import java.util.Set;

public class Game {
	private String gameId;
	private String word;
	private String puzzle;
	private int triesLeft;
	private Set<Character> letersLeft;

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getTriesLeft() {
		return triesLeft;
	}

	public String getPuzzle() {
		return puzzle;
	}

	public void setPuzzle(String puzzle) {
		this.puzzle = puzzle;
	}

	public void setTriesLeft(int triesLeft) {
		this.triesLeft = triesLeft;
	}

	public Set<Character> getLetersLeft() {
		return letersLeft;
	}

	public void setLetersLeft(Set<Character> letersLeft) {
		this.letersLeft = letersLeft;
	}

}
