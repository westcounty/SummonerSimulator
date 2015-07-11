package cn.com.geeeeker.field.summonersimulator.data;

import java.util.ArrayList;

import cn.com.geeeeker.field.summonersimulator.model.Rune;

public class RuneData {
	
	/*
	 * ReadRune(monstername, attribute, star) SaveMonster(monster) DeleteMonster(id)
	 * ReadRuneList() SaveMonsterList(monsterlist) ReadMonsterInfo(id)
	 * SaveMonsterInfo(monsterinfo) ReadMonsterInfoList()
	 * SaveMonsterInfoList(monsterinfolist)
	 */
	
	private Helper helper = new Helper();
	
	public void AddRune(Rune rune){
		ArrayList<Rune> list = this.ReadRuneList();
		
		int maxId=0;
		for(Rune r:list){
			if(r.getRuneid()>=maxId){
				maxId=r.getRuneid();
			}
		}
		rune.setRuneid(maxId+1);
		
		list.add(rune);
		
		this.SaveRuneList(list);
		
	}
	
	
	public void EditRune(int runeid, Rune rune){
		
		ArrayList<Rune> list = this.ReadRuneList();
		
		for(Rune r:list){
			if(r.getRuneid()==runeid){
				rune.setRuneid(runeid);
				list.set(list.indexOf(r), rune);
				break;
			}
		}
		
		this.SaveRuneList(list);
		
	}
	
	public Rune getRune(int runeid){
		ArrayList<Rune> list = this.ReadRuneList();
		
		Rune rune = new Rune();
		for(Rune r: list){
			if(r.getRuneid()==runeid){
				rune=r;
				break;
			}
		}
		
		return rune;
	}
	
	public ArrayList<Rune> ReadRuneList(){
		ArrayList<Object> readlist = new ArrayList<Object>();
		readlist = helper.readSer("data/rune.ser");
		
		ArrayList<Rune> resultlist = new ArrayList<Rune>();
		
		for(Object o: readlist){
			Rune r = (Rune) o;
			resultlist.add(r);
		}
		
		return resultlist;
	}
	
	public void SaveRuneList(ArrayList<Rune> list) {
		ArrayList<Object> savelist = new ArrayList<Object>();
		for (Rune r : list) {
			Object o = (Object) r;
			savelist.add(o);
		}
		helper.saveSer("data/rune.ser", savelist);
	}
	
	public void DeleteRune(int runeid){
		ArrayList<Rune> list = this.ReadRuneList();
		
		for(Rune r: list){
			if(r.getRuneid()==runeid){
				list.remove(r);
				break;
			}
		}
		
		this.SaveRuneList(list);
	}
}
