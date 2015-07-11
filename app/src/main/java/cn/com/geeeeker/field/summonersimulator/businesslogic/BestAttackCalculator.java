package cn.com.geeeeker.field.summonersimulator.businesslogic;

import java.util.ArrayList;

import cn.com.geeeeker.field.summonersimulator.model.MonsterInfo;
import cn.com.geeeeker.field.summonersimulator.model.Rune;
import cn.com.geeeeker.field.summonersimulator.data.MonsterInfoData;
import cn.com.geeeeker.field.summonersimulator.data.RuneData;

public class BestAttackCalculator {
    //DPS计算公式：攻击力*（暴击率*（100%+爆伤）+（1-暴击率））
    //对所有符文的所有组合进行穷举
    //对每次穷举得到的结果进行记录，符文以index记录，结果以等价攻击力计算，成对
    //对所有结果取最大值，输出index组
    //
	private RuneData rd = new RuneData();
	private RuneSuitCalculator rsc = new RuneSuitCalculator();
	private SingleRuneCalculator src = new SingleRuneCalculator();
	
	public int[] calculate(String id){
		
		ArrayList<Rune> runelist = rd.ReadRuneList();
		MonsterInfoData mid = new MonsterInfoData();
		MonsterInfo monsterinfo = mid.ReadMonsterInfo(id);
		int rune1_count = 0, rune2_count = 0, rune3_count = 0, rune4_count = 0, rune5_count = 0, rune6_count = 0;
		for (Rune r : runelist) {
			int location = r.getLocation();
			switch (location) {
			case 1:
				rune1_count++;
				break;
			case 2:
				rune2_count++;
				break;
			case 3:
				rune3_count++;
				break;
			case 4:
				rune4_count++;
				break;
			case 5:
				rune5_count++;
				break;
			case 6:
				rune6_count++;
				break;
			default:
				break;
			}
		}
		
		Rune[] rune1_showlist, rune2_showlist, rune3_showlist, rune4_showlist,
		rune5_showlist, rune6_showlist;
		
		rune1_showlist = new Rune[rune1_count];
		rune2_showlist = new Rune[rune2_count];
		rune3_showlist = new Rune[rune3_count];
		rune4_showlist = new Rune[rune4_count];
		rune5_showlist = new Rune[rune5_count];
		rune6_showlist = new Rune[rune6_count];
		
		
		int rune1_i = 0, rune2_i = 0, rune3_i = 0, rune4_i = 0, rune5_i = 0, rune6_i = 0;
		for (int index=0;index<runelist.size();index++) {
			Rune r = runelist.get(index);
			switch (r.getLocation()) {
			case 1:
				rune1_showlist[rune1_i] = r;
				rune1_i++;
				break;
			case 2:
				rune2_showlist[rune2_i] = r;
				rune2_i++;
				break;
			case 3:
				rune3_showlist[rune3_i] = r;
				rune3_i++;
				break;
			case 4:
				rune4_showlist[rune4_i] = r;
				rune4_i++;
				break;
			case 5:
				rune5_showlist[rune5_i] = r;
				rune5_i++;
				break;
			case 6:
				rune6_showlist[rune6_i] = r;
				rune6_i++;
				break;
			default:
				break;
			}

		}
		

		int equalAttack=0,maxAttack=0;

		MonsterInfo totalResult;
		MonsterInfo src_result1=new MonsterInfo(),
		src_result2=new MonsterInfo(),
		src_result3=new MonsterInfo(),
		src_result4=new MonsterInfo(),
		src_result5=new MonsterInfo(),
		src_result6=new MonsterInfo();
		MonsterInfo rsc_result = new MonsterInfo();
		
		
		int[] resultidlist = {0,0,0,0,0,0};
		
		for(Rune r1:rune1_showlist){
			for(Rune r2:rune2_showlist){
				for(Rune r3:rune3_showlist){
					for(Rune r4:rune4_showlist){
						for(Rune r5:rune5_showlist){
							for(Rune r6:rune6_showlist){
								
								src_result1 = src.SingleRuneCalculate(r1,
										monsterinfo);
								src_result2 = src.SingleRuneCalculate(r2,
										monsterinfo);
								src_result3 = src.SingleRuneCalculate(r3,
										monsterinfo);
								src_result4 = src.SingleRuneCalculate(r4,
										monsterinfo);
								src_result5 = src.SingleRuneCalculate(r5,
										monsterinfo);
								src_result6 = src.SingleRuneCalculate(r6,
										monsterinfo);
								
								totalResult = new MonsterInfo();
								
								totalResult.add(src_result1);
								totalResult.add(src_result2);
								totalResult.add(src_result3);
								totalResult.add(src_result4);
								totalResult.add(src_result5);
								totalResult.add(src_result6);
								
								rsc_result = rsc.RuneSuitCalculate(
										monsterinfo, r1, r2, r3, r4, r5, r6);
								
								totalResult.add(rsc_result);
								totalResult.add(monsterinfo);
								
								equalAttack = (int) (totalResult.getAttack()*((100-totalResult.getCri_rate())/100.0+totalResult.getCri_rate()*(100+totalResult.getCri_dmg())/100.0/100.0));
								
//								System.out.println(r1.getRuneid()+","+r2.getRuneid()+","+r3.getRuneid()+","+r4.getRuneid()+","+r5.getRuneid()+","+r6.getRuneid()+"");
//								System.out.println(totalResult.getAttack());
//								System.out.println(equalAttack);
								
								
								if(equalAttack>maxAttack){
									maxAttack=equalAttack;
									resultidlist[0]=r1.getRuneid();
									resultidlist[1]=r2.getRuneid();
									resultidlist[2]=r3.getRuneid();
									resultidlist[3]=r4.getRuneid();
									resultidlist[4]=r5.getRuneid();
									resultidlist[5]=r6.getRuneid();
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println("Result:");
		for(int i =0 ;i<=5;i++){
			System.out.print(resultidlist[i]+",");
		}
		return resultidlist;
		
	}
	
	public static void main(String args[]){
		new BestAttackCalculator().calculate("扎伊洛斯火");
	}
}
