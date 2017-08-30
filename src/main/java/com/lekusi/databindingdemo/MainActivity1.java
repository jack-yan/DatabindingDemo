package com.lekusi.databindingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lekusi.databindingdemo.databinding.ActivityMainBinding;
import com.lekusi.databindingdemo.entity.User;

/**
 * MainActivity1
 * <p>
 * Created by Jack.Yan on 2017/8/17.
 */
public class MainActivity1 extends Activity implements View.OnClickListener{

    private User user=new User(1,"jack",User.Sex.Hidden,10,"13888888","sdddd");
    private EditText et_change;
    private Button btn_change;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        et_change= (EditText) findViewById(R.id.et_name);
        btn_change=(Button)findViewById(R.id.btn_change);
        btn_change.setOnClickListener(this);
        binding.setUser(user);
//        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_change){
            user.setName(et_change.getText().toString().trim());
        }
    }
}
