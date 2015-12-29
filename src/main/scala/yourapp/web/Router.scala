package yourapp.web


import org.scalatra.ScalatraBase
import org.scalatra.json.JacksonJsonSupport
import yourapp.command.RegistrationCommand
import org.json4s.{DefaultFormats, Formats}



trait Router extends ScalatraBase with Configuration with JacksonJsonSupport {

  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  private val resource: HelloResource = new HelloResource

  before() {
    contentType = formats("json")
  }

  get("/")(resource.get)
  post("/") {
    resource.post(parsedBody.extract[RegistrationCommand])
  }

}
