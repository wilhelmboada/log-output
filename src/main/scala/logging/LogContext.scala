package logging

case class LogContext(
                   event: String,
                   universe: String,
                   accountId: String,
                   correlationId: String
                 )
