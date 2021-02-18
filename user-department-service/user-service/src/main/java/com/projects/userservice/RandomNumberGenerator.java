package com.projects.userservice;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
	
	
	Long randomNumber() {
		 ThreadLocalRandom random = ThreadLocalRandom.current();
		 Long num = random.nextLong(10000000000L, 100000000000L);
		 return num;
	}
	
	
	

}
