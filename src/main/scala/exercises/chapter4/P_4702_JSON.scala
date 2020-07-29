package exercises.chapter4

class P_4702_JSON {
  /*
    1. design the algebraic data type yourself
    2.Start by sketching out the design in terms of logical ands and ors

    JSON is a syntax for serializing objects, arrays, numbers, strings, booleans, and null.
    It is based upon JavaScript syntax but is distinct from it: some
    JavaScript is not JSON.
    Property names must be double-quoted strings; trailing commas are forbidden.
    JSON.parse(text[, reviver]);  JSON.stringify(value[, replacer[, space]])

    JSON (JavaScript Object Notation) is a lightweight data-interchange format. It is easy for humans to read and write.
    JSON is a text format that is completely language independent but uses conventions that are familiar to programmers of the C-family of languages,
    including C, C++, C#, Java, JavaScript, Perl, Python, and many others.

    JSON is built on two structures:

    1. A collection of name/value pairs. In various languages,
    this is realized as an object, record, struct, dictionary, hash table, keyed list, or associative array.

    2. An ordered list of values. In most languages, this is realized as an array, vector, list, or sequence.

    In computer science, Backus–Naur form or Backus normal form (BNF) is a notation technique for context-free grammars,
    often used to describe the syntax of languages used in computing

    <expr> ::= <term>|<expr><addop><term>

    Expression ::= Addition left:Expression right:Expression
                | Subtraction left:Expression right:Expression
                | Division left:Expression right:Expression
                | SquareRoot value:Expression
                | Number value:Int


    ["a string", 1.0, true]
    {
     "a": [1,2,3],
     "b": ["a","b","c"]
     "c": { "doh":true, "ray":false, "me":1 }
    }

 */
}

/*

  Json ::= Json_String        value:String
        |  Json_Number        value:Double
        |  Json_Boolean       value:Boolean
        |  Json_Null          value: None
        |  Json_Object
        |  Json_Array

        Json_Object ::= ObjectCell key:String value:Json tail: Json_Object | ObjectEnd
        Json_Array ::= ArrayCell head:Json  tail:Json_Array | ArrayEnd


        sealed trait IntList
        case object End extends Json
        final case class Pair(head: Int, tail: IntList) extends IntList
 */

object testJson extends App {
  sealed trait Json {
    def print:String = {
      this match {
        case JsString(s) => s"'${s}'"
        case JsNumber(n) => n.toString
        case JsBoolean(b) => b.toString
        case JsNull => s"null"
        case ObjectCell(k,v,t) => objectCellToJson(ObjectCell(k,v,t))
        case SeqCell(h,t) => SeqToJson(SeqCell(h,t))
        case ObjectEnd => "}"
        case SeqEnd => "]"
      }
    }

    def format(s:String):String = {
      "String:" ++ s ++ ""
    }

      def objectCellToJson(obj:ObjectCell):String = {
      obj match {
        case ObjectCell(k,v,t) => s"${format(k)},${v.print},${t.print}"
      }
    }
    def SeqToJson(seq:SeqCell):String = {
      seq match {
        case SeqCell(h,t) => s"${h.print},${t.print}"
      }
    }
  }




  final case class JsString(value:String) extends Json
  final case class JsNumber(number:Double) extends Json
  final case class JsBoolean(boolean: Boolean) extends Json
  case object JsNull extends Json

  sealed trait JsonObject extends Json

  final case class ObjectCell(key: String, value: Json, tail: JsonObject) extends JsonObject
  case object ObjectEnd extends JsonObject


  sealed trait JsonSeq extends Json
  final case class SeqCell(head: Json, tail: JsonSeq) extends JsonSeq
  case object SeqEnd extends JsonSeq

  JsString("Alex you are a genius!").print
  println(SeqCell(JsString("a string"), SeqCell(JsNumber(1.0), SeqCell(JsBoolean(true), SeqEnd))).print)
  // res0: String = ["a string", 1.0, true]

  ObjectCell("a", SeqCell(JsNumber(1.0), SeqCell(JsNumber(2.0), SeqCell(JsNumber(3.0), SeqEnd))),
    ObjectCell("b", SeqCell(JsString("a"), SeqCell(JsString("b"), SeqCell(JsString("c"), SeqEnd))),
      ObjectCell("c", ObjectCell("doh", JsBoolean(true),ObjectCell("ray", JsBoolean(false),ObjectCell("me", JsNumber(1.0), ObjectEnd))),
        ObjectEnd
      )
    )
  ).print
  // res1: String = {"a": [1.0, 2.0, 3.0], "b": ["a", "b", "c"], "c": {"doh": true, "ray": false, "me": 1.0}}
}