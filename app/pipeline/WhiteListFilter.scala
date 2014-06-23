package pipeline

import scala.concurrent._
import ExecutionContext.Implicits.global


class WhiteListFilter extends Filter {
    def process(event: Map[String, Any]): Future[Map[String, Any]] = Future {
        // clientId
        event
    }
}