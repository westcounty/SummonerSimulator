package cn.com.geeeeker.field.summonersimulator.businesslogic;

import cn.com.geeeeker.field.summonersimulator.model.MonsterInfo;
import cn.com.geeeeker.field.summonersimulator.model.Rune;

public class RuneSuitCalculator {
	public MonsterInfo RuneSuitCalculate(MonsterInfo mi, Rune r1, Rune r2,
			Rune r3, Rune r4, Rune r5, Rune r6) {
		String[] kindlist = new String[6];
		kindlist[0] = r1.getKind();
		kindlist[1] = r2.getKind();
		kindlist[2] = r3.getKind();
		kindlist[3] = r4.getKind();
		kindlist[4] = r5.getKind();
		kindlist[5] = r6.getKind();

		MonsterInfo result = new MonsterInfo();

		int zhufu_count = 0;
		int menggong_count = 0;
		int daoren_count = 0;
		int xunsu_count = 0;
		int jinu_count = 0;
		int jizhong_count = 0;
		int rennai_count = 0;
		int shouhu_count = 0;

		for (int i = 0; i < 6; i++) {
			switch (kindlist[i]) {
                case "祝福":
                    zhufu_count++;
                    break;
                case "猛攻":
                    menggong_count++;
                    break;
                case "刀刃":
                    daoren_count++;
                    break;
                case "迅速":
                    xunsu_count++;
                    break;
                case "激怒":
                    jinu_count++;
                    break;
                case "集中":
                    jizhong_count++;
                    break;
                case "忍耐":
                    rennai_count++;
                    break;
                case "守护":
                    shouhu_count++;
                    break;
                default:
                    break;
			}
		}
		
		result.setHp((int)Math.rint((mi.getHp()*(0.15)*(int)(zhufu_count/2))));
		result.setAttack((int)Math.rint((mi.getAttack()*(0.35)*(int)(menggong_count/4))));
		result.setDefence((int)Math.rint((mi.getDefence()*(0.15)*(int)(shouhu_count/2))));
		result.setCri_rate(12*(int)(daoren_count/2));
		result.setSpeed((int)Math.rint((mi.getSpeed()*0.25*(int)(xunsu_count/4))));
		result.setCri_dmg(40*(int)(jinu_count/4));
		result.setAccuracy(20*(int)(jizhong_count/2));
		result.setResistance(20*(int)(rennai_count/2));
		return result;

	}

}
