package pu.course.web.springmvcdemo.logic;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private WordsService wordsService;
	
	private Map<String, Game> games = new ConcurrentHashMap<>();

	@Override
	public Game startNewGame() {
		Game game = new Game();
		game.setGameId(UUID.randomUUID().toString());
		game.setWord(wordsService.getRandomWord());
		game.setPuzzle(".."); // TODO: Implement
		game.setTriesLeft(5);
		games.put(game.getGameId(), game);
		return game;
	}

	@Override
	public Game getGame(String gameId) {
		return games.get(gameId);
	}
	
	public Game makeTry(String gameId, char leter) {
		Game game = getGame(gameId);
		return game;
	}

}
