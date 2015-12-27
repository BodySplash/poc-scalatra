package yourapp.web

import fr.arpinum.seed.bus.CommandBus


class HelloResource(implicit bus: CommandBus) {

  def get(): String  = {
    bus.publish
    "Hello"
  }
}
