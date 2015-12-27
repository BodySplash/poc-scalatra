package yourapp.web

import fr.arpinum.seed.bus.CommandBus


trait Configuration {
  implicit val bus = new CommandBus {
    override def publish: Unit = {
      print("log")
    }
  }
}
