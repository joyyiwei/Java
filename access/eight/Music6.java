package eight;

import static net.mindview.util.Print.print;

/**
 * Created by acer on 14-8-29.
 */
class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { print("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { print("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }
    public String toString() { return "Brass"; }
    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

class Keyboard extends Instrument {
    void play(Note n) {
        print("Keyboard.play()" + n);
    }
    public String toString() { return "Keyboard"; }
    void adjust() { print("Adjusting Keyboard"); }
}

class Piano extends Keyboard {
    void play(Note n) { print("Piano.play() " + n); }
    public String toString() { return "Piano"; }
}

public class Music6 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Keyboard(),
                new Piano()
        };
        tuneAll(orchestra);
        for(Instrument i : orchestra)
            System.out.println(i);
    }
}
