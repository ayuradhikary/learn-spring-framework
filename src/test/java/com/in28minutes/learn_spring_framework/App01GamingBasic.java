// var helps in type inference i.e compiler automatically asigns the type of the var according the value provied
// that we do not have to define the data type or type of the object while creating it

package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacMan;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		
		//MarioGame game = new MarioGame(); the below code is same as this. Automatically the compiler assigns the type of the game to be MarioGame
		//var game = new MarioGame();
		var game = new PacMan();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
