package com.projects.userservice;

public class test {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			RandomNumberGenerator random = new RandomNumberGenerator();
			System.out.println(random.randomNumber());
		}

	}

}
