package logging

import net.logstash.logback.marker.LogstashMarker
import net.logstash.logback.marker.Markers._

import scala.jdk.CollectionConverters._
import scala.language.implicitConversions

object Implicits {
  implicit def toMarker(logContext: LogContext): LogstashMarker = {
    val data = (logContext.productElementNames zip logContext.productIterator).toMap
    appendEntries(data.asJava)
  }
}
