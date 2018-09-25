package br.com.gustavoterras.foo.lib.core.network

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.json.JSONArray

/**
 * Created by Gustavo Terras.
 */

object ConsumerService {
    fun getEvents(): Observable<Any> {
        return IConsumerService.create().events()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }
}