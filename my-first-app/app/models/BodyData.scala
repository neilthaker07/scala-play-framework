package models

import play.api.libs.json._
import play.api.libs.functional.syntax._

object BodyData {
  implicit val bodyDataWrites: Writes[BodyData] = (
      (JsPath \ "no").write[Int] and 
      (JsPath \ "name").write[Int]
  )(unlift(BodyData.unapply))
}

case class BodyData(no: Int, name: Int)
