public class Radio implements VolumeChangeable{

    private int volume;
    private  static final int MAX_VOLUME = 100;
    private  static final int MIN_VOLUME = 0;


    @Override
    public void increaseVolume() {
        volume = volume++ > MAX_VOLUME ? MAX_VOLUME : volume;

    }


    @Override
    public void decreaseVolume() {
        volume = volume-- < MIN_VOLUME ? MIN_VOLUME : volume;

    }










    public int getVolume() {
        return volume;
    }
}
