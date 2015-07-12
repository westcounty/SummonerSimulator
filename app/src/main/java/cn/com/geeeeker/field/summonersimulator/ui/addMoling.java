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


            Monster monster = new Monster("扎伊诺斯","火",6);
            Monster monster2 = new Monster("布拉格","水",6);
            Monster monster3 = new Monster("查燚斐","帅",6);
            MonsterInfo monsterInfo= new MonsterInfo("扎伊诺斯火",9720,911,582,94,30,50,15,0);
            MonsterInfo monsterInfo2= new MonsterInfo("布拉格水",8000,500,560,100,15,50,15,25);
            MonsterInfo monsterInfo3= new MonsterInfo("查燚斐帅",8000,500,560,100,15,50,15,25);
            ArrayList<Monster> tmp= new ArrayList();
            ArrayList<MonsterInfo> tmpMonsterInfo = new ArrayList();
            tmp.add(monster);
            tmp.add(monster2);
            tmp.add(monster3);
            tmpMonsterInfo.add(monsterInfo);
            tmpMonsterInfo.add(monsterInfo2);
            tmpMonsterInfo.add(monsterInfo3);

//            saveMonsterInfoList(tmpMonsterInfo);
//            saveMonsterList(tmp);
            ArrayList tmpMonsterArray= new ArrayList();
            ArrayList tmpMonsterInfoArray = new ArrayList();
            for (Monster m : tmp) {
                Object o = (Object) m;
                tmpMonsterArray.add(o);
            }
            helper.saveSer("monster.ser",tmpMonsterArray);

            for (MonsterInfo m : tmpMonsterInfo) {
                Object o = (Object) m;
                tmpMonsterInfoArray.add(o);
            }
            helper.saveSer("monsterinfo.ser",tmpMonsterInfoArray);

            ArrayList content = new ArrayList();
            content=helper.readSer("monster.ser");

            Monster tmpMon = (Monster)tmp.get(0);

            //根据魔灵数据创建ListView显示信息
            molinglist = (ListView)findViewById(R.id.list_molingguanli);


            MonsterData molingdata =  new MonsterData(addMoling.this);
            ArrayList tmp_molingxinxi= readMonsterList();
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
                    cur_pos = position;

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

                    //获取现在选取的魔灵ID
                    String wannerId=molingliebiao_name.getText().toString()+molingliebiao_shuxing.getText().toString();
                    ArrayList monsterlist = helper.readSer("monsterinfo.ser");
                    Monster tmpMonster;
                    for(int i=0;i<monsterlist.size();i++){
                        tmpMonster=(Monster)monsterlist.get(i);
                        if(tmpMonster.getId().equals(wannerId)){
                            Toast.makeText(getApplicationContext(), tmpMonster.getId(),  Toast.LENGTH_SHORT).show();
//                            xiaoguomingzhong_molingguanli.setText(currentMonsterInfo.getAccuracy());
//                            tili_molingguanli.setText(currentMonsterInfo.getHp());
//                            xiaoguodikang_molingguanli.setText(currentMonsterInfo.getResistance());
//                            baojishanghai_molingguanli.setText(currentMonsterInfo.getCri_dmg());
//                            baojilv_molingguanli.setText(currentMonsterInfo.getCri_rate());
//                            gongjisudu_molingguanli.setText(currentMonsterInfo.getSpeed());
//                            fangyuli_molingguanli.setText(currentMonsterInfo.getDefence());
//                            gongjili_molingguanli.setText(currentMonsterInfo.getAttack());
                        }
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


