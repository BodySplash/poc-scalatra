package fr.arpinum.seed.bus

import fr.arpinum.seed.command.{CommandError, Command}


trait CommandBus {

  def publish[T](command: Command[T]): Either[_ <: CommandError, T]
}
