package fr.arpinum.seed.command


abstract class CommandHandler[R, C <: Command[R]] {

  def execute(implicit context: CommandContext): Either[_ <: CommandError, R] = {
    Left(new CommandError("error", new IllegalArgumentException))
  }
}
