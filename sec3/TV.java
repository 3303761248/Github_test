package sec3;

public class TV {
    private int channel;
    private int volumn;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    public TV(int channel, int volumn) {
        this.channel = channel;
        this.volumn = volumn;
    }

    public TV() {
    }
}
