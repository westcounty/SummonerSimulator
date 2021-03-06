package cn.com.geeeeker.field.summonersimulator.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import cn.com.geeeeker.field.summonersimulator.R;
import cn.com.geeeeker.field.summonersimulator.model.MonsterInfo;

public class moshiXuanze extends Activity {

    Button zuiyougongji,zuiyoutifang,zuiyousudu,fanhui_moshixuanze,ziyouzuhe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moshi_xuanze);

        //最优攻击按钮动作
        zuiyougongji=(Button)findViewById(R.id.zuiyougongji);
        zuiyougongji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moshiXuanze.this, fuwenZhanshi.class);
                MonsterInfo tmp = (MonsterInfo)getIntent().getExtras().get("select");
                System.out.println("选择到的符文是："+tmp.getId());
                intent.putExtra("select",tmp);
                intent.putExtra("mode","Attack");
                startActivity(intent);
            }
        });


        //最优体防按钮动作
        zuiyoutifang=(Button)findViewById(R.id.zuiyoutifang);
        zuiyoutifang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moshiXuanze.this, fuwenZhanshi.class);
                MonsterInfo tmp = (MonsterInfo)getIntent().getExtras().get("select");
                intent.putExtra("select",tmp);
                intent.putExtra("mode","Tank");
                startActivity(intent);
            }
        });


        //最优速度按钮动作
        zuiyousudu=(Button)findViewById(R.id.zuiyousudu);
        zuiyousudu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moshiXuanze.this, fuwenZhanshi.class);
                MonsterInfo tmp = (MonsterInfo)getIntent().getExtras().get("select");
                intent.putExtra("select",tmp);
                intent.putExtra("mode","Speed");
                startActivity(intent);
            }
        });


        //自由组合按钮动作
        ziyouzuhe=(Button)findViewById(R.id.ziyouzuhe);
        ziyouzuhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moshiXuanze.this, fuwenZhanshi.class);
                MonsterInfo tmp = (MonsterInfo)getIntent().getExtras().get("select");
                intent.putExtra("select",tmp);
                intent.putExtra("mode","Free");
                startActivity(intent);
            }
        });


        //返回动作
        fanhui_moshixuanze=(Button)findViewById(R.id.fanhui_moshixuanze);
        fanhui_moshixuanze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(moshiXuanze.this, fuwenMoni.class));
            }
        });


   }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_moshi_xuanze, menu);
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
