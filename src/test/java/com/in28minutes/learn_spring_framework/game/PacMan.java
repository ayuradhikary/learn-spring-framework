package com.in28minutes.learn_spring_framework.game;

public class PacMan implements GamingConsole{
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("Sit down");
	}
	
	public void left() {
		System.out.println("Throw a punch backward");
	}
	
	public void right() {
		System.out.println("Throw a punch forward");
	}
}
