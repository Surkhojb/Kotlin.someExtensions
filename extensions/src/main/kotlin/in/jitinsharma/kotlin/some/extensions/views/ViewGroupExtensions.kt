package `in`.jitinsharma.kotlin.some.extensions.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Inflate the view in a RecyclerView.Adapter
 */
fun ViewGroup.inflate(layout: Int): View {
    return LayoutInflater.from(this.context).inflate(layout, this,false)
}