package cn.com.geeeeker.field.summonersimulator.businesslogic;

import android.content.Context;

import java.util.ArrayList;

import cn.com.geeeeker.field.summonersimulator.data.Helper;
import cn.com.geeeeker.field.summonersimulator.data.MonsterInfoData;
import cn.com.geeeeker.field.summonersimulator.data.RuneData;
import cn.com.geeeeker.field.summonersimulator.model.MonsterInfo;
import cn.com.geeeeker.field.summonersimulator.model.Rune;

public class BestTankCalculator {
    Context context_this;

    public BestTankCalculator(Context context){

        context_this=context;

    }


	private RuneData rd = new RuneData(context_this);
	private RuneSuitCalculator rsc = new RuneSuitCalculator();
	private SingleRuneCalculator src = new SingleRuneCalculator();
	
	public int[] calculate(String id){

        ArrayList<Rune> runelist = new ArrayList<Rune>();

        Helper helper =new Helper(context_this);
        ArrayList tmpArray2  = helper.readSer("Rune.ser");
        Rune rrr;
        for(Object o : tmpArray2){
            rrr= (Rune)o;
            runelist.add(rrr);
        }


        System.out.println("runelist size is "+runelist.size());

        MonsterInfoData mid = new MonsterInfoData(context_this);
        MonsterInfo monsterinfo= new MonsterInfo();

        ArrayList tmpArray  = helper.readSer("monsterinfo.ser");

        MonsterInfo rr;
        for(Object o : tmpArray){
            rr= (MonsterInfo)o;
            if ((rr.getId().equals(id))){
                monsterinfo=rr;
            }
        }


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
		

		int equalHp=0,maxHp=0;

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
								
								equalHp = (int) (totalResult.getHp()/((333.0)/(333+totalResult.getDefence())));
								
//								System.out.println(r1.getRuneid()+","+r2.getRuneid()+","+r3.getRuneid()+","+r4.getRuneid()+","+r5.getRuneid()+","+r6.getRuneid()+"");
//								System.out.println(totalResult.getHp()+"/"+totalResult.getDefence());
//								System.out.println(equalHp);
								
								
								if(equalHp>maxHp){
									maxHp=equalHp;
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
	

}
