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

  JSON ::= Json_String value:String
        |  Json_Number value:Double
        |  Json_TrueOrFalse   value:Boolean
        |  Json  value:Boolean
        |  Json_Null   value: None
        |  Json_Object value
        |  Json_Array  value
 */



object test extends App {
  SeqCell(JsString("a string"), SeqCell(JsNumber(1.0), SeqCell(JsBoolean
  (true), SeqEnd))).print
  // res0: String = ["a string", 1.0, true]
  ObjectCell(
    "a", SeqCell(JsNumber(1.0), SeqCell(JsNumber(2.0), SeqCell(JsNumber
    (3.0), SeqEnd))),
    ObjectCell(
      "b", SeqCell(JsString("a"), SeqCell(JsString("b"), SeqCell(
        JsString("c"), SeqEnd))),
      ObjectCell(
        "c", ObjectCell("doh", JsBoolean(true),
          ObjectCell("ray", JsBoolean(false),
            ObjectCell("me", JsNumber(1.0), ObjectEnd))),
        ObjectEnd
      )
    )
  ).print
  // res1: String = {"a": [1.0, 2.0, 3.0], "b": ["a", "b", "c"], "c": {"doh": true, "ray": false, "me": 1.0}}
}