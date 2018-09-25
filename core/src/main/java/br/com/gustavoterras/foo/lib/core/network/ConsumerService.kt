package br.com.gustavoterras.foo.lib.core.network

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.json.JSONObject

/**
 * Created by Gustavo Terras.
 */

object ConsumerService {
    fun getEvents(): Observable<List<JSONObject>> {
        return IConsumerService.create().events()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }
}