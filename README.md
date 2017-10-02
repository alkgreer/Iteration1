# Iteration1
### This project is for learning scala from the book _O'Reilly Programming Scala 2nd edition_
1. **Setup**
- Installed SBT and Scala
- reviewd sbt and scala commands
- reviewed scalac
- Used SBT REPL & Scala Console
- Installed Atom text editor
- Installed scala packages to Atom
- Setup Project Directory
- Linked local directory to Github

2. **Programming**
- **Chapter 1**
  - Created basic class
  - Compiled and ran class in console
  - Created Objects and Main classes
  - Used run sbt command to find mains in directory
- **Chapter 2**
  - No need for semicolons since =, { and => are indicators
  - Var is mutable and Val is immutable (ex: val/var array = new Array(2) )
  - You can specify type (ex: var array: Array[String] = new Array(2) )
  - Ranges of numbers (ex: 1 to 10, 1 until 10, 1 to 10 by 3, 1L to 10L by 3 )
  - Partial functions are not defined for all possible inputs but only those that match **at least 1 case clause**
    - val pf1:  PartialFunction[Any,String] = { case s: String => "Yes" }
    
  - def for method declarations 
  - Use future API to execute asynchronously
  - can verify recursion with tailrec import
  - You can infer type
  - Went through literals
  - Optioon[T] is used in map.get where it will return Some(T) or None if there is nothing
  - seal is used to insure that the subclasses are contained within the same source file
  - packages are used so you can easily import all types, values and methods within
  - abstract classes is when members are not all defined
  -Parameterized Types is where you use List[A], List[+A] (List[B] is subtype), List[-A]( List[B] is parent type)
- **Chapter 3**
  - Almost all operator are methods with 1.+(2) or 1.toString and can still use 1 + 2 or 1 toString
  - If you have a method taking no arguments you can leave off the parentheses
    - List(1,2,3,4,5,6).filter((i: Int) => isEven(i)).foreach((i:Int) => println(i)) can go to List(1,2,3,4,5,6) filter isEven foreach println
  - Methods ending with a colon are right associative while all others are left associative
    - 'a' :: list binds a to the left of the list
  - scala if , for , while, do-while, syntax is common but can be assigned to vals 
  - scope is expanded to where you can get a val thats declared outside the for
  - You use try catch and finally clauses
  - lazy vals are used to initialized a val once since it is expensive in time, money, etc... and it is deferred until needed
  - You can use Enumerated type to make a type that is complex
  - Interpolated Strings are used where you can print out variable easily (ex: println(s"Hello, $name") where s clarifies a string and $ signifies a variable
  - traits are commonly used for abstractin purposed such as printing out data
