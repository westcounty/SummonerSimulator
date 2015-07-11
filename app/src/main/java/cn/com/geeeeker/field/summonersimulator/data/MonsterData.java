package cn.com.geeeeker.field.summonersimulator.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.geeeeker.field.summonersimulator.model.Monster;

public class MonsterData {
	/*
	 * ReadMonster(monstername, attribute, star) SaveMonster(monster)
	 * DeleteMonster(id) ReadMonsterList() SaveMonsterList(monsterlist)
	 * ReadMonsterInfo(id) SaveMonsterInfo(monsterinfo) ReadMonsterInfoList()
	 * SaveMonsterInfoList(monsterinfolist)
	 */

    Context context_this;

    public  MonsterData(Context context){
        context_this=context;

    }


	private Helper helper = new Helper(context_this);

	public Monster ReadMonster(String id) {
		// 根据ID获取魔灵
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

    //将读取到的所有魔灵信息包装为Adapter需要的map数组
    public List<Map<String, Object>> getAllMolingData(ArrayList raw){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map ;
        Monster o;
        for (int i=0;i<raw.size();i++){
            o = (Monster)raw.get(i);
            map=new HashMap<String, Object>();
            map.put("molingmingcheng",o.getMonstername());
            map.put("molingshuxing",o.getAttribute());
            map.put("molingxingji",o.getStar());
            list.add(map);
        }

        return  list;
    }




    public ArrayList<Monster> ReadMonsterList() {
		// 读取所有魔灵信息
		ArrayList<Object> readlist = new ArrayList<Object>();
		readlist = helper.readSer("monster.ser");

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