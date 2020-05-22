package pu.course.web.springmvcdemo.logic;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class WordsServiceImpl implements WordsService {

	private static final String[] WORDS = { "fixable", "fjord", "flapjack", "flopping", "fluffiness", "flyby",
			"foxglove", "frazzled", "frizzled", "fuchsia", "funny", "gabby", "galaxy", "galvanize", "gazebo", "giaour",
			"gizmo", "glowworm", "glyph", "gnarly", "gnostic", "gossip", "grogginess", "haiku", "haphazard", "hyphen",
			"iatrogenic", "icebox" };

	@Override
	public String getRandomWord() {
		int index = new Random().nextInt(WORDS.length);
		return WORDS[index];
	}
}
