import play.api._
import play.api.mvc._

// https://gist.github.com/jeantil/7214962

object Global extends WithFilters(CORSFilter()) with GlobalSettings {
//...if you need some init
}