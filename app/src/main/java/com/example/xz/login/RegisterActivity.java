package com.example.xz.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xz.R;
import com.example.xz.starfrag.Star2Activity;

public class RegisterActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText age;
    RadioGroup sex;
    Button register;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView bc = findViewById(R.id.R_back);
        bc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                RegisterActivity.this.finish();
            }
        });
        findViews();
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name = username.getText().toString().trim();
                String pass = password.getText().toString().trim();
                String agestr = age.getText().toString().trim();
                String sexstr = ((RadioButton) RegisterActivity.this.findViewById(sex.getCheckedRadioButtonId())).getText().toString();
                Log.i("TAG", name + "_" + pass + "_" + agestr + "_" + sexstr);
                UserService uService = new UserService(RegisterActivity.this);
                User user = new User();
                user.setUsername(name);
                user.setPassword(pass);
                user.setAge(Integer.parseInt(agestr));
                user.setSex(sexstr);
                uService.register(user);
                Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void findViews() {
        username = (EditText) findViewById(R.id.usernameRegister);
        password = (EditText) findViewById(R.id.passwordRegister);
        age = (EditText) findViewById(R.id.ageRegister);
        sex = (RadioGroup) findViewById(R.id.sexRegister);
        register = (Button) findViewById(R.id.Register);
    }
}