package pipeline

import scala.concurrent._
import ExecutionContext.Implicits.global


class CleanFilter extends Filter {
    // ("subscriberId" -> "clientId")
    def process(event: Map[String, Any]): Future[Map[String, Any]] = Future {
        event
        // clientId
    }
}