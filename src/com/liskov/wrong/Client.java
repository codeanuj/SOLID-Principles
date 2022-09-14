package com.liskov.wrong;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		
		List<Bird> birds=List.of(new Eagle(),new Sparrow(), new Penguin());
		
		for(Bird b:birds) {
			b.fly();
		}
	}
}
