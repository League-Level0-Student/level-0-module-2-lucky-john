package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
	for (int newAnimal = 0; newAnimal <6; newAnimal+=1) {
		
	
	
	String animal = JOptionPane.showInputDialog("which animal do you want? there are 6 animals. duck,cow,dog,cat,llama or monkey?");
	if(animal.equals("cow")) {
			playNoise(mooFile);
			
	}
	if(animal.equals("duck")) {
		playNoise(quackFile);
		
}
	if(animal.equals("dog")) {
		playNoise(woofFile);
		
}
	if(animal.equals("cat")) {
		playNoise(meowFile);
		
}
	if(animal.equals("llama")) {
		playNoise(llamaFile);
		
}
	if(animal.equals("monkey")) {
		playNoise(monkeyFile);
		
}
	
	}	

	
	
	
	
	
	
	
	
	
	
	/* 2. Make it so that the user can keep entering new animals. */
}

void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}


void playmonkey() {
	playNoise(monkeyFile);
}


String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";
String monkeyFile = "monkey.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

