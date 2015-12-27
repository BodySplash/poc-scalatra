package yourapp.web

import org.scalatra.ScalatraServlet



class Application {

  def servlet(): ScalatraServlet = {
    new ScalatraServlet with Router {

    }
  }
}
