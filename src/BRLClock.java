public class BRLClock extends Clock {

    @Override
    public void convert(Clock clock) {
        this.hour = clock.getHour();
        this.minute = clock.getMinute();
        this.second = clock.getSecond();
    }
}
