package pipeline

import scala.concurrent._


trait Filter {
    def process(event: Map[String, Any]): Future[Map[String, Any]];
}