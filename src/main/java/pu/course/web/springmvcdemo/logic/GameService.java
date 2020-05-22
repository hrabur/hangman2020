package pu.course.web.springmvcdemo.logic;

public interface GameService {
	Game startNewGame();
	
	Game getGame(String gameId);
}
