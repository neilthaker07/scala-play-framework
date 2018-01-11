package controllers

import play.api._
import play.api.mvc._
import models.Studio
import models.BodyData

import play.api.libs.json.Json
import play.api.libs.json._

import play.api.data._
import play.api.data.Forms._

import play.api.mvc.BodyParsers._

//@BodyParser.Of(BodyParser.TolerantText.class)
//@BodyParser.Of(BodyParser.Text.class)
class Studios() extends Controller {
// (BodyParsers.parse.json)
//  def add(userId: Int, studioId: Int) = Action(BodyParsers.parse.json) { implicit request =>
    def add = Action(parse.json) { implicit request =>
    //val json = request.body.asJson.get
    println("t: " + request.body)
    //println("t: " + request.body.size)
    println("t: " + request.body.toString())
    /*val userForm = Form(
      tuple(
        "no" -> text,
        "name" -> text
      )
    )
    
    val (no, name) = userForm.bindFromRequest.get
    
    println("params : 1 : "+no)
    println("params : 2 : "+name)
    */
    //val a = json.as[BodyData]
    
    //println(json)
    
    
    println("================studio==123=====")
    
    val userId = 99;
    val studioId = 23;
    val inst: Spark = new Spark()
    inst.sparkCall(userId)
    
    println("================studio===123====")
    
    //Ok(Json.obj("result" -> Studio(userId,studioId)))
    Ok(Json.obj("result" -> Studio(userId,studioId)))
  }
  
}



