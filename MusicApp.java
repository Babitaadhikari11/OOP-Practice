package Polymorphism;


abstract class Instrument {
    abstract void playSound();
}


class Piano extends Instrument {
    @Override
    void playSound() {
        System.out.println("Piano is playing a melodious tune.");
    }
}


class Guitar extends Instrument {
    @Override
    void playSound() {
        System.out.println("Guitar is strumming chords.");
    }
}


class Violin extends Instrument {
    @Override
    void playSound() {
        System.out.println("Violin is producing a soothing melody.");
    }
}


public class MusicApp {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano(),
            new Guitar(),
            new Violin()
        };

        for (Instrument instrument : instruments) {
            instrument.playSound();
        }
    }
}
