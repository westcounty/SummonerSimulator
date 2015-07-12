package cn.com.geeeeker.field.summonersimulator.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import cn.com.geeeeker.field.summonersimulator.R;
import cn.com.geeeeker.field.summonersimulator.controller.Controller;
import cn.com.geeeeker.field.summonersimulator.data.Helper;

public class fuwenMoni extends Activity {

    Button xiayibu_fuwenmoni;


    ListView molinglist;
    Button tianjia_molingguanli,shanchu_molingguanli,xiugai_molingguanli;
    Controller controller = new Controller(fuwenMoni.this);
    Helper helper = new Helper(fuwenMoni.this);
    int cur_pos = 0; //行指针
    TextView xiaoguomingzhong_molingguanli,xiaoguodikang_molingguanli,baojishanghai_molingguanli,baojilv_molingguanli,gongjisudu_molingguanli,fangyuli_molingguanli,gongjili_molingguanli,tili_molingguanli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuwen_moni);









        //下一步按钮动作
        xiayibu_fuwenmoni = (Button) findViewById(R.id.xiayibu_fuwenmoni);
        xiayibu_fuwenmoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =new Intent(fuwenMoni.this, moshiXuanze.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fuwen_moni, menu);
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
