package pipeline

import scala.concurrent._
import ExecutionContext.Implicits.global


class MapperFilter extends Filter {
    def process(event: Map[String, Any]): Future[Map[String, Any]] = Future {
        // clientId
        event
    }
    // ("Subscribe", "Connect", "connectionId", "connectionId", ["browser"])
}