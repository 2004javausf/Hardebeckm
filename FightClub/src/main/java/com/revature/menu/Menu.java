package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Warrior;
import com.revature.service.Fight;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	static Fight f = new Fight();
	
	public static void startMenu() {
		System.out.println("Welcome to FightClub\n 1. Create a new Warrior\n 2. Fight\n 3. Quit");
		int Input = Integer.parseInt(sc.nextLine());
		if(Input == 1) {
			createCharMenu();
		}else if(Input == 2) {
			fightMenu();
		}else if(Input == 3){
			System.out.println("");
		}else {
			System.out.println("try again");
			startMenu();
		}
	}
	
	public static void createCharMenu() {
		System.out.println("Create a new Warrior!");
		System.out.println("Please enter a name for your warrior.");
		String name = sc.nextLine();
		System.out.println("Please enter HP for your warrior.");
		int Hp = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter attack power for your warrior.");
		int attackPower = Integer.parseInt(sc.nextLine());
		Warrior a = new Warrior(name,Hp,attackPower);
		LogThis.LogIt("info", a.getName()+" was created");
		System.out.println("Would you like to make another warrior?(y/n)");
		String option = sc.nextLine();
		if(option.equalsIgnoreCase("y")) {
			createCharMenu();
		}else if(option.equalsIgnoreCase("n")) {
			System.out.println("coo");
			startMenu();
		}else {
			System.out.println("rip");
		}
			
	}
	public static void fightMenu() {
		System.out.println("Enter the name of your first warrior");
		String first = sc.nextLine();
		Warrior a = Roster.findWarriorByName(first);
		System.out.println("Enter the name of your second warrior");
		String second = sc.nextLine();
		Warrior b = Roster.findWarriorByName(second);
		System.out.println("Ready... Fight!");
		f.fightTime(a, b);
		LogThis.LogIt("info", a.getName()+" just bopped " + b.getName()+" and it cost " + a.getAttackPower()+" hp damage to " + b.getName());
		System.out.println(a.getName()+" just bopped " + b.getName()+" and it cost " + a.getAttackPower()+" hp damage to " + b.getName());
		System.out.println(b.getName()+" is now at " +b.getHp()+" hp.");
	}
}
