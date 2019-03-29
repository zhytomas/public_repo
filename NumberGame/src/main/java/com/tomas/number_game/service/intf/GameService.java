package com.tomas.number_game.service.intf;

public interface GameService {
	/**
	 * print number game list.
	 * 
	 * @param endNumber endNumber
	 * @param rule game rule
	 */
	public void doGame(int endNumber, MarkRule rule);
}
