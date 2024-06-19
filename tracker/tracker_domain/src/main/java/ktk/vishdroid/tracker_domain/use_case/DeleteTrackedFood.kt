package ktk.vishdroid.tracker_domain.use_case

import ktk.vishdroid.tracker_domain.model.TrackableFood
import ktk.vishdroid.tracker_domain.model.TrackedFood
import ktk.vishdroid.tracker_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}