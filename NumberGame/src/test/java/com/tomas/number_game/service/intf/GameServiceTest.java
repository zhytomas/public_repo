package com.tomas.number_game.service.intf;

import org.junit.Before;
import org.junit.Test;

import com.tomas.number_game.service.impl.GameServiceImpl;
import com.tomas.number_game.service.impl.MarkRuleOne;
import com.tomas.number_game.service.impl.MarkRuleTwo;

public class GameServiceTest {
	GameService service=null;

	@Before
	public void setUp() throws Exception {
		service = new GameServiceImpl();
	}

	@Test
	public void testDoGameStage1() {
		MarkRule rule1 = new MarkRuleOne();
		System.out.println("----------stage 1 start ------------------------");
		service.doGame(100, rule1);
		System.out.println("----------stage 1 end --------------------------");
	}
	
	@Test
	public void testDoGameStage2() {
		MarkRule rule2 = new MarkRuleTwo();
		System.out.println("----------stage 2 start ------------------------");
		service.doGame(100, rule2);
		System.out.println("----------stage 2 end ------------------------");
	}

}
