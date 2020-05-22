package pu.course.web.springmvcdemo.logic;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

	public static final char[] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
			'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	@Autowired
	private WordsService wordsService;

	private Map<String, Game> games = new ConcurrentHashMap<>();

	@Override
	public Game startNewGame() {
		Game game = new Game();
		game.setGameId(UUID.randomUUID().toString());
		game.setWord(wordsService.getRandomWord());
		game.setTriesLeft(5);
		initGame(game);
		games.put(game.getGameId(), game);
		return game;
	}

	void initGame(Game game) {
		String word = game.getWord();
		char fc = word.charAt(0);
		char lc = word.charAt(word.length() - 1);

		StringBuilder buf = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char curr = word.charAt(i);
			char pc = curr == fc || curr == lc ? curr : '.';
			buf.append(pc);
		}
		game.setPuzzle(buf.toString());

		Set<Character> lettersLeft = new TreeSet();
		for (char c : ALPHABET)
			lettersLeft.add(c);
		lettersLeft.remove(fc);
		lettersLeft.remove(lc);
		game.setLettersLeft(lettersLeft);

		// Hide letters
		// Update letters left
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
