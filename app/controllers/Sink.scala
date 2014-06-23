package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._;

import play.modules.reactivemongo.MongoController
import play.modules.reactivemongo.json.collection.JSONCollection

import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits.defaultContext

import pipeline._;

object Sink extends Controller with MongoController {

  def collection: JSONCollection = db.collection[JSONCollection]("partnerFilters")

  def index(container: String) = Action.async(parse.json) { request =>
    // validateToken
    // prefilter
    val pipeline = new PartnerPipeline
    request.body match {
        case JsObject(fields) => pipeline.process(fields.toMap)
    }

    val collection = db.collection[JSONCollection](container)
    collection.insert(request.body).map {
      lastError => Created(s"User Created")
    }
  }

}