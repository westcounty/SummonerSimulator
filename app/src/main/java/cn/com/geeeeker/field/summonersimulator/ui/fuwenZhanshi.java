package cn.com.geeeeker.field.summonersimulator.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import cn.com.geeeeker.field.summonersimulator.R;
import cn.com.geeeeker.field.summonersimulator.businesslogic.BestAttackCalculator;
import cn.com.geeeeker.field.summonersimulator.businesslogic.BestSpeedCalculator;
import cn.com.geeeeker.field.summonersimulator.businesslogic.BestTankCalculator;
import cn.com.geeeeker.field.summonersimulator.businesslogic.RuneSuitCalculator;
import cn.com.geeeeker.field.summonersimulator.businesslogic.SingleRuneCalculator;
import cn.com.geeeeker.field.summonersimulator.data.Helper;
import cn.com.geeeeker.field.summonersimulator.data.RuneData;
import cn.com.geeeeker.field.summonersimulator.model.Monster;
import cn.com.geeeeker.field.summonersimulator.model.MonsterInfo;
import cn.com.geeeeker.field.summonersimulator.model.Rune;

public class fuwenZhanshi extends Activity {

    Button fanhui_monijieguo;
    Helper helper = new Helper(fuwenZhanshi.this);
    MonsterInfo   monsterinfo_show ;
    TextView		rune_1_name_view	;
    TextView		rune_2_name_view	;
    TextView		rune_3_name_view	;
    TextView		rune_4_name_view	;
    TextView		rune_5_name_view	;
    TextView		rune_6_name_view	;

    TextView  rune_1_main_type_view;
    TextView		rune_2_main_type_view	;
    TextView		rune_3_main_type_view	;
    TextView		rune_4_main_type_view	;
    TextView		rune_5_main_type_view	;
    TextView		rune_6_main_type_view	;

    TextView		rune_1_main_value_view	;
    TextView		rune_2_main_value_view	;
    TextView		rune_3_main_value_view	;
    TextView		rune_4_main_value_view	;
    TextView		rune_5_main_value_view	;
    TextView		rune_6_main_value_view	;
    ;
    TextView		rune_1_pref_type_view	;
    TextView		rune_2_pref_type_view	;
    TextView		rune_3_pref_type_view	;
    TextView		rune_4_pref_type_view	;
    TextView		rune_5_pref_type_view	;
    TextView		rune_6_pref_type_view	;

    TextView		rune_1_pref_value_view	;
    TextView		rune_2_pref_value_view	;
    TextView		rune_3_pref_value_view	;
    TextView		rune_4_pref_value_view	;
    TextView		rune_5_pref_value_view	;
    TextView		rune_6_pref_value_view	;

    TextView		rune_1_type_1_view	;
    TextView		rune_2_type_1_view	;
    TextView		rune_3_type_1_view	;
    TextView		rune_4_type_1_view	;
    TextView		rune_5_type_1_view	;
    TextView		rune_6_type_1_view	;

    TextView		rune_1_type_2_view	;
    TextView		rune_2_type_2_view	;
    TextView		rune_3_type_2_view	;
    TextView		rune_4_type_2_view	;
    TextView		rune_5_type_2_view	;
    TextView		rune_6_type_2_view	;

    TextView		rune_1_type_3_view	;
    TextView		rune_2_type_3_view	;
    TextView		rune_3_type_3_view	;
    TextView		rune_4_type_3_view	;
    TextView		rune_5_type_3_view	;
    TextView		rune_6_type_3_view	;

    TextView		rune_1_type_4_view	;
    TextView		rune_2_type_4_view	;
    TextView		rune_3_type_4_view	;
    TextView		rune_4_type_4_view	;
    TextView		rune_5_type_4_view	;
    TextView		rune_6_type_4_view	;
    ;
    TextView		rune_1_value_1_view	;
    TextView		rune_2_value_1_view	;
    TextView		rune_3_value_1_view	;
    TextView		rune_4_value_1_view	;
    TextView		rune_5_value_1_view	;
    TextView		rune_6_value_1_view	;

    TextView		rune_1_value_2_view	;
    TextView		rune_2_value_2_view	;
    TextView		rune_3_value_2_view	;
    TextView		rune_4_value_2_view	;
    TextView		rune_5_value_2_view	;
    TextView		rune_6_value_2_view	;
    ;
    TextView		rune_1_value_3_view	;
    TextView		rune_2_value_3_view	;
    TextView		rune_3_value_3_view	;
    TextView		rune_4_value_3_view	;
    TextView		rune_5_value_3_view	;
    TextView		rune_6_value_3_view	;

    TextView		rune_1_value_4_view	;
    TextView		rune_2_value_4_view	;
    TextView		rune_3_value_4_view	;
    TextView		rune_4_value_4_view	;
    TextView		rune_5_value_4_view	;
    TextView		rune_6_value_4_view	;

    TextView		monster_name_view	;
    TextView		monster_attribute_view	;
    TextView		monster_star_view	;
    TextView		equal_attack_view	;
    TextView		equal_hp_view	;
    TextView		monster_hp_view	;
    TextView		monster_attack_view	;
    TextView		monster_defence_view	;
    TextView		monster_speed_view	;
    TextView		monster_cri_rate_view	;
    TextView		monster_cri_dmg_view	;
    TextView		monster_resistance_view	;
    TextView		monster_accuracy_view	;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuwen_zhanshi);


        rune_1_name_view = (TextView)findViewById(R.id.rune_1_name);
        rune_2_name_view = (TextView)findViewById(R.id.rune_2_name);
        rune_3_name_view = (TextView)findViewById(R.id.rune_3_name);
        rune_4_name_view = (TextView)findViewById(R.id.rune_4_name);
        rune_5_name_view = (TextView)findViewById(R.id.rune_5_name);
        rune_6_name_view = (TextView)findViewById(R.id.rune_6_name);

        rune_1_main_type_view = (TextView)findViewById(R.id.rune_1_main_type);
        rune_2_main_type_view = (TextView)findViewById(R.id.rune_2_main_type);
        rune_3_main_type_view = (TextView)findViewById(R.id.rune_3_main_type);
        rune_4_main_type_view = (TextView)findViewById(R.id.rune_4_main_type);
        rune_5_main_type_view = (TextView)findViewById(R.id.rune_5_main_type);
        rune_6_main_type_view = (TextView)findViewById(R.id.rune_6_main_type);

         rune_1_main_value_view = (TextView)findViewById(R.id.rune_1_main_value);
         rune_2_main_value_view = (TextView)findViewById(R.id.rune_2_main_value);
        rune_3_main_value_view = (TextView)findViewById(R.id.rune_3_main_value);
        rune_4_main_value_view = (TextView)findViewById(R.id.rune_4_main_value);
        rune_5_main_value_view = (TextView)findViewById(R.id.rune_5_main_value);
        rune_6_main_value_view = (TextView)findViewById(R.id.rune_6_main_value);

        rune_1_pref_type_view = (TextView)findViewById(R.id.rune_1_pref_type);
        rune_2_pref_type_view = (TextView)findViewById(R.id.rune_2_pref_type);
        rune_3_pref_type_view = (TextView)findViewById(R.id.rune_3_pref_type);
        rune_4_pref_type_view = (TextView)findViewById(R.id.rune_4_pref_type);
        rune_5_pref_type_view = (TextView)findViewById(R.id.rune_5_pref_type);
        rune_6_pref_type_view = (TextView)findViewById(R.id.rune_6_pref_type);

        rune_1_pref_value_view = (TextView)findViewById(R.id.rune_1_pref_value);
        rune_2_pref_value_view = (TextView)findViewById(R.id.rune_2_pref_value);
        rune_3_pref_value_view = (TextView)findViewById(R.id.rune_3_pref_value);
        rune_4_pref_value_view = (TextView)findViewById(R.id.rune_4_pref_value);
        rune_5_pref_value_view = (TextView)findViewById(R.id.rune_5_pref_value);
        rune_6_pref_value_view = (TextView)findViewById(R.id.rune_6_pref_value);

        rune_1_type_1_view = (TextView)findViewById(R.id.rune_1_type_1);
        rune_2_type_1_view = (TextView)findViewById(R.id.rune_2_type_1);
        rune_3_type_1_view = (TextView)findViewById(R.id.rune_3_type_1);
        rune_4_type_1_view = (TextView)findViewById(R.id.rune_4_type_1);
        rune_5_type_1_view = (TextView)findViewById(R.id.rune_5_type_1);
        rune_6_type_1_view = (TextView)findViewById(R.id.rune_6_type_1);

        rune_1_type_2_view = (TextView)findViewById(R.id.rune_1_type_2);
        rune_2_type_2_view = (TextView)findViewById(R.id.rune_2_type_2);
        rune_3_type_2_view = (TextView)findViewById(R.id.rune_3_type_2);
        rune_4_type_2_view = (TextView)findViewById(R.id.rune_4_type_2);
        rune_5_type_2_view = (TextView)findViewById(R.id.rune_5_type_2);
        rune_6_type_2_view = (TextView)findViewById(R.id.rune_6_type_2);

        rune_1_type_3_view = (TextView)findViewById(R.id.rune_1_type_3);
        rune_2_type_3_view = (TextView)findViewById(R.id.rune_2_type_3);
        rune_3_type_3_view = (TextView)findViewById(R.id.rune_3_type_3);
        rune_4_type_3_view = (TextView)findViewById(R.id.rune_4_type_3);
        rune_5_type_3_view = (TextView)findViewById(R.id.rune_5_type_3);
        rune_6_type_3_view = (TextView)findViewById(R.id.rune_6_type_3);

        rune_1_type_4_view = (TextView)findViewById(R.id.rune_1_type_4);
        rune_2_type_4_view = (TextView)findViewById(R.id.rune_2_type_4);
        rune_3_type_4_view = (TextView)findViewById(R.id.rune_3_type_4);
        rune_4_type_4_view = (TextView)findViewById(R.id.rune_4_type_4);
        rune_5_type_4_view = (TextView)findViewById(R.id.rune_5_type_4);
        rune_6_type_4_view = (TextView)findViewById(R.id.rune_6_type_4);

        rune_1_value_1_view = (TextView)findViewById(R.id.rune_1_value_1);
        rune_2_value_1_view = (TextView)findViewById(R.id.rune_2_value_1);
        rune_3_value_1_view = (TextView)findViewById(R.id.rune_3_value_1);
        rune_4_value_1_view = (TextView)findViewById(R.id.rune_4_value_1);
        rune_5_value_1_view = (TextView)findViewById(R.id.rune_5_value_1);
        rune_6_value_1_view = (TextView)findViewById(R.id.rune_6_value_1);

        rune_1_value_2_view = (TextView)findViewById(R.id.rune_1_value_2);
        rune_2_value_2_view = (TextView)findViewById(R.id.rune_2_value_2);
        rune_3_value_2_view = (TextView)findViewById(R.id.rune_3_value_2);
        rune_4_value_2_view = (TextView)findViewById(R.id.rune_4_value_2);
        rune_5_value_2_view = (TextView)findViewById(R.id.rune_5_value_2);
        rune_6_value_2_view = (TextView)findViewById(R.id.rune_6_value_2);

        rune_1_value_3_view = (TextView)findViewById(R.id.rune_1_value_3);
        rune_2_value_3_view = (TextView)findViewById(R.id.rune_2_value_3);
        rune_3_value_3_view = (TextView)findViewById(R.id.rune_3_value_3);
        rune_4_value_3_view = (TextView)findViewById(R.id.rune_4_value_3);
        rune_5_value_3_view = (TextView)findViewById(R.id.rune_5_value_3);
        rune_6_value_3_view = (TextView)findViewById(R.id.rune_6_value_3);

        rune_1_value_4_view = (TextView)findViewById(R.id.rune_1_value_4);
        rune_2_value_4_view = (TextView)findViewById(R.id.rune_2_value_4);
        rune_3_value_4_view = (TextView)findViewById(R.id.rune_3_value_4);
        rune_4_value_4_view = (TextView)findViewById(R.id.rune_4_value_4);
        rune_5_value_4_view = (TextView)findViewById(R.id.rune_5_value_4);
        rune_6_value_4_view = (TextView)findViewById(R.id.rune_6_value_4);

        monster_name_view = (TextView)findViewById(R.id.monster_name);
        monster_attribute_view = (TextView)findViewById(R.id.monster_attribute);
        monster_star_view = (TextView)findViewById(R.id.monster_star);
        equal_attack_view = (TextView)findViewById(R.id.equal_attack);
        equal_hp_view = (TextView)findViewById(R.id.equal_hp);
        monster_hp_view = (TextView)findViewById(R.id.monster_hp);
        monster_attack_view = (TextView)findViewById(R.id.monster_attack);
        monster_defence_view = (TextView)findViewById(R.id.monster_defence);
        monster_speed_view = (TextView)findViewById(R.id.monster_speed);
        monster_cri_rate_view = (TextView)findViewById(R.id.monster_cri_rate);
        monster_cri_dmg_view = (TextView)findViewById(R.id.monster_cri_dmg);
        monster_resistance_view = (TextView)findViewById(R.id.monster_resistance);
        monster_accuracy_view = (TextView)findViewById(R.id.monster_accuracy);


        //判断是什么计算方式
        String mode = (String)getIntent().getExtras().get("mode");
        int[] result = new int[6];

        if(mode.equals("Attack")){
            BestAttackCalculator bestAttackCalculator = new BestAttackCalculator(fuwenZhanshi.this);
            result = bestAttackCalculator.calculate("莱卡火");
        }else if (mode.equals("Speed")){
            BestSpeedCalculator bestSpeedCalculator = new BestSpeedCalculator(fuwenZhanshi.this);
            result = bestSpeedCalculator.calculate("莱卡火");

        }else if (mode.equals("Tank")){
            BestTankCalculator bestTankCalculator = new BestTankCalculator(fuwenZhanshi.this);
            result = bestTankCalculator.calculate("莱卡火");
        }else if (mode.equals("Free")){
            BestSpeedCalculator bestSpeedCalculator = new BestSpeedCalculator(fuwenZhanshi.this);
            result = bestSpeedCalculator.calculate("莱卡火");

        }else{
            Toast.makeText(getApplicationContext(), "出错啦QAQ 重启试试QAQ", Toast.LENGTH_SHORT).show();
        }





        SingleRuneCalculator src = new SingleRuneCalculator();
        RuneSuitCalculator rsc = new RuneSuitCalculator();


//        int[] result={1,2,3,4,5,6};
        System.out.println("月叔叔好帅");
        monsterinfo_show= new MonsterInfo("莱卡火",11040,834,571,100,15,50,40,0);


        RuneData rd = new RuneData(fuwenZhanshi.this);

        Helper helper =new Helper(fuwenZhanshi.this);
        ArrayList tmpArray  = helper.readSer("Rune.ser");
        ArrayList<Rune> alllist = new ArrayList<Rune>();
        Rune r;
        for(Object o : tmpArray){
            r=(Rune)o;
            alllist.add(r);
        }

        System.out.println("读到了"+alllist.size());
        Rune[] rlist = new Rune[6];
        for(Rune hehe:alllist){
            for(int i = 0;i<6;i++){
                if(hehe.getRuneid()==result[i]){
                    rlist[i]=hehe;
                    break;
                }
            }
        }
        rune_1_name_view.setText(rlist[0].getName()+"");
        rune_2_name_view.setText(rlist[1].getName()+"");
        rune_3_name_view.setText(rlist[2].getName()+"");
        rune_4_name_view.setText(rlist[3].getName()+"");
        rune_5_name_view.setText(rlist[4].getName()+"");
        rune_6_name_view.setText(rlist[5].getName()+"");

        rune_1_main_type_view.setText(rlist[0].getMainType()+"");
        rune_2_main_type_view.setText(rlist[1].getMainType()+"");
        rune_3_main_type_view.setText(rlist[2].getMainType()+"");
        rune_4_main_type_view.setText(rlist[3].getMainType()+"");
        rune_5_main_type_view.setText(rlist[4].getMainType()+"");
        rune_6_main_type_view.setText(rlist[5].getMainType()+"");

        rune_1_main_value_view.setText(rlist[0].getMainValue()+"");
        rune_2_main_value_view.setText(rlist[1].getMainValue()+"");
        rune_3_main_value_view.setText(rlist[2].getMainValue()+"");
        rune_4_main_value_view.setText(rlist[3].getMainValue()+"");
        rune_5_main_value_view.setText(rlist[4].getMainValue()+"");
        rune_6_main_value_view.setText(rlist[5].getMainValue()+"");

        rune_1_pref_type_view.setText(rlist[0].getPrefType()+"");
        rune_2_pref_type_view.setText(rlist[1].getPrefType()+"");
        rune_3_pref_type_view.setText(rlist[2].getPrefType()+"");
        rune_4_pref_type_view.setText(rlist[3].getPrefType()+"");
        rune_5_pref_type_view.setText(rlist[4].getPrefType()+"");
        rune_6_pref_type_view.setText(rlist[5].getPrefType()+"");

        rune_1_pref_value_view.setText(rlist[0].getPrefValue()+"");
        rune_2_pref_value_view.setText(rlist[1].getPrefValue()+"");
        rune_3_pref_value_view.setText(rlist[2].getPrefValue()+"");
        rune_4_pref_value_view.setText(rlist[3].getPrefValue()+"");
        rune_5_pref_value_view.setText(rlist[4].getPrefValue()+"");
        rune_6_pref_value_view.setText(rlist[5].getPrefValue()+"");

        rune_1_type_1_view.setText(rlist[0].getType()[0]+"");
        rune_2_type_1_view.setText(rlist[1].getType()[0]+"");
        rune_3_type_1_view.setText(rlist[2].getType()[0]+"");
        rune_4_type_1_view.setText(rlist[3].getType()[0]+"");
        rune_5_type_1_view.setText(rlist[4].getType()[0]+"");
        rune_6_type_1_view.setText(rlist[5].getType()[0]+"");

        rune_1_type_2_view.setText(rlist[0].getType()[1]+"");
        rune_2_type_2_view.setText(rlist[1].getType()[1]+"");
        rune_3_type_2_view.setText(rlist[2].getType()[1]+"");
        rune_4_type_2_view.setText(rlist[3].getType()[1]+"");
        rune_5_type_2_view.setText(rlist[4].getType()[1]+"");
        rune_6_type_2_view.setText(rlist[5].getType()[1]+"");

        rune_1_type_3_view.setText(rlist[0].getType()[2]+"");
        rune_2_type_3_view.setText(rlist[1].getType()[2]+"");
        rune_3_type_3_view.setText(rlist[2].getType()[2]+"");
        rune_4_type_3_view.setText(rlist[3].getType()[2]+"");
        rune_5_type_3_view.setText(rlist[4].getType()[2]+"");
        rune_6_type_3_view.setText(rlist[5].getType()[2]+"");

        rune_1_type_4_view.setText(rlist[0].getType()[3]+"");
        rune_2_type_4_view.setText(rlist[1].getType()[3]+"");
        rune_3_type_4_view.setText(rlist[2].getType()[3]+"");
        rune_4_type_4_view.setText(rlist[3].getType()[3]+"");
        rune_5_type_4_view.setText(rlist[4].getType()[3]+"");
        rune_6_type_4_view.setText(rlist[5].getType()[3]+"");

        rune_1_value_1_view.setText(rlist[0].getValue()[0]+"");
        rune_2_value_1_view.setText(rlist[1].getValue()[0]+"");
        rune_3_value_1_view.setText(rlist[2].getValue()[0]+"");
        rune_4_value_1_view.setText(rlist[3].getValue()[0]+"");
        rune_5_value_1_view.setText(rlist[4].getValue()[0]+"");
        rune_6_value_1_view.setText(rlist[5].getValue()[0]+"");

        rune_1_value_2_view.setText(rlist[0].getValue()[1]+"");
        rune_2_value_2_view.setText(rlist[1].getValue()[1]+"");
        rune_3_value_2_view.setText(rlist[2].getValue()[1]+"");
        rune_4_value_2_view.setText(rlist[3].getValue()[1]+"");
        rune_5_value_2_view.setText(rlist[4].getValue()[1]+"");
        rune_6_value_2_view.setText(rlist[5].getValue()[1]+"");

        rune_1_value_3_view.setText(rlist[0].getValue()[2]+"");
        rune_2_value_3_view.setText(rlist[1].getValue()[2]+"");
        rune_3_value_3_view.setText(rlist[2].getValue()[2]+"");
        rune_4_value_3_view.setText(rlist[3].getValue()[2]+"");
        rune_5_value_3_view.setText(rlist[4].getValue()[2]+"");
        rune_6_value_3_view.setText(rlist[5].getValue()[2]+"");

        rune_1_value_4_view.setText(rlist[0].getValue()[3]+"");
        rune_2_value_4_view.setText(rlist[1].getValue()[3]+"");
        rune_3_value_4_view.setText(rlist[2].getValue()[3]+"");
        rune_4_value_4_view.setText(rlist[3].getValue()[3]+"");
        rune_5_value_4_view.setText(rlist[4].getValue()[3]+"");
        rune_6_value_4_view.setText(rlist[5].getValue()[3]+"");







        MonsterInfo src_result1 = src.SingleRuneCalculate(rlist[0],
                monsterinfo_show);
        MonsterInfo src_result2 = src.SingleRuneCalculate(rlist[1],
                monsterinfo_show);
        MonsterInfo src_result3 = src.SingleRuneCalculate(rlist[2],
                monsterinfo_show);
        MonsterInfo src_result4 = src.SingleRuneCalculate(rlist[3],
                monsterinfo_show);
        MonsterInfo src_result5 = src.SingleRuneCalculate(rlist[4],
                monsterinfo_show);
        MonsterInfo src_result6 = src.SingleRuneCalculate(rlist[5],
                monsterinfo_show);

        MonsterInfo totalResult = new MonsterInfo();

        totalResult.add(src_result1);
        totalResult.add(src_result2);
        totalResult.add(src_result3);
        totalResult.add(src_result4);
        totalResult.add(src_result5);
        totalResult.add(src_result6);

        MonsterInfo rsc_result = rsc.RuneSuitCalculate(
                monsterinfo_show, rlist[0], rlist[1], rlist[2], rlist[3], rlist[4], rlist[5]);

        totalResult.add(rsc_result);

        monster_hp_view.setText(monsterinfo_show.getHp()+"+"+totalResult.getHp()+"="+(monsterinfo_show.getHp()+totalResult.getHp()));
        monster_attack_view.setText(monsterinfo_show.getAttack()+"+"+totalResult.getAttack()+"="+(monsterinfo_show.getAttack()+totalResult.getAttack()));
        monster_defence_view.setText(monsterinfo_show.getDefence()+"+"+totalResult.getDefence()+"="+(monsterinfo_show.getDefence()+totalResult.getDefence()));
        monster_speed_view.setText(monsterinfo_show.getSpeed()+"+"+totalResult.getSpeed()+"="+(monsterinfo_show.getSpeed()+totalResult.getSpeed()));
        monster_cri_rate_view.setText(monsterinfo_show.getCri_rate()+"+"+totalResult.getCri_rate()+"="+(monsterinfo_show.getCri_rate()+totalResult.getCri_rate()));
        monster_cri_dmg_view.setText(monsterinfo_show.getCri_dmg()+"+"+totalResult.getCri_dmg()+"="+(monsterinfo_show.getCri_dmg()+totalResult.getCri_dmg()));
        monster_resistance_view.setText(monsterinfo_show.getResistance()+"+"+totalResult.getResistance()+"="+(monsterinfo_show.getResistance()+totalResult.getResistance()));
        monster_accuracy_view.setText(monsterinfo_show.getAccuracy()+"+"+totalResult.getAccuracy()+"="+(monsterinfo_show.getAccuracy()+totalResult.getAccuracy()));


        Monster monster4 = new Monster("莱卡","火",6);

        monster_name_view.setText(monster4.getMonstername());
        monster_attribute_view.setText(monster4.getAttribute());
        monster_star_view.setText(monster4.getStar()+"");

        totalResult.add(monsterinfo_show);
        int equalHp = (int) (totalResult.getHp()/((333.0)/(333+totalResult.getDefence())));
        int equalAttack = (int) (totalResult.getAttack()*((100-totalResult.getCri_rate())/100.0+totalResult.getCri_rate()*(100+totalResult.getCri_dmg())/100.0/100.0));
        equal_attack_view.setText(""+equalAttack);
        equal_hp_view.setText(""+equalHp);



        fanhui_monijieguo=(Button)findViewById(R.id.fanhui_monijieguo);
        fanhui_monijieguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fuwenZhanshi.this, moshiXuanze.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fuwen_zhanshi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public ArrayList<Monster> readMonsterList() {
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
}
