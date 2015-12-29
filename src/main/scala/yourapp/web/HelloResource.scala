package yourapp.web

import fr.arpinum.seed.bus.CommandBus
import yourapp.command.RegistrationCommand


class HelloResource(implicit bus: CommandBus) {
  def post(command : RegistrationCommand) = {
    bus.publish(command)
  }


  def get = {
    "Hello"
  }
}
