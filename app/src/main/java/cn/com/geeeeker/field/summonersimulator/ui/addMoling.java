package cn.com.geeeeker.field.summonersimulator.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.geeeeker.field.summonersimulator.R;
import cn.com.geeeeker.field.summonersimulator.controller.Controller;
import cn.com.geeeeker.field.summonersimulator.data.Helper;
import cn.com.geeeeker.field.summonersimulator.data.MonsterData;
import cn.com.geeeeker.field.summonersimulator.model.Monster;
import cn.com.geeeeker.field.summonersimulator.model.MonsterInfo;

public class addMoling extends Activity {

    ListView molinglist;
    Button tianjia_molingguanli,shanchu_molingguanli,xiugai_molingguanli;
    Controller controller = new Controller(addMoling.this);
    Helper helper = new Helper(addMoling.this);
    int cur_pos = 0; //行指针
    TextView xiaoguomingzhong_molingguanli,xiaoguodikang_molingguanli,baojishanghai_molingguanli,baojilv_molingguanli,gongjisudu_molingguanli,fangyuli_molingguanli,gongjili_molingguanli,tili_molingguanli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_moling);

        initMolingData();



        //添加魔灵
        tianjia_molingguanli= (Button)findViewById(R.id.tianjia_molingguanli);
        tianjia_molingguanli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
            }
        });

        //修改魔灵
        xiugai_molingguanli= (Button)findViewById(R.id.xiugai_molingguanli);

        //删除魔灵
        shanchu_molingguanli= (Button)findViewById(R.id.shanchu_molingguanli);
    }

    private void initMolingData() {
        //读取魔灵数据，若没有则创建空数据。
        final Helper helper = new Helper(addMoling.this);


                xiaoguomingzhong_molingguanli=(TextView)findViewById(R.id.xiaoguomingzhong_molingguanli);
                xiaoguodikang_molingguanli=(TextView)findViewById(R.id.xiaoguodikang_molingguanli);
                baojishanghai_molingguanli=(TextView)findViewById(R.id.baojishanghai_molingguanli);
                baojilv_molingguanli=(TextView)findViewById(R.id.baojilv_molingguanli);
                gongjisudu_molingguanli=(TextView)findViewById(R.id.gongjisudu_molingguanli);
                fangyuli_molingguanli=(TextView)findViewById(R.id.fangyuli_molingguanli);
                gongjili_molingguanli=(TextView)findViewById(R.id.gongjili_molingguanli);
                tili_molingguanli=(TextView)findViewById(R.id.tili_molingguanli);

        try{
            Monster monster1 = new Monster("扎伊诺斯","火",6);
            Monster monster2 = new Monster("凡妮莎","火",6);
            Monster monster3 = new Monster("拉坎","火",6);
            Monster monster4 = new Monster("莱卡","火",6);
            Monster monster5 = new Monster("贝拉爵日","火",6);
            Monster monster6 = new Monster("卡珊德拉","火",4);
            Monster monster7 = new Monster("塔卡罗斯","火",4);
            Monster monster8 = new Monster("梅","火",4);
            Monster monster9 = new Monster("费德海","火",5);
            Monster monster10 = new Monster("克洛伊","火",5);
            Monster monster11 = new Monster("伯雷塔","火",5);
            Monster monster12 = new Monster("琼","火",5);
            Monster monster13 = new Monster("克拉拉","火",5);

            Monster monster14 = new Monster("卡米拉","水",6);
            Monster monster15 = new Monster("塔奥勒","水",6);
            Monster monster16 = new Monster("布拉格","水",6);
            Monster monster17 = new Monster("乔","水",6);
            Monster monster18 = new Monster("艾伦","水",4);
            Monster monster19 = new Monster("莉娜","水",4);
            Monster monster20 = new Monster("夏伦","水",4);
            Monster monster21 = new Monster("梅根","水",4);
            Monster monster22 = new Monster("迈锡尼","水",5);
            Monster monster23 = new Monster("塔依伦","水",5);
            Monster monster24 = new Monster("苏萨诺","水",5);
            Monster monster25 = new Monster("朱莉","水",5);

            Monster monster26 = new Monster("凯塔琳娜","风",6);
            Monster monster27 = new Monster("塞阿拉","风",6);
            Monster monster28 = new Monster("夏洛特","风",6);
            Monster monster29 = new Monster("伯纳德","风",4);
            Monster monster30 = new Monster("拉马古斯","风",3);
            Monster monster31 = new Monster("谢诺","风",3);
            Monster monster32 = new Monster("米歇尔","风",4);
            Monster monster33 = new Monster("阿德拉","风",4);
            Monster monster34 = new Monster("阿郎","风",5);
            Monster monster35 = new Monster("路森","风",5);
            Monster monster36 = new Monster("蔡善","风",5);
            Monster monster37 = new Monster("燕","风",5);

            MonsterInfo monsterInfo1= new MonsterInfo("扎伊诺斯火",9720,911,582,94,30,50,15,0);
            MonsterInfo monsterInfo2= new MonsterInfo("凡妮莎火",10875,703,714,101,15,50,40,0);
            MonsterInfo monsterInfo3= new MonsterInfo("拉坎火",11700,725,637,95,30,50,40,0);
            MonsterInfo monsterInfo4= new MonsterInfo("莱卡火",11040,834,571,100,15,50,40,0);
            MonsterInfo monsterInfo5= new MonsterInfo("贝拉爵日火",10500,681,790,95,30,50,15,0);
            MonsterInfo monsterInfo6= new MonsterInfo("卡珊德拉火",4905,428,226,105,15,50,15,0);
            MonsterInfo monsterInfo7= new MonsterInfo("塔卡罗斯火",4185,493,208,95,15,50,15,0);
            MonsterInfo monsterInfo8= new MonsterInfo("梅火",4455,404,289,104,15,50,40,0);
            MonsterInfo monsterInfo9= new MonsterInfo("费德海火",7260,597,371,99,15,50,15,0);
            MonsterInfo monsterInfo10= new MonsterInfo("克洛伊火",8595,404,476,111,15,50,15,0);
            MonsterInfo monsterInfo11= new MonsterInfo("伯雷塔火",8235,500,404,105,15,50,15,0);
            MonsterInfo monsterInfo12= new MonsterInfo("琼火",6660,654,355,105,15,50,15,0);
            MonsterInfo monsterInfo13= new MonsterInfo("克拉拉火",8235,565,339,103,15,50,15,0);

            MonsterInfo monsterInfo14= new MonsterInfo("布拉格水",11040,692,714,100,15,50,15,25);
            MonsterInfo monsterInfo15= new MonsterInfo("乔水",13005,681,593,100,30,50,15,25);
            MonsterInfo monsterInfo16= new MonsterInfo("卡米拉水",12015,714,626,101,30,50,15,0);
            MonsterInfo monsterInfo17= new MonsterInfo("塔奥勒水",9885,911,571,95,30,50,15,0);
            MonsterInfo monsterInfo18= new MonsterInfo("艾伦水",4905,446,208,102,15,50,15,0);
            MonsterInfo monsterInfo19= new MonsterInfo("莉娜水",5790,238,356,96,15,50,40,0);
            MonsterInfo monsterInfo20= new MonsterInfo("夏伦水",4455,446,238,105,15,50,15,0);
            MonsterInfo monsterInfo21= new MonsterInfo("梅根水",5340,315,309,97,15,50,15,0);
            MonsterInfo monsterInfo22= new MonsterInfo("迈锡尼水",6540,581,436,96,15,50,15,0);
            MonsterInfo monsterInfo23= new MonsterInfo("塔依伦水",7995,533,387,105,15,50,15,0);
            MonsterInfo monsterInfo24= new MonsterInfo("苏萨诺水",5940,670,387,107,15,50,15,0);
            MonsterInfo monsterInfo25= new MonsterInfo("朱莉水",7755,613,323,103,15,50,15,0);

            MonsterInfo monsterInfo26= new MonsterInfo("凯塔琳娜风",11205,801,593,116,15,50,15,0);
            MonsterInfo monsterInfo27= new MonsterInfo("塞阿拉风",10875,801,615,100,15,50,15,25);
            MonsterInfo monsterInfo28= new MonsterInfo("夏洛特风",10380,845,604,105,15,50,15,25);
            MonsterInfo monsterInfo29= new MonsterInfo("伯纳德风",5610,226,380,111,15,50,15,0);
            MonsterInfo monsterInfo30= new MonsterInfo("拉马古斯风",4185,153,223,102,15,50,15,0);
            MonsterInfo monsterInfo31= new MonsterInfo("谢诺风",2880,240,223,111,15,50,15,0);
            MonsterInfo monsterInfo32= new MonsterInfo("米歇尔风",6060,297,279,96,15,50,40,0);
            MonsterInfo monsterInfo33= new MonsterInfo("阿德拉风",4095,457,250,105,15,50,15,0);
            MonsterInfo monsterInfo34= new MonsterInfo("阿郎风",7260,694,274,102,15,50,15,0);
            MonsterInfo monsterInfo35= new MonsterInfo("路森风",6780,662,339,103,15,50,15,0);
            MonsterInfo monsterInfo36= new MonsterInfo("蔡善风",8115,484,428,101,15,50,40,0);
            MonsterInfo monsterInfo37= new MonsterInfo("燕风",7500,573,379,104,30,50,15,0);

            ArrayList<Monster> tmp= new ArrayList<Monster>();
            ArrayList<MonsterInfo> tmpMonsterInfo = new ArrayList<MonsterInfo>();


            tmp.add(monster1);
            tmp.add(monster2);
            tmp.add(monster3);
            tmp.add(monster4);
            tmp.add(monster5);
            tmp.add(monster6);
            tmp.add(monster7);
            tmp.add(monster8);
            tmp.add(monster9);
            tmp.add(monster10);
            tmp.add(monster11);
            tmp.add(monster12);
            tmp.add(monster13);
            tmp.add(monster14);
            tmp.add(monster15);
            tmp.add(monster16);
            tmp.add(monster17);
            tmp.add(monster18);
            tmp.add(monster19);
            tmp.add(monster20);
            tmp.add(monster21);
            tmp.add(monster22);
            tmp.add(monster23);
            tmp.add(monster24);
            tmp.add(monster25);
            tmp.add(monster26);
            tmp.add(monster27);
            tmp.add(monster28);
            tmp.add(monster29);
            tmp.add(monster30);
            tmp.add(monster31);
            tmp.add(monster32);
            tmp.add(monster33);
            tmp.add(monster34);
            tmp.add(monster35);
            tmp.add(monster36);
            tmp.add(monster37);

            tmpMonsterInfo.add(monsterInfo1);
            tmpMonsterInfo.add(monsterInfo2);
            tmpMonsterInfo.add(monsterInfo3);
            tmpMonsterInfo.add(monsterInfo4);
            tmpMonsterInfo.add(monsterInfo5);
            tmpMonsterInfo.add(monsterInfo6);
            tmpMonsterInfo.add(monsterInfo7);
            tmpMonsterInfo.add(monsterInfo8);
            tmpMonsterInfo.add(monsterInfo9);
            tmpMonsterInfo.add(monsterInfo10);
            tmpMonsterInfo.add(monsterInfo11);
            tmpMonsterInfo.add(monsterInfo12);
            tmpMonsterInfo.add(monsterInfo13);
            tmpMonsterInfo.add(monsterInfo14);
            tmpMonsterInfo.add(monsterInfo15);
            tmpMonsterInfo.add(monsterInfo16);
            tmpMonsterInfo.add(monsterInfo17);
            tmpMonsterInfo.add(monsterInfo18);
            tmpMonsterInfo.add(monsterInfo19);
            tmpMonsterInfo.add(monsterInfo20);
            tmpMonsterInfo.add(monsterInfo21);
            tmpMonsterInfo.add(monsterInfo22);
            tmpMonsterInfo.add(monsterInfo23);
            tmpMonsterInfo.add(monsterInfo24);
            tmpMonsterInfo.add(monsterInfo25);
            tmpMonsterInfo.add(monsterInfo26);
            tmpMonsterInfo.add(monsterInfo27);
            tmpMonsterInfo.add(monsterInfo28);
            tmpMonsterInfo.add(monsterInfo29);
            tmpMonsterInfo.add(monsterInfo30);
            tmpMonsterInfo.add(monsterInfo31);
            tmpMonsterInfo.add(monsterInfo32);
            tmpMonsterInfo.add(monsterInfo33);
            tmpMonsterInfo.add(monsterInfo34);
            tmpMonsterInfo.add(monsterInfo35);
            tmpMonsterInfo.add(monsterInfo36);
            tmpMonsterInfo.add(monsterInfo37);

//            saveMonsterInfoList(tmpMonsterInfo);
//            saveMonsterList(tmp);
            ArrayList tmpMonsterArray= new ArrayList();
            ArrayList tmpMonsterInfoArray = new ArrayList();
            for (Monster m : tmp) {
                Object o = (Object) m;
                tmpMonsterArray.add(o);
            }
//            helper.saveSer("monster.ser",tmpMonsterArray);
//            Toast.makeText(getApplicationContext(), tmpMonsterInfoArray.size(),  Toast.LENGTH_LONG).show();
            System.out.println("写入"+helper.saveSer("monster.ser",tmpMonsterArray));

            for (MonsterInfo m : tmpMonsterInfo) {
                Object o = (Object) m;
                tmpMonsterInfoArray.add(o);
            }
//            helper.saveSer("monsterinfo.ser",tmpMonsterInfoArray);
            System.out.println("写入"+helper.saveSer("monsterinfo.ser",tmpMonsterInfoArray));





            ArrayList content = new ArrayList();
            content=helper.readSer("monster.ser");
            System.out.println("读取正常"+content.size());
//            Monster tmpMon = (Monster)tmp.get(0);

            //根据魔灵数据创建ListView显示信息
            molinglist = (ListView)findViewById(R.id.list_molingguanli);
            System.out.println("获取ListView成功");


            MonsterData molingdata =  new MonsterData(addMoling.this);

            ArrayList tmp_molingxinxi= readMonsterList();
            System.out.println("读取正常"+tmp_molingxinxi.size());
            List<Map<String, Object>> molingxinxi = getAllMolingData(tmp_molingxinxi);
            final SimpleAdapter molingAdapter  = new SimpleAdapter(this,molingxinxi,R.layout.moling_list,new String[] {"molingmingcheng",
                    "molingshuxing","molingxingji"},
                    new int[] {R.id.molingliebiao_name,R.id.molingliebiao_shuxing,R.id.molingliebiao_xingji});
            molinglist.setAdapter(molingAdapter);
            molinglist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            //设置item点击事件
            molinglist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    TextView molingliebiao_name = (TextView)view.findViewById(R.id.molingliebiao_name);
                    TextView molingliebiao_shuxing = (TextView)view.findViewById(R.id.molingliebiao_shuxing);
                    TextView  molingliebiao_xingji = (TextView)view.findViewById(R.id. molingliebiao_xingji);
                    //有选中效果/取消选中效果
//                    view.setSelected(false);
                    if(molingliebiao_name.getCurrentTextColor()==0xff221109){
                        //现在没有被选中
                        molingliebiao_name.setTextColor(0xfff6eac9);
                        molingliebiao_shuxing.setTextColor(0xfff6eac9);
                        molingliebiao_xingji.setTextColor(0xfff6eac9);
                    }else{
                        molingliebiao_name.setTextColor(0xff221109);
                        molingliebiao_shuxing.setTextColor(0xff221109);
                        molingliebiao_xingji.setTextColor(0xff221109);
                    }

                    //取消其他View的选中效果
                   View past_view= molinglist.getChildAt(cur_pos);
                    TextView molingliebiao_name_past = (TextView)past_view.findViewById(R.id.molingliebiao_name);
                    TextView molingliebiao_shuxing_past = (TextView)past_view.findViewById(R.id.molingliebiao_shuxing);
                    TextView  molingliebiao_xingji_past = (TextView)past_view.findViewById(R.id. molingliebiao_xingji);
                    molingliebiao_name_past.setTextColor(0xff221109);
                    molingliebiao_shuxing_past.setTextColor(0xff221109);
                    molingliebiao_xingji_past.setTextColor(0xff221109);

                    //获取现在选取的魔灵ID
                    String wannerId=molingliebiao_name.getText().toString()+molingliebiao_shuxing.getText().toString();
                    ArrayList monsterlist = helper.readSer("monsterinfo.ser");
                    System.out.println("读到的魔灵信息条数"+monsterlist.size());
                    MonsterInfo tmpMonster= null;
                    for(int i=0;i<monsterlist.size();i++){
                        tmpMonster=(MonsterInfo)monsterlist.get(i);
                        if(tmpMonster.getId().equals(wannerId)){
//                            Toast.makeText(getApplicationContext(), tmpMonster.getId(),  Toast.LENGTH_SHORT).show();
                            xiaoguomingzhong_molingguanli.setText(tmpMonster.getAccuracy()+"");
                            tili_molingguanli.setText(tmpMonster.getHp()+"");
                            xiaoguodikang_molingguanli.setText(tmpMonster.getResistance()+"");
                            baojishanghai_molingguanli.setText(tmpMonster.getCri_dmg()+"");
                            baojilv_molingguanli.setText(tmpMonster.getCri_rate()+"");
                            gongjisudu_molingguanli.setText(tmpMonster.getSpeed()+"");
                            fangyuli_molingguanli.setText(tmpMonster.getDefence()+"");
                            gongjili_molingguanli.setText(tmpMonster.getAttack()+"");
                            break;
                        }


                        cur_pos = position;
                    }


                }

            });



            Toast.makeText(getApplicationContext(), "魔灵信息加载成功",  Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "魔灵信息读取失败QAQ",
                    Toast.LENGTH_SHORT).show();
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_moling, menu);
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


    public MonsterInfo readMonsterInfo(String id) {
        // 按id读取魔灵数据
        ArrayList<MonsterInfo> monsterinfolist = readMonsterInfoList();
        for (MonsterInfo mi : monsterinfolist) {
            if (mi.getId().equals(id)) {
                return mi;
            }
        }
        return null;
    }

    public boolean addMonsterInfo(MonsterInfo monsterinfo) {
        // 添加一个魔灵数据
        ArrayList<MonsterInfo> monsterinfolist = this.readMonsterInfoList();
        boolean find = false;
        for (MonsterInfo mi : monsterinfolist) {
            if (monsterinfo.getId().equals(mi.getId())) {
                find = true;
                break;
            }
        }

        if (!find) {
            monsterinfolist.add(monsterinfo);
            helper.saveSer("monsterinfo.ser", monsterinfolist);
        }

        return !find;

    }

    public boolean addMonster(Monster monster) {
        //添加魔灵
        ArrayList<Monster> monsterlist = this.readMonsterList();
        boolean find = false;
        for (Monster m : monsterlist) {
            if (monster.getId().equals(m.getId())) {
                find = true;
                break;
            }
        }

        if (!find) {
            monsterlist.add(monster);
            helper.saveSer("monster.ser", monsterlist);
        }

        return !find;

    }


    public boolean EditMonsterInfo(String id, MonsterInfo monsterinfo) {
        // 保存一个魔灵数据
        ArrayList<MonsterInfo> monsterinfolist = this.readMonsterInfoList();
        boolean find = false;
        for (MonsterInfo mi : monsterinfolist) {
            if (id.equals(mi.getId())) {
                find = true;
                int index = monsterinfolist.indexOf(mi);
                monsterinfolist.set(index, monsterinfo);
                break;
            }
        }

        if (find) {
            helper.saveSer("monsterinfo.ser", monsterinfolist);
        }

        return find;

    }

    public ArrayList<MonsterInfo> readMonsterInfoList() {
        // 读取全部魔灵数据
        ArrayList<Object> readlist = new ArrayList<Object>();
        readlist = helper.readSer("monsterInfo.ser");

        ArrayList<MonsterInfo> resultlist = new ArrayList<MonsterInfo>();
        for (Object o : readlist) {
            MonsterInfo mi = (MonsterInfo) o;
            resultlist.add(mi);
        }

        return resultlist;

    }

    public void saveMonsterInfoList(ArrayList<MonsterInfo> list) {
        // 保存全部魔灵数据
        ArrayList<Object> savelist = new ArrayList<Object>();
        ArrayList<MonsterInfo> tmp = new ArrayList<MonsterInfo>();
        tmp=readMonsterInfoList();
        int index=0;
        if(tmp.size()!=0) {
            for (MonsterInfo m : list) {
                index=0;
                for (MonsterInfo t:tmp){
                    if (t.getId().equals(m.getId()))
                    {
                        index = 1;  //重复
                        break;}
                }
                if(index==0){
                Object o = (Object) m;
                savelist.add(o);}
            }
        }else{
            for (MonsterInfo m : list) {
                Object o = (Object) m;
                savelist.add(o);}
        }

        helper.saveSer("monster.ser", savelist);
    }

    public void saveMonsterList(ArrayList<Monster> list) {
        // 保存魔灵列表
        ArrayList<Object> savelist = new ArrayList<Object>();
        ArrayList<Monster> tmp = new ArrayList<Monster>();
        tmp=readMonsterList();
        int index = 0;
        if(tmp.size()!=0) {

            for (Monster m : list) {
                for (Monster t:tmp){
                    if (t.getId().equals(m.getId()))
                    {
                        index = 1;  //重复
                        break;}
                }
                if(index==0){
                    Object o = (Object) m;
                    savelist.add(o);}
            }
        }else{
            for (Monster m : list) {
                Object o = (Object) m;
                savelist.add(o);}
        }

        helper.saveSer("monster.ser", savelist);
    }

    public void DeleteMonsterInfo(String id) {
        // 按id删除魔灵数据
        ArrayList<MonsterInfo> list = this.readMonsterInfoList();

        for (MonsterInfo mi : list) {
            int index = list.indexOf(mi);
            if (mi.getId().equals(id)) {
                list.remove(index);
                break;
            }
        }

        this.saveMonsterInfoList(list);
    }
}


