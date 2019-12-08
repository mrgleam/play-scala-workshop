/**
 * Case classes are good for modeling immutable data.
 * @param isbn
 */
case class Book(isbn: String)

val frankenstein = Book("978-0486282114")

/**
 * When you create a case class with parameters,
 * the parameters are public Vals
 * @param sender
 * @param recipient
 * @param body
 */
case class Message(sender: String, recipient: String, body: String)
val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

message1.sender
//message1.sender = "travis@washington.us"  // this line does not compile

/**
 * Case classes are compared by structure and not by reference:
 */
val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val messagesAreTheSame = message2 == message3

/**
 * You can create a (shallow) copy of an instance of a case class
 * simply by using the copy method.
 * You can optionally change the constructor arguments.
 */
val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
message5.sender
message5.recipient
message5.body

message4.sender
message4.recipient
message4.body

message4 == message5
