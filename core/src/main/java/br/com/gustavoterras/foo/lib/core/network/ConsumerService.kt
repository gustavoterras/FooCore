package br.com.gustavoterras.foo.lib.core.network

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Gustavo Terras.
 */

object ConsumerService {
    fun getEvents(): Observable<List<Any>> {
        return IConsumerService.create().events()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }
}