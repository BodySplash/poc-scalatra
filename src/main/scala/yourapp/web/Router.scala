package yourapp.web

import org.scalatra.ScalatraBase


trait Router extends ScalatraBase with Configuration {

  private val resource: HelloResource = new HelloResource

  get("/"){resource.get()}

}
