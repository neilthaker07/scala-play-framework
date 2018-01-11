package models

import play.api.libs.json._
import play.api.libs.functional.syntax._

object Studio {
  implicit val studioWrites: Writes[Studio] = (
      (JsPath \ "userId").write[Int] and 
      (JsPath \ "studioId").write[Int]
  )(unlift(Studio.unapply))
}

case class Studio(userId: Int, studioId: Int)