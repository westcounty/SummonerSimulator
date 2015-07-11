package cn.com.geeeeker.field.summonersimulator.model;

import java.io.Serializable;

public class Monster implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String monstername;
	private String attribute;
	private int star;
	private String id; 
	public String getMonstername() {
		return monstername;
	}
	public void setMonstername(String monstername) {
		this.monstername = monstername;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Monster(String monstername, String attribute, int star){
		this.monstername = monstername;
		this.attribute = attribute;
		this.star = star;
		this.id = monstername+attribute;
	}
}
