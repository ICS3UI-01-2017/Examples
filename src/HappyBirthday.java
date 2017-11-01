
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamon
 */
public class HappyBirthday {

    public static final int whole = 2000;
    public static final int half = whole/2;
    public static final int quarter = half/2;
    public static final int eighth = quarter/2;
    public static final int sixteenth = eighth/2;
     

    public static final int A = 57;
    public static final int As = 58;
    public static final int B = 59;
    public static final int C = 60;
    public static final int Cs = 61;
    public static final int D = 62;
    public static final int Ds = 62;
    public static final int E = 64;
    public static final int F = 65;
    public static final int Fs = 66;
    public static final int G = 67;
    public static final int Gs = 68;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /* Create a new Sythesizer and open it. Most of 
         * the methods you will want to use to expand on this 
         * example can be found in the Java documentation here: 
         * https://docs.oracle.com/javase/7/docs/api/javax/sound/midi/Synthesizer.html
             */
            Synthesizer midiSynth = MidiSystem.getSynthesizer();
            midiSynth.open();

            //get and load default instrument and channel lists
            Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
            MidiChannel[] mChannels = midiSynth.getChannels();

            midiSynth.loadInstrument(instr[0]);//load an instrument

            // first
            playNote(C,0,eighth + eighth/2, mChannels[0]);
            playNote(C,0,sixteenth, mChannels[0]);
            playNote(D,0,quarter, mChannels[0]);
            playNote(C,0,quarter, mChannels[0]);
            playNote(F,0,quarter, mChannels[0]);
            playNote(E,0,half, mChannels[0]);
            
            //second
            playNote(C,0,eighth + eighth/2, mChannels[0]);
            playNote(C,0,sixteenth, mChannels[0]);
            playNote(D,0,quarter, mChannels[0]);
            playNote(C,0,quarter, mChannels[0]);
            playNote(G,0,quarter, mChannels[0]);
            playNote(F,0,half, mChannels[0]);
            
            //third
            playNote(C,0,eighth + eighth/2, mChannels[0]);
            playNote(C,0,sixteenth, mChannels[0]);
            playNote(C,1,quarter, mChannels[0]);
            playNote(A,1,quarter, mChannels[0]);
            playNote(F,0,quarter, mChannels[0]);
            playNote(E,0,quarter, mChannels[0]);
            playNote(D,0,half, mChannels[0]);
            
            //last
            playNote(As,1,eighth + eighth/2, mChannels[0]);
            playNote(As,1,sixteenth, mChannels[0]);
            playNote(A,1,quarter, mChannels[0]);
            playNote(F,0,quarter, mChannels[0]);
            playNote(G,0,quarter, mChannels[0]);
            playNote(F,0,whole, mChannels[0]);
            
        } catch (MidiUnavailableException e) {
        }
    }

    public static void playNote(int note,int octave, int time, MidiChannel c) {
        c.noteOn(note+octave*12, 100);//On channel 0, play note number 60 with velocity 100 
        try {
            Thread.sleep(time); // wait time in milliseconds to control duration
        } catch (InterruptedException e) {
        }
        c.noteOff(note+octave*12);//turn of the note
    }

}
