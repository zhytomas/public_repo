package com.tomas.number_game.service.impl;

import com.tomas.number_game.service.intf.MarkRule;

/**
 * Mark Rule:
 * number could been divisible by 3, return Fizz.
 * number could been divisible by 5, return Buzz.
 * above condition both meet, return FizzBuzz.
 * 
 * @author YangZhang
 *
 */
public class MarkRuleOne implements MarkRule {

	public String doNumberMark(int inputNumber) {
		String markString = null;
		
		if(inputNumber == 0) {
			System.out.println("Number should be start with 1");
			return "0";
		}
		
		int remainder_3 = inputNumber%3;
		int remainder_5 = inputNumber%5;
		
		if(remainder_3 == 0 && remainder_5 == 0) {
			markString = "FizzBuzz";
		} else if(remainder_3 == 0) {
			markString = "Fizz";
		} else if(remainder_5 == 0) {
			markString = "Buzz";
		} else {
			markString = String.valueOf(inputNumber);
		}
		
		return markString;
	}

}
