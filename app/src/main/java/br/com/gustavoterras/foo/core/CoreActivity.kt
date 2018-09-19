package br.com.gustavoterras.foo.core

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.gustavoterras.foo.lib.core.network.ConsumerService

import br.com.gustavoterras.foo.lib.core.network.IConsumerService
import br.com.gustavoterras.fooCore.R
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)
    }
}
