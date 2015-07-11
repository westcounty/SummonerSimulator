package cn.com.geeeeker.field.summonersimulator.model;

import java.io.Serializable;

public class MonsterInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private int hp;
	private int attack;
	private int defence;
	private int speed;
	private int cri_rate;
	private int cri_dmg;
	private int resistance;
	private int accuracy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCri_rate() {
		return cri_rate;
	}

	public void setCri_rate(int cri_rate) {
		this.cri_rate = cri_rate;
		if (this.cri_rate > 100) {
			this.cri_rate = 100;
		}
	}

	public int getCri_dmg() {
		return cri_dmg;
	}

	public void setCri_dmg(int cri_dmg) {
		this.cri_dmg = cri_dmg;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
		if (this.resistance > 100) {
			this.resistance = 100;
		}
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
		if (this.accuracy > 100) {
			this.accuracy = 100;
		}
	}

	public MonsterInfo(String id, int hp, int attack, int defence, int speed,
			int cri_rate, int cri_dmg, int resistance, int accuracy) {

		this.id = id;
		this.hp = hp;
		this.attack = attack;
		this.defence = defence;
		this.speed = speed;
		this.setCri_rate(cri_rate);
		this.cri_dmg = cri_dmg;
		this.setResistance(resistance);
		this.setAccuracy(accuracy);

	}

	public MonsterInfo() {
		this.id = "";
		this.hp = 0;
		this.attack = 0;
		this.defence = 0;
		this.speed = 0;
		this.setCri_rate(0);
		this.cri_dmg = 0;
		this.setResistance(0);
		this.setAccuracy(0);

	}

	public void add(MonsterInfo addition) {

		this.hp += addition.getHp();
		this.attack += addition.getAttack();
		this.defence += addition.getDefence();
		this.speed += addition.getSpeed();
		this.setCri_rate(this.cri_rate + addition.getCri_rate());
		this.cri_dmg += addition.getCri_dmg();
		this.setResistance(this.resistance + addition.getResistance());
		this.setAccuracy(this.accuracy + addition.getAccuracy());

	}

	public void print() {
		System.out.println("id: " + id);
		System.out.println("����: " + hp);
		System.out.println("������: " + attack);
		System.out.println("������: " + defence);
		System.out.println("�ٶ�: " + speed);
		System.out.println("������: " + cri_rate + "%");
		System.out.println("�����˺�: " + cri_dmg + "%");
		System.out.println("Ч��ֿ�: " + resistance + "%");
		System.out.println("Ч������: " + accuracy + "%");

	}
}
