package com.example.xz.starfrag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.xz.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Star2Activity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star2);
         ListView lv=findViewById(R.id.list1);
         List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
         Map<String,Object>map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","性格特点：");
         map.put("tv_item","自由博爱");
         list.add(map);

         map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","掌管宫位：");
         map.put("tv_item","第十一宫");
         list.add(map);

         map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","显阴阳性：");
         map.put("tv_item","阳性");
         list.add(map);

         map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","最大特征：");
         map.put("tv_item","求知");
         list.add(map);

         map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","主管星球：");
         map.put("tv_item","天王星");
         list.add(map);

         map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","幸运颜色：");
         map.put("tv_item","古铜色");
         list.add(map);

         map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","搭配珠宝：");
         map.put("tv_item","黑珍珠");
         list.add(map);

         map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","幸运号码：");
         map.put("tv_item","22");
         list.add(map);

         map =new HashMap<String,Object>();
         map.put("iv",R.drawable.star_xingxing);
         map.put("tv_title","相配属性：");
         map.put("tv_item","蛋白石");
         list.add(map);

         //适配器
         SimpleAdapter adapter=new SimpleAdapter(
                 this,//上下文
                 list,//数据源
                 R.layout.layout_list_item,//布局
                 new String[]{"iv","tv_title","tv_item","item_bt"},//Map中的KEY
                 new int[]{R.id.iv,R.id.tv_title,R.id.tv_item}
                 );
         //关联适配器
         lv.setAdapter(adapter);

      ImageView bc = findViewById(R.id.back);
      bc.setOnClickListener(new View.OnClickListener(){

       @Override
       public void onClick(View v) {
        Star2Activity.this.finish();
       }
      });
    }
}
