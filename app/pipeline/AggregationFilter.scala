package pipeline

import com.typesafe.scalalogging.slf4j.LazyLogging
import scala.concurrent._
import ExecutionContext.Implicits.global


class AggregationFilter extends Filter with LazyLogging {
    val facets = ("type", "hostname", "browserName", "browserVersion")
    val resolution = "minute"

    def process(event: Map[String, Any]): Future[Map[String, Any]] = Future {
        logger.info("Aggregating event")
        event
    }
}