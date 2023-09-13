interface Playable {
void play();
}
abstract class Instrument implements Playable {
    String name;
    public Instrument(String name) {
        this.name = name;
    }
}
class Flute extends Instrument {
    public Flute(String name){
    super(name);
}
    @Override
    public void play() {System.out.println(name + " is playing the flute.");}
}
class Drum extends Instrument {
    public Drum(String name) {
        super(name);
    }
@Override
    public void play() {
        System.out.println(name + " is playing the drum.");
    }
}
