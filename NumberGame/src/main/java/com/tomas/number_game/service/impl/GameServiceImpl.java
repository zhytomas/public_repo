package com.tomas.number_game.service.impl;

import com.tomas.number_game.service.intf.GameService;
import com.tomas.number_game.service.intf.MarkRule;

public class GameServiceImpl implements GameService {

	public void doGame(int endNumber, MarkRule rule) {
		for(int i=0;i<endNumber;i++) {
			System.out.println(rule.doNumberMark(i+1));
		}			
	}
}
