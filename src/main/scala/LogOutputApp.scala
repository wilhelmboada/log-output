import com.typesafe.scalalogging.LazyLogging
import logging.Implicits._
import logging.LogContext


import java.util.UUID

object LogOutputApp extends App with LazyLogging {
  val logContext = LogContext("1", "mga", "123", UUID.randomUUID().toString)
  logger.info(logContext, s"This is a info message")
  logger.debug(logContext, "This is a debug message")
  logger.error(logContext, "This is a error message")
}
