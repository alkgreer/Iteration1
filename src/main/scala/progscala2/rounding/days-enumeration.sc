object WeekDay extends Enumeration {
  type WeekDay = Value
  val MON, TUE, WED, THU, FRI, SAT, SUN = Value
}

import WeekDay._

def isWorkingDay(d: WeekDay) = ! (d == SAT || d == SUN)

WeekDay.values filter isWorkingDay foreach println
