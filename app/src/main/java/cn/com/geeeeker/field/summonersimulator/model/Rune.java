package cn.com.geeeeker.field.summonersimulator.model;

import java.io.Serializable;

public class Rune implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int runeid;
	private String name;
	private String kind;
	private int location;
	private String mainType;
	private int mainValue;
	private String prefType;
	private int prefValue;
	private String type_1;
	private int value_1;
	private String type_2;
	private int value_2;
	private String type_3;
	private int value_3;
	private String type_4;
	private int value_4;
	
	
	
	public Rune(String name,String kind, int location,String mainType,int mainValue,String prefType,int prefValue, String t1, int v1, String t2, int v2, String t3,
			int v3, String t4, int v4) {
		this.runeid = 0;
		this.name = name;
		this.kind = kind;
		this.location = location;
		this.mainType = mainType;
		this.mainValue = mainValue;
		this.prefType = prefType;
		this.prefValue = prefValue;
		this.type_1 = t1;
		this.type_2 = t2;
		this.type_3 = t3;
		this.type_4 = t4;
		this.value_1 = v1;
		this.value_2 = v2;
		this.value_3 = v3;
		this.value_4 = v4;
	}
	
	
	
	public Rune(){
		this.runeid = 0;
		this.name = "";
		this.kind = "";
		this.location = 0;
		this.mainType = "";
		this.prefType = "";
		this.type_1 = "";
		this.type_2 = "";
		this.type_3 = "";
		this.type_4 = "";
		this.mainValue = 0;
		this.prefValue = 0;
		this.value_1 = 0;
		this.value_2 = 0;
		this.value_3 = 0;
		this.value_4 = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public int getLocation(){
		return location;
	}
	
	public String getKind(){
		return kind;
	}
	
	public String getMainType(){
		return this.mainType;
	}
	
	public int getMainValue(){
		return this.mainValue;
	}
	
	public String getPrefType(){
		return this.prefType;
	}
	
	public int getPrefValue(){
		return this.prefValue;
	}
	
	public String[] getType() {
		String[] typelist = new String[6];
		typelist[0] = type_1;
		typelist[1] = type_2;
		typelist[2] = type_3;
		typelist[3] = type_4;
		typelist[4] = mainType;
		typelist[5] = prefType;
		return typelist;
	}

	public int[] getValue() {
		int[] valuelist = new int[6];
		valuelist[0] = this.value_1;
		valuelist[1] = this.value_2;
		valuelist[2] = this.value_3;
		valuelist[3] = this.value_4;
		valuelist[4] = this.mainValue;
		valuelist[5] = this.prefValue;
		return valuelist;
	}

	public int getRuneid() {
		return runeid;
	}

	public void setRuneid(int runeid) {
		this.runeid = runeid;
	}
}
