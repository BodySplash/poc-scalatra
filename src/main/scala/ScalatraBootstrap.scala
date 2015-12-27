import javax.servlet.ServletContext
import org.scalatra.LifeCycle
import yourapp.web.Application

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context mount(new Application servlet, "/app")
  }
}
