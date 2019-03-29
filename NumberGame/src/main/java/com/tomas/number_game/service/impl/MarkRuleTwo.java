package com.tomas.number_game.service.impl;

import com.tomas.number_game.service.intf.MarkRule;

/**
 * Mark Rule
 * number could been divisible by 3, or contain 3, return Fizz.
 * number could been divisible by 5, or contain 5, return Buzz.
 * above condition both meet, return FizzBuzz.
 * 
 * @author YangZhang
 *
 */
public class MarkRuleTwo implements MarkRule {

	public String doNumberMark(int inputNumber) {
		String markString = null;
		
		if(inputNumber == 0) {
			System.out.println("Number should be start with 1");
			return "0";
		}
		
		int remainder_3 = inputNumber%3;
		Boolean contain_3 = String.valueOf(inputNumber).indexOf("3")>0;
		int remainder_5 = inputNumber%5;
		Boolean contain_5 = String.valueOf(inputNumber).indexOf("5")>0;
		
		boolean condition_3 = remainder_3==0 || contain_3;
		boolean condition_5 = remainder_5==0 || contain_5;
		
		if(condition_3 && condition_5) {
			markString = "FizzBuzz";
		} else if(condition_3) {
			markString = "Fizz";
		} else if(condition_5) {
			markString = "Buzz";
		} else {
			markString = String.valueOf(inputNumber);
		}
		
		return markString;
	}

}
