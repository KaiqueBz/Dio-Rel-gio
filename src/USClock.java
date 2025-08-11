public class USClock extends Clock {

    @Override
    public void setHour(int hour) {
        if (hour <= 0) {
            this.hour = 12;
        } else if (hour > 12) {
            this.hour = hour % 12;
            if (this.hour == 0) this.hour = 12;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public void convert(Clock clock) {
        this.setHour(clock.getHour());
        this.setMinute(clock.getMinute());
        this.setSecond(clock.getSecond());
    }
}
