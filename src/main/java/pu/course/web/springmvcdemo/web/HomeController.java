package pu.course.web.springmvcdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pu.course.web.springmvcdemo.logic.Game;
import pu.course.web.springmvcdemo.logic.GameService;

@Controller
public class HomeController {

	@Autowired
	private GameService gameService;

	@GetMapping("/")
	public String home() {
		return "index.html";
	}

	@PostMapping("/games")
	public String startNewGame() {
		Game game = gameService.startNewGame();
		return "redirect:/games/" + game.getGameId();
	}

	@GetMapping("/games/{gameId}")
	public String showGame(@PathVariable String gameId, Model model) {
		Game game = gameService.getGame(gameId);
		model.addAttribute(game);
		return "hangman.html";
	}
}
