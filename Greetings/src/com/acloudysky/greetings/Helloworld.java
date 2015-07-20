package com.acloudysky.greetings;

import com.acloudysky.greetings.Greetings;

public class Helloworld {

	public static void main(String[] args) {
		Greetings g = new Greetings();
		String greeting = g.greeting("German");
		String standard = "Hello World! ";
		System.out.println(standard.concat(greeting));
	}

}
