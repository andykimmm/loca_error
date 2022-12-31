package org.techtown.jobservicekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Messenger
import kotlinx.coroutines.Job

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var connectionMode = "none"

    //Messenger......
    lateinit var messenger: Messenger
    lateinit var replyMessenger: Messenger
    var messengerJob: Job? = null;

    //aidl...........
    var aidlService: MyAIDLInterface? = null
    var aidlJob: Job? = null







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}