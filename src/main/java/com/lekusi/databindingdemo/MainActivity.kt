package com.lekusi.databindingdemo

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lekusi.databindingdemo.databinding.ActivityMainBinding
import com.lekusi.databindingdemo.entity.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    val user: User =User(1,"jack",User.Sex.Hidden,10,"13888888","sdddd")

    //change the binding text info
    override fun onClick(v: View) {
        if(v.id==R.id.btn_change){
            user.name=et_name.text.toString()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bind: ActivityMainBinding =DataBindingUtil.setContentView(this,R.layout.activity_main)
        bind.user=user
        btn_change.setOnClickListener(this)
    }
}
