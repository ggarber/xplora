package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._;

object Query extends Controller {

  def options() = Action { Ok("") }

  def nodes() = Action {
    Ok(Json.toJson(Json.obj(
    	"cluster_name" -> "xplora",
    	"nodes" -> Json.obj(
    		"W5esCw-8QjCunBG86u86RA" -> Json.obj(
    			"name" -> "test",
    			"version" -> "1.1.1"
    		)
    	)
    )))
  }

//   {
//    "facets":{
//       "terms":{
//          "terms":{
//             "field":"_type",
//             "size":10,
//             "order":"count",
//             "exclude":[
//             ]
//          },
//          "facet_filter":{
//             "fquery":{
//                "query":{
//                   "filtered":{
//                      "query":{
//                         "bool":{
//                            "should":[
//                               {
//                                  "query_string":{
//                                     "query":"*"
//                                  }
//                               }
//                            ]
//                         }
//                      },
//                      "filter":{
//                         "bool":{
//                            "must":[
//                               {
//                                  "match_all":{

//                                  }
//                               }
//                            ]
//                         }
//                      }
//                   }
//                }
//             }
//          }
//       }
//    },
//    "size":0
// }

  def index(container: String) = Action {
    Ok(Json.toJson(Json.obj(
    	"cluster_name" -> "xplora",
    	"nodes" -> Json.arr()
    )))
  }

}