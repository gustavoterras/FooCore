package br.com.gustavoterras.foo.lib.core.network

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Gustavo Terras.
 */

class ConsumerService<T> {
    fun getEvents(): Observable<T> {
        return IConsumerService.create().events<T>()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }
}