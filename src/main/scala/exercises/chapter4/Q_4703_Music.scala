package exercises.chapter4

import exercises.chapter4.testJson.Json

class Q_4703_Music {
  /*
  In the JSON exercise there was a well defined specification to model. In this
  exercise we want to work on modelling skills given a rather fuzzy specification.
  The goal is to model music. You can choose to interpret this how you want,
  making your model as simple or complex as you like. The critical thing is to be
  able to justify the decisions you made, and to understand the limits of your model.
  You might find it easiest to use the BNF nota on, introduced in the JSON
  exercise, to write down your model.

  A chord, in music, is any harmonic set of pitches consisting of multiple notes (also called "pitches")
  Pitch is a perceptual property of sounds that allows their ordering on a frequency-related scale
  pitch is the quality that makes it possible to judge sounds as "higher" and "lower"
  the dynamics of a piece is the variation in loudness between notes or phrases.
  Tone quality and tone color are synonyms for timbre, is the perceived sound quality of a musical note, sound or tone
  texture (which are sometimes termed the "color" of a musical sound).

  ref Music Wikipedia

  Music ::= MsNote         value:Double
         |  MsDynamics     loudnessHigh:Boolean
         |  MsTimbre       toneColor:Double
         |  MsTexture      types: String     (Monophonic.Biphonic,Polyphonic,Homophonic,Homorhythmic,Heterophonic)
         |  MsStyles       value:String     (Popular,Rock,Electronic,Country,Religious,Folk,Metal)
         |  MsSinging      voice:Boolean
         |  MsInstruments  value:String  (Piano,Guitar,Violin,Drums,Saxophone,Flute,Cello,Clarinet,Trumpet,Harp)
         |  MsArticulation types:String (Tenuto, Marcato,Staccato,Legato)

MsChord ::= MsChordCell Note:Music tail:MsChord
          | MsChordEnd

MsHarmony ::= MsHarmonyCell Note:Music, Chord:MsChord Timbre:MsTimbre,
            | MsHarmonyEnd

MusicPitch ::= MusicPitchCell Note:Double, melody:String  harmony:MsChord Higher:Boolean tail: MusicPitch
              |  MusicPitchEnd

MusicRhythm ::= MusicRhythmCell tempo:Double meter:Boolean articulation:String tail: MusicRhythm
              |  MusicRhythEnd


   */
}
sealed trait Music
final case class MsNote(value:Double) extends Music
final case class MsDynamics(loudnessHigh:Boolean) extends Music
final case class MsTimbre(toneColor:Double) extends Music
final case class MsTexture(types:String) extends Music
final case class MsStyles(value:String) extends Music
final case class MsSinging(voice:Boolean) extends Music
final case class MsInstruments(value:String) extends Music
final case class MsArticulation(value:String) extends Music

sealed trait MsChord extends Music
final case class MsChordCell(head: Music, tail: MsChord) extends MsChord
case object MsChordEnd extends MsChord

sealed trait MsHarmony extends Music
final case class MsHarmonyCell(Note: Music, Chord:MsChord, Timbre:MsTimbre, tail: MsChord) extends MsHarmony
case object MsHarmonyEnd extends MsHarmony

sealed trait MusicPitch extends Music
final case class MusicPitchCell(Note:Double, melody:String,harmony:MsChord, Higher:Boolean,tail: MusicPitch) extends MusicPitch
case object MusicPitchEnd extends MusicPitch

sealed trait MusicRhythm extends Music
final case class MusicRhythmCell(tempo:Double, meter:Boolean, articulation:String, tail: MusicRhythm) extends MusicRhythm
case object MusicRhythEnd extends MusicRhythm

object testMusic extends App {

  val textures = List("Monophonic","Biphonic","Polyphonic","Homophonic","Homorhythmic","Heterophonic")
  val styleOfMusic = List("Popular","Rock","Electronic","Country","Religious","Folk","Metal");
  val articulations = List("Tenuto", "Marcato","Staccato","Legato")
  val instruments = List(("Piano","Guitar","Violin","Drums","Saxophone","Flute","Cello","Clarinet","Trumpet","Harp"))
  def favouriteSong(title:String, artist:String): Unit ={

  }

  favouriteSong("Who We Are","Tristan Prettyman")
}