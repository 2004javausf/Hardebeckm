package com.revature.driver;

import com.revature.menu.Menu;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Driver {

	public static void main(String[] args) {
//		Warrior Genghis = new  Warrior("Genghis",200,10);
//		Warrior Khan = new Warrior("Khan",2000,1);
//		System.out.println(Roster.warriorList.toString());
//		Fight f = new Fight();
//		while(Genghis.getHp()>0 && Khan.getHp()>0) {
//			f.fightTime(Khan, Genghis);
//			System.out.println(Roster.warriorList.toString());
//			f.fightTime(Genghis, Khan);
//			System.out.println(Roster.warriorList.toString());
//		}
		FileStuff.readWarriorFile();
		System.out.println(Roster.warriorList.toString());
		Menu.startMenu();
	}

}
