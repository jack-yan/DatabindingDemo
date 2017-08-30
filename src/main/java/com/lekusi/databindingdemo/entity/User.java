package com.lekusi.databindingdemo.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.lekusi.databindingdemo.BR;

/**
 * User
 * <p>
 * Created by Jack.Yan on 2017/8/17.
 */
public class User extends BaseObservable {
    private int id;
    private String name;
    private Sex sex;
    private int age;
    private String phone;
    private String address;

    public User(int id, String name,Sex sex,int age, String phone,String address){
        setId(id);
        setName(name);
        setSex(sex);
        setAge(age);
        setPhone(phone);
        setAddress(address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public enum Sex {
        Male, Female, Hidden
    }
}
