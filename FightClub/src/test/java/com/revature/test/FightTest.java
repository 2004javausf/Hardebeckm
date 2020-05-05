package com.revature.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.revature.beans.Warrior;
import com.revature.service.Fight;

class FightTest {
	Warrior Genghis = new  Warrior("Genghis",200,10);
	Warrior Khan = new Warrior("Khan",2000,1);
	Fight fight = new Fight();
	@Test
	void fightTest() {
		fight.fightTime(Genghis, Khan);
		
		
		assertEquals(1990, Khan.getHp());
	}

}
