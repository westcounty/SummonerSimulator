package cn.com.geeeeker.field.summonersimulator.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.com.geeeeker.field.summonersimulator.R;
import cn.com.geeeeker.field.summonersimulator.controller.Controller;
import cn.com.geeeeker.field.summonersimulator.data.Helper;
import cn.com.geeeeker.field.summonersimulator.data.MonsterData;
import cn.com.geeeeker.field.summonersimulator.model.Monster;

public class addMoling extends Activity {

    ListView molinglist;
    Button tianjia_molingguanli,shanchu_molingguanli,xiugai_molingguanli;
    Controller controller = new Controller(addMoling.this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_moling);

        initMolingData();



        //添加魔灵
        tianjia_molingguanli= (Button)findViewById(R.id.tianjia_molingguanli);

        //修改魔灵
        xiugai_molingguanli= (Button)findViewById(R.id.xiugai_molingguanli);

        //删除魔灵
        shanchu_molingguanli= (Button)findViewById(R.id.shanchu_molingguanli);
    }

    private void initMolingData() {
        //读取魔灵数据，若没有则创建空数据。
        Helper helper = new Helper(addMoling.this);

        try{

            Monster monster = new Monster("查燚斐","屌",4);
            ArrayList tmp = new ArrayList();
            tmp.add(monster);
            helper.saveSer("monster.ser",tmp);

            helper.readSer("monster.ser");
            //根据魔灵数据创建ListView显示信息
            molinglist = (ListView)findViewById(R.id.list_molingguanli);
            MonsterData molingdata =  new MonsterData(addMoling.this);
            List<Map<String, Object>> molingxinxi = molingdata.getAllMolingData(molingdata.ReadMonsterList());
            SimpleAdapter molingAdapter  = new SimpleAdapter(this,molingxinxi,R.layout.moling_list,new String[] {"molingmingcheng","molingshuxing","molingxingji"},new int[] {R.id.molingliebiao_name,R.id.molingliebiao_shuxing,R.id.molingliebiao_xingji});
            molinglist.setAdapter(molingAdapter);

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
}
