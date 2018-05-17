package org.franciscozuccala.samplelibrary.utils

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors

internal fun execute(body: () -> Unit){
    with(Executors.newSingleThreadExecutor()){
        execute(body)
        shutdown()
    }
}

internal fun executeOnUI(body: () -> Unit){
    with(Handler(Looper.getMainLooper())){
        post(body)
    }
}