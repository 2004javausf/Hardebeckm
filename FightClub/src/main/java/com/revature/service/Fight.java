package com.revature.service;

import com.revature.beans.Warrior;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Fight {
	
	public void fightTime(Warrior a, Warrior b) {
		//a hit b
		int firstAttackPower = a.getAttackPower();
		int secondHp = b.getHp();
		b.setHp(secondHp - firstAttackPower);
		FileStuff.writeWarriorFile(Roster.warriorList);
	}
	

}
