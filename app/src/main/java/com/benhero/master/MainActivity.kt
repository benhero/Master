package com.benhero.master

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.benhero.master.data.Test

/**
 * 主界面
 *
 * @author Benhero
 * @date   2019/2/13
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Test()
    }

}