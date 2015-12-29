package yourapp.web

import fr.arpinum.seed.bus.CommandBus
import fr.arpinum.seed.command.{CommandError, Command}


trait Configuration {
  implicit val bus = new CommandBus {
    override def publish[T]( command: Command[T]): Either[_ <: CommandError, T] = {
      Left(CommandError("wrong",new IllegalArgumentException))
    }
  }
}
