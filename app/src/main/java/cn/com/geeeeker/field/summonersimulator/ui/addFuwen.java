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
import cn.com.geeeeker.field.summonersimulator.data.RuneData;
import cn.com.geeeeker.field.summonersimulator.model.Rune;

public class addFuwen extends Activity {

    ListView fuwenlist;

    Button tianjia_fuwenguanli,shanchu_fuwenguanli,xiugai_fuwenguanli;

    Controller controller = new Controller(addFuwen.this);

    Helper helper = new Helper(addFuwen.this);

    int cur_pos = 0; //行指针

    TextView zhushuxing_fuwenguanli,zhushuxing_zhi_fuwenguanli,qianzhuishuxing_fuwenguanli,qianzhuishuxing_zhi_fuwenguanli,fushuxing1_fuwenguanli,fushuxing1_zhi_fuwenguanli,fushuxing2_fuwenguanli,fushuxing2_zhi_fuwenguanli,fushuxing3_fuwenguanli,fushuxing3_zhi_fuwenguanli,fushuxing4_fuwenguanli,fushuxing4_zhi_fuwenguanli;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fuwen);

        initfuwenData();



        //添加符文
        tianjia_fuwenguanli= (Button)findViewById(R.id.tianjia_fuwenguanli);
        tianjia_fuwenguanli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
            }
        });

        //修改符文
        xiugai_fuwenguanli= (Button)findViewById(R.id.xiugai_fuwenguanli);

        //删除符文
        shanchu_fuwenguanli= (Button)findViewById(R.id.shanchu_fuwenguanli);
    }

    private void initfuwenData() {
        //读取数据，若没有则创建空数据。
        final Helper helper = new Helper(addFuwen.this);


        zhushuxing_fuwenguanli=(TextView)findViewById(R.id.zhushuxing_fuwenguanli);
        zhushuxing_zhi_fuwenguanli=(TextView)findViewById(R.id.zhushuxing_zhi_fuwenguanli);
        qianzhuishuxing_fuwenguanli=(TextView)findViewById(R.id.qianzhuishuxing_fuwenguanli);
        qianzhuishuxing_zhi_fuwenguanli=(TextView)findViewById(R.id.qianzhuishuxing_zhi_fuwenguanli);
        fushuxing1_fuwenguanli=(TextView)findViewById(R.id.fushuxing1_fuwenguanli);
        fushuxing1_zhi_fuwenguanli=(TextView)findViewById(R.id.fushuxing1_zhi_fuwenguanli);
        fushuxing2_fuwenguanli=(TextView)findViewById(R.id.fushuxing2_fuwenguanli);
        fushuxing2_zhi_fuwenguanli=(TextView)findViewById(R.id.fushuxing2_zhi_fuwenguanli);
        fushuxing3_fuwenguanli=(TextView)findViewById(R.id.fushuxing3_fuwenguanli);
        fushuxing3_zhi_fuwenguanli=(TextView)findViewById(R.id.fushuxing3_zhi_fuwenguanli);
        fushuxing4_fuwenguanli=(TextView)findViewById(R.id.fushuxing4_zhi_fuwenguanli);
        fushuxing4_zhi_fuwenguanli=(TextView)findViewById(R.id.fushuxing4_zhi_fuwenguanli);

        try{
            Rune rune1 = new Rune("1","迅速",1,"攻击力",135,"",0,"体力%",6,"攻击速度",5,"暴击率%",8,"攻击力%",25);
            Rune rune2 = new Rune("2","迅速",2,"攻击速度",31,"",0,"攻击速度",3,"暴击伤害%",4,"体力%",4,"效果命中%",5);
            Rune rune3 = new Rune("3","集中",3,"防御力",118,"体力",206,"暴击率%",18,"效果抵抗%",7,"防御力%",15,"攻击速度",5);
            Rune rune4 = new Rune("4","迅速",4,"攻击力%",37,"",0,"暴击伤害%",12,"攻击速度",3,"攻击力",14,"体力",179);
            Rune rune5 = new Rune("6","迅速",6,"攻击力%",37,"",0,"暴击率%",8,"攻击力",23,"体力",133,"体力%",6);
            Rune rune6 = new Rune("1","猛攻",1,"攻击力",136,"",0,"体力%",6,"攻击速度",5,"暴击率%",8,"攻击力%",25);
            Rune rune7 = new Rune("2","猛攻",2,"攻击力%",31,"",0,"攻击速度",3,"暴击伤害%",4,"体力%",4,"效果命中%",5);
            Rune rune8 = new Rune("3","集中",3,"防御力",118,"体力",207,"暴击率%",18,"效果抵抗%",7,"防御力%",15,"攻击速度",5);
            Rune rune9 = new Rune("4","猛攻",4,"攻击力%",37,"",0,"暴击伤害%",12,"攻击速度",3,"攻击力",14,"体力",179);
            Rune rune10 = new Rune("光比1","集中",1,"攻击力",70,"",0,"体力%",7,"暴击率%",10,"效果命中%",12,"",0);
            Rune rune11 = new Rune("光比2","暴走",2,"体力%",47,"",0,"暴击伤害%",4,"攻击力%",12,"防御力",29,"",0);
            Rune rune12 = new Rune("光比3","集中",3,"防御力",118,"",0,"防御力%",8,"暴击率%",13,"体力",366,"效果命中%",5);
            Rune rune13 = new Rune("光比4","守护",4,"暴击率%",58,"效果命中%",7,"效果抵抗%",16,"攻击速度",6,"攻击力",14,"防御力",20);
            Rune rune14 = new Rune("光比5","暴走",5,"体力",1530,"",0,"暴击率%",9,"效果抵抗%",6,"攻击力",8,"",0);
            Rune rune15 = new Rune("光比6","暴走",6,"体力%",47,"攻击速度",4,"攻击力",31,"防御力",17,"防御力%",8,"",0);
            Rune rune16 = new Rune("光比1-暴113","暴走",1,"攻击力",64,"",0,"暴击率%",9,"体力%",6,"攻击力%",6,"",0);
            Rune rune17 = new Rune("祝福1","祝福",1,"攻击力%",23,"防御力",2,"体力%",3,"体力",23,"效果抵抗%",5,"效果命中%",5);
            Rune rune18 = new Rune("祝福2","祝福",2,"攻击速度",54,"效果命中%",5,"防御力%",23,"攻击力",89,"暴击率%",23,"效果抵抗%",11);
            Rune rune19 = new Rune("祝福3","祝福",3,"防御力",23,"效果抵抗%",20,"体力%",56,"防御力%",45,"暴击伤害%",50,"效果命中%",10);
            Rune rune20 = new Rune("祝福4","祝福",4,"效果抵抗%",21,"效果抵抗%",7,"攻击力",12,"体力%",233,"攻击速度",22,"暴击率%",12);
            Rune rune21 = new Rune("祝福5","祝福",5,"体力",1111,"效果命中%",2,"暴击伤害%",23,"暴击率%",22,"攻击力%",15,"攻击速度",12);
            Rune rune22 = new Rune("祝福6","祝福",6,"效果抵抗%",12,"体力%",23,"效果抵抗%",12,"攻击力",123,"体力",23,"体力%",23);

            ArrayList<Rune> tmp= new ArrayList<Rune>();

            tmp.add(rune1);
            tmp.add(rune2);
            tmp.add(rune3);
            tmp.add(rune4);
            tmp.add(rune5);
            tmp.add(rune6);
            tmp.add(rune7);
            tmp.add(rune8);
            tmp.add(rune9);
            tmp.add(rune10);
            tmp.add(rune11);
            tmp.add(rune12);
            tmp.add(rune13);
            tmp.add(rune14);
            tmp.add(rune15);
            tmp.add(rune16);
            tmp.add(rune17);
            tmp.add(rune18);
            tmp.add(rune19);
            tmp.add(rune20);
            tmp.add(rune21);
            tmp.add(rune22);



//            saveRuneList(tmpRune);
//            saveRuneList(tmp);
            ArrayList tmpRuneArray = new ArrayList();
            for (Rune m : tmp) {
                Object o = (Object) m;
                tmpRuneArray.add(o);
            }

            System.out.println("写入"+helper.saveSer("Rune.ser",tmpRuneArray));

            ArrayList content = new ArrayList();
            content=helper.readSer("Rune.ser");
            System.out.println("读取正常"+content.size());
//            Rune tmpMon = (Rune)tmp.get(0);

            //根据符文数据创建ListView显示信息
            fuwenlist = (ListView)findViewById(R.id.list_fuwenguanli);
            System.out.println("获取ListView成功");


            RuneData fuwendata =  new RuneData(addFuwen.this);

            ArrayList tmp_fuwenxinxi= readRuneList();
            System.out.println("读取正常"+tmp_fuwenxinxi.size());
            List<Map<String, Object>> fuwenxinxi = getAllfuwenData(tmp_fuwenxinxi);
            final SimpleAdapter fuwenAdapter  = new SimpleAdapter(this,fuwenxinxi,R.layout.fuwen_list,new String[] {"fuwenmingcheng",
                    "fuwenshuxing","fuwenxingji"},
                    new int[] {R.id.fuwenliebiao_name,R.id.fuwenliebiao_shuxing,R.id.fuwenliebiao_xingji});
            fuwenlist.setAdapter(fuwenAdapter);
            fuwenlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            //设置item点击事件
            fuwenlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    TextView fuwenliebiao_name = (TextView)view.findViewById(R.id.fuwenliebiao_name);
                    TextView fuwenliebiao_shuxing = (TextView)view.findViewById(R.id.fuwenliebiao_shuxing);
                    TextView  fuwenliebiao_xingji = (TextView)view.findViewById(R.id. fuwenliebiao_xingji);
                    //有选中效果/取消选中效果
//                    view.setSelected(false);
                    if(fuwenliebiao_name.getCurrentTextColor()==0xff221109){
                        //现在没有被选中
                        fuwenliebiao_name.setTextColor(0xfff6eac9);
                        fuwenliebiao_shuxing.setTextColor(0xfff6eac9);
                        fuwenliebiao_xingji.setTextColor(0xfff6eac9);
                    }else{
                        fuwenliebiao_name.setTextColor(0xff221109);
                        fuwenliebiao_shuxing.setTextColor(0xff221109);
                        fuwenliebiao_xingji.setTextColor(0xff221109);
                    }

                    //取消其他View的选中效果
                    View past_view= fuwenlist.getChildAt(cur_pos);
                    TextView fuwenliebiao_name_past = (TextView)past_view.findViewById(R.id.fuwenliebiao_name);
                    TextView fuwenliebiao_shuxing_past = (TextView)past_view.findViewById(R.id.fuwenliebiao_shuxing);
                    TextView  fuwenliebiao_xingji_past = (TextView)past_view.findViewById(R.id. fuwenliebiao_xingji);
                    fuwenliebiao_name_past.setTextColor(0xff221109);
                    fuwenliebiao_shuxing_past.setTextColor(0xff221109);
                    fuwenliebiao_xingji_past.setTextColor(0xff221109);

                    //获取现在选取的符文ID
                   int wannerId=Integer.parseInt(fuwenliebiao_name.getText().toString());
                    ArrayList Runelist = helper.readSer("Rune.ser");
                    System.out.println("读到的符文信息条数"+Runelist.size());
                    Rune tmpRune= null;
                    for(int i=0;i<Runelist.size();i++){
                        tmpRune=(Rune)Runelist.get(i);
                        if(tmpRune.getRuneid()==(wannerId)){
//                            Toast.makeText(getApplicationContext(), tmpRune.getRuneid(),  Toast.LENGTH_SHORT).show();
                            zhushuxing_fuwenguanli.setText(tmpRune.getMainType()+"");
                            zhushuxing_zhi_fuwenguanli.setText(tmpRune.getMainValue()+"");
                            qianzhuishuxing_fuwenguanli.setText(tmpRune.getPrefType()+"");
                            qianzhuishuxing_zhi_fuwenguanli.setText(tmpRune.getPrefValue()+"");
                            fushuxing1_fuwenguanli.setText(tmpRune.getType()[0]+"");
                            fushuxing2_fuwenguanli.setText(tmpRune.getType()[1]+"");
                            fushuxing3_fuwenguanli.setText(tmpRune.getType()[2]+"");
                            fushuxing4_fuwenguanli.setText(tmpRune.getType()[3]+"");
                            fushuxing1_zhi_fuwenguanli.setText(tmpRune.getValue()[0]+"");
                            fushuxing2_zhi_fuwenguanli.setText(tmpRune.getValue()[1]+"");
                            fushuxing3_zhi_fuwenguanli.setText(tmpRune.getValue()[2]+"");
                            fushuxing4_zhi_fuwenguanli.setText(tmpRune.getValue()[3]+"");

                            break;
                        }


                        cur_pos = position;
                    }


                }

            });



            Toast.makeText(getApplicationContext(), "符文信息加载成功", Toast.LENGTH_SHORT).show();

        }catch (Exception e){
//            Toast.makeText(getApplicationContext(), "符文信息读取失败QAQ",
//                    Toast.LENGTH_SHORT).show();
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_fuwen, menu);
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


    //将读取到的所有符文信息包装为Adapter需要的map数组
    public List<Map<String, Object>> getAllfuwenData(ArrayList raw){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map ;
        Rune o;
        for (int i=0;i<raw.size();i++){
            o = (Rune)raw.get(i);
            map=new HashMap<String, Object>();
            map.put("fuwenmingcheng",o.getRuneid());
            map.put("fuwenshuxing",o.getName());
            map.put("fuwenxingji",o.getType());
            list.add(map);
        }

        return  list;
    }




    public ArrayList<Rune> readRuneList() {
        // 读取所有符文信息
        ArrayList<Object> readlist = new ArrayList<Object>();
        readlist = helper.readSer("Rune.ser");

        ArrayList<Rune> resultlist = new ArrayList<Rune>();
        for (Object o : readlist) {
            Rune m = (Rune) o;
            resultlist.add(m);
        }

        return resultlist;

    }


    public Rune readRune(int id) {
        // 按id读取符文数据
        ArrayList<Rune> Runelist = readRuneList();
        for (Rune mi : Runelist) {
            if (mi.getRuneid()==id) {
                return mi;
            }
        }
        return null;
    }

    public boolean addRune(Rune Rune) {
        // 添加一个符文数据
        ArrayList<Rune> Runelist = this.readRuneList();
        boolean find = false;
        for (Rune mi : Runelist) {
            if (Rune.getRuneid()==(mi.getRuneid())) {
                find = true;
                break;
            }
        }

        if (!find) {
            Runelist.add(Rune);
            helper.saveSer("Rune.ser", Runelist);
        }

        return !find;

    }
//
//    public boolean addRune(Rune Rune) {
//        //添加符文
//        ArrayList<Rune> Runelist = this.readRuneList();
//        boolean find = false;
//        for (Rune m : Runelist) {
//            if (Rune.getRuneid().equals(m.getRuneid())) {
//                find = true;
//                break;
//            }
//        }
//
//        if (!find) {
//            Runelist.add(Rune);
//            helper.saveSer("Rune.ser", Runelist);
//        }
//
//        return !find;
//
//    }
//
//
//    public boolean EditRune(String id, Rune Rune) {
//        // 保存一个符文数据
//        ArrayList<Rune> Runelist = this.readRuneList();
//        boolean find = false;
//        for (Rune mi : Runelist) {
//            if (id.equals(mi.getRuneid())) {
//                find = true;
//                int index = Runelist.indexOf(mi);
//                Runelist.set(index, Rune);
//                break;
//            }
//        }
//
//        if (find) {
//            helper.saveSer("Rune.ser", Runelist);
//        }
//
//        return find;
//
//    }


//
//        return resultlist;
//
//    }

//    public void saveRuneList(ArrayList<Rune> list) {
//        // 保存全部符文数据
//        ArrayList<Object> savelist = new ArrayList<Object>();
//        ArrayList<Rune> tmp = new ArrayList<Rune>();
//        tmp=readRuneList();
//        int index=0;
//        if(tmp.size()!=0) {
//            for (Rune m : list) {
//                index=0;
//                for (Rune t:tmp){
//                    if (t.getRuneid()==(m.getRuneid()))
//                    {
//                        index = 1;  //重复
//                        break;}
//                }
//                if(index==0){
//                    Object o = (Object) m;
//                    savelist.add(o);}
//            }
//        }else{
//            for (Rune m : list) {
//                Object o = (Object) m;
//                savelist.add(o);}
//        }
//
//        helper.saveSer("Rune.ser", savelist);
//    }

    public void saveRuneList(ArrayList<Rune> list) {
        // 保存符文列表
        ArrayList<Object> savelist = new ArrayList<Object>();
        ArrayList<Rune> tmp = new ArrayList<Rune>();
        tmp=readRuneList();
        int index = 0;
        if(tmp.size()!=0) {

            for (Rune m : list) {
                for (Rune t:tmp){
                    if (t.getRuneid()==(m.getRuneid()))
                    {
                        index = 1;  //重复
                        break;}
                }
                if(index==0){
                    Object o = (Object) m;
                    savelist.add(o);}
            }
        }else{
            for (Rune m : list) {
                Object o = (Object) m;
                savelist.add(o);}
        }

        helper.saveSer("Rune.ser", savelist);
    }

    public void DeleteRune(int id) {
        // 按id删除符文数据
        ArrayList<Rune> list = this.readRuneList();

        for (Rune mi : list) {
            int index = list.indexOf(mi);
            if (mi.getRuneid()==id) {
                list.remove(index);
                break;
            }
        }

        this.saveRuneList(list);
    }
}
