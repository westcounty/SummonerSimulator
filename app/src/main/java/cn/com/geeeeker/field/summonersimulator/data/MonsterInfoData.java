package cn.com.geeeeker.field.summonersimulator.data;

import java.util.ArrayList;

import cn.com.geeeeker.field.summonersimulator.model.MonsterInfo;

public class MonsterInfoData {

	private Helper helper = new Helper();

	public MonsterInfo ReadMonsterInfo(String id) {
		// ��id��ȡħ�����
		ArrayList<MonsterInfo> monsterinfolist = this.ReadMonsterInfoList();
		for (MonsterInfo mi : monsterinfolist) {
			if (mi.getId().equals(id)) {
				return mi;
			}
		}
		return null;
	}

	public boolean AddMonsterInfo(MonsterInfo monsterinfo) {
		// ���һ��ħ�����
		ArrayList<MonsterInfo> monsterinfolist = this.ReadMonsterInfoList();
		boolean find = false;
		for (MonsterInfo mi : monsterinfolist) {
			if (monsterinfo.getId().equals(mi.getId())) {
				find = true;
				break;
			}
		}

		if (!find) {
			monsterinfolist.add(monsterinfo);
			helper.saveSer("data/monsterinfo.ser", monsterinfolist);
		}
		
		return !find;
		
	}

	public boolean EditMonsterInfo(String id, MonsterInfo monsterinfo) {
		// ����һ��ħ�����
		ArrayList<MonsterInfo> monsterinfolist = this.ReadMonsterInfoList();
		boolean find = false;
		for (MonsterInfo mi : monsterinfolist) {
			if (id.equals(mi.getId())) {
				find = true;
				int index = monsterinfolist.indexOf(mi);
				monsterinfolist.set(index, monsterinfo);
				break;
			}
		}

		if (find) {
			helper.saveSer("data/monsterinfo.ser", monsterinfolist);
		}
		
		return find;

	}

	public ArrayList<MonsterInfo> ReadMonsterInfoList() {
		// ��ȡȫ��ħ�����
		ArrayList<Object> readlist = new ArrayList<Object>();
		readlist = helper.readSer("data/monsterInfo.ser");

		ArrayList<MonsterInfo> resultlist = new ArrayList<MonsterInfo>();
		for (Object o : readlist) {
			MonsterInfo mi = (MonsterInfo) o;
			resultlist.add(mi);
		}

		return resultlist;

	}

	public void SaveMonsterInfoList(ArrayList<MonsterInfo> list) {
		// ����ȫ��ħ�����
		ArrayList<Object> savelist = new ArrayList<Object>();
		for (MonsterInfo mi : list) {
			Object o = (Object) mi;
			savelist.add(o);
		}
		helper.saveSer("data/monsterInfo.ser", savelist);
	}

	public void DeleteMonsterInfo(String id) {
		// ��idɾ��ħ�����
		ArrayList<MonsterInfo> list = this.ReadMonsterInfoList();

		for (MonsterInfo mi : list) {
			int index = list.indexOf(mi);
			if (mi.getId().equals(id)) {
				list.remove(index);
				break;
			}
		}

		this.SaveMonsterInfoList(list);
	}
}