package cn.com.geeeeker.field.summonersimulator.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import cn.com.geeeeker.field.summonersimulator.R;
import cn.com.geeeeker.field.summonersimulator.data.Helper;

public class addMoling extends Activity {


    Button tianjia_molingguanli,shanchu_molingguanli,xiugai_molingguanli;

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
            helper.readSer("monster.ser");
            //根据魔灵数据创建ListView显示信息
            // TODO

            Toast.makeText(getApplicationContext(), "魔灵信息读取成功",
                    Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "文件读取失败",
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
