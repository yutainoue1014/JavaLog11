package jp.techacademy.inoue.yuuta.javalog;

import android.util.Log;

public class Human extends Animal implements Thinkable {
    // 変数
    String hobby;      // 名前


    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say()    {
        Log.d("javatest", "私の名前は" + String.valueOf(this.name) + "です。 年は" + String.valueOf(this.age) + "歳です。");
    }

    @Override
    public void think(){
        Log.d("javatest", "私は" + String.valueOf(this.hobby) + "について考える");
    }
}
