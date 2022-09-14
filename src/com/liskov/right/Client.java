package com.liskov.right;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Flyable> birds = List.of(new Sparrow(), new Eagle());
		for(Flyable f:birds) {
			f.fly();
		}
		
	}
}
