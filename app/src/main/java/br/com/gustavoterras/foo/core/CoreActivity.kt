package br.com.gustavoterras.foo.core

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import br.com.gustavoterras.foo.lib.core.network.ConsumerService
import br.com.gustavoterras.fooCore.R
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.json.JSONArray

class CoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)

        ConsumerService.getEvents().subscribe(object : Observer<JSONArray> {
            override fun onComplete() {

            }

            override fun onSubscribe(d: Disposable) {

            }

            override fun onError(e: Throwable) {

            }

            override fun onNext(t: JSONArray) {
                Log.e("TAG", t.toString())
            }
        })
    }
}
