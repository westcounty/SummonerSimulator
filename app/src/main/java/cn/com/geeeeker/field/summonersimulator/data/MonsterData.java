package cn.com.geeeeker.field.summonersimulator.data;

import java.util.ArrayList;

import cn.com.geeeeker.field.summonersimulator.model.Monster;

public class MonsterData {
	/*
	 * ReadMonster(monstername, attribute, star) SaveMonster(monster)
	 * DeleteMonster(id) ReadMonsterList() SaveMonsterList(monsterlist)
	 * ReadMonsterInfo(id) SaveMonsterInfo(monsterinfo) ReadMonsterInfoList()
	 * SaveMonsterInfoList(monsterinfolist)
	 */
	private Helper helper = new Helper();

	public Monster ReadMonster(String id) {
		// ��id��ȡħ��
		ArrayList<Monster> monsterlist = this.ReadMonsterList();
		for (Monster m : monsterlist) {
			if (id.equals(m.getId())) {
				return m;
			}
		}
		return null;
	}
	
	public boolean AddMonster(Monster monster) {
		// ���һ��ħ��
		ArrayList<Monster> monsterlist = this.ReadMonsterList();
		boolean find = false;
		for (Monster m : monsterlist) {
			if (monster.getId().equals(m.getId())) {
				find = true;
				break;
			}
		}

		if (!find) {
			monsterlist.add(monster);
			helper.saveSer("data/monster.ser", monsterlist);
		}

		return !find;

	}

	public boolean EditMonster(String id, Monster monster) {
		// ����һ��ħ��
		ArrayList<Monster> monsterlist = this.ReadMonsterList();
		boolean find = false;
		for (Monster m : monsterlist) {
			if (id.equals(m.getId())) {
				find = true;
				int index = monsterlist.indexOf(m);
				monsterlist.set(index, monster);
				break;
			}
		}

		if (find) {
			helper.saveSer("data/monster.ser", monsterlist);
		}

		return find;

	}
	
	
	public ArrayList<Monster> ReadMonsterList() {
		// ��ȡȫ��ħ��
		ArrayList<Object> readlist = new ArrayList<Object>();
		readlist = helper.readSer("data/monster.ser");

		ArrayList<Monster> resultlist = new ArrayList<Monster>();
		for (Object o : readlist) {
			Monster m = (Monster) o;
			resultlist.add(m);
		}

		return resultlist;

	}

	public void SaveMonsterList(ArrayList<Monster> list) {
		// ����ȫ��ħ��
		ArrayList<Object> savelist = new ArrayList<Object>();
		for (Monster m : list) {
			Object o = (Object) m;
			savelist.add(o);
		}
		helper.saveSer("data/monster.ser", savelist);
	}

	public void DeleteMonster(String id) {
		// ��idɾ��ħ��
		ArrayList<Monster> list = this.ReadMonsterList();

		for (Monster m : list) {
			int index = list.indexOf(m);
			if (m.getId().equals(id)) {
				list.remove(index);
				break;
			}
		}

		this.SaveMonsterList(list);
	}
}