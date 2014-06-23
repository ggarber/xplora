package pipeline

import scala.concurrent._
import ExecutionContext.Implicits.global


class PartnerPipeline {
    val clean = new CleanFilter
    val whitelist = new WhiteListFilter
    val aggregation = new AggregationFilter

    def process(event: Map[String, Any]): Future[Map[String, Any]] = {
        clean.process(event).flatMap(whitelist.process).flatMap(aggregation.process)
    }
}

// filter
// translate
// expand
// aggregate
