package cn.com.geeeeker.field.summonersimulator.businesslogic;

import cn.com.geeeeker.field.summonersimulator.model.MonsterInfo;
import cn.com.geeeeker.field.summonersimulator.model.Rune;

public class SingleRuneCalculator {
	public MonsterInfo SingleRuneCalculate(Rune rune, MonsterInfo monsterinfo) {
		MonsterInfo mi_old = monsterinfo;
		MonsterInfo result = new MonsterInfo();
		int[] typelist = this.Validate(rune);
		int[] valuelist = rune.getValue();

		for (int i = 0; i < 6; i++) {
			MonsterInfo addition = this.Calculate(mi_old, typelist[i],
					valuelist[i]);
			result.add(addition);
		}
		return result;

	}

	private int[] Validate(Rune rune) {

		String temp[] = rune.getType();

		int[] resultlist = new int[6];
		for (int i = 0; i < 6; i++) {
			switch (temp[i]) {
                case "攻击力":
                    resultlist[i] = 1;
                    break;
                case "防御力":
                    resultlist[i] = 2;
                    break;
                case "体力":
                    resultlist[i] = 3;
                    break;
                case "攻击速度":
                    resultlist[i] = 4;
                    break;
                case "暴击伤害%":
                    resultlist[i] = 5;
                    break;

                case "攻击力%":
                    resultlist[i] = 6;
                    break;
                case "防御力%":
                    resultlist[i] = 7;
                    break;
                case "体力%":
                    resultlist[i] = 8;
                    break;

                case "暴击率%":
                    resultlist[i] = 9;
                    break;
                case "效果抵抗%":
                    resultlist[i] = 10;
                    break;
                case "效果命中%":
                    resultlist[i] = 11;
                    break;

                default:
                    resultlist[i] = 0;
                    break;
			}
		}
		return resultlist;
	}

	private MonsterInfo Calculate(MonsterInfo mi, int type, int value) {
		MonsterInfo result = new MonsterInfo();
		switch (type) {
		case 1:
			result.setAttack(value);
			break;
		case 2:
			result.setDefence(value);
			break;
		case 3:
			result.setHp(value);
			break;
		case 4:
			result.setSpeed(value);
			break;
		case 5:
			result.setCri_dmg(value);
			break;

		case 6:
			result.setAttack((int) Math.rint((mi.getAttack() * value / 100.0)));
			break;
		case 7:
			result.setDefence((int) Math.rint((mi.getDefence() * value / 100.0)));
			break;
		case 8:
			result.setHp((int) Math.rint((mi.getHp() * value / 100.0)));
			break;

		case 9:
			result.setCri_rate(value);
			break;
		case 10:
			result.setResistance(value);
			break;
		case 11:
			result.setAccuracy(value);
			break;
		default:
			break;
		}
		return result;
	}
}
