package ktk.vishdroid.calorytracker.navigation

import android.app.usage.UsageEvents.Event
import androidx.navigation.NavController
import ktk.vishdroid.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}