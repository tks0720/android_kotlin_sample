package app.htks27.org.kotlinapp

import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.floatingActionButton
import org.jetbrains.anko.relativeLayout

/**
 * Created by kinjo on 2017/06/02.
 */
class MyActivityUi(): AnkoComponent<MainActivity>
{
//    override fun createView(ui: AnkoContext<MainActivity>): View {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        coordinatorLayout {
            appBarLayout {
                toolbar {
                }
            }
            relativeLayout {
            }
            floatingActionButton {
            }
        }
    }
}
