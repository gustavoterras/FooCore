package br.com.gustavoterras.foo.lib.core.network

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object ConsumerService {
    fun getEvents(url: String): Observable<List<Any>> {
        return IConsumerService.create().events(url)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }
}