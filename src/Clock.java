// Classe base abstrata
public abstract class Clock {
    protected int hour;
    protected int minute;
    protected int second;

    // Getter e Setter da hora
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0) {
            this.hour = 0;
        } else if (hour >= 24) {
            this.hour = 23;
        } else {
            this.hour = hour;
        }
    }

    // Getter e Setter do minuto
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0) {
            this.minute = 0;
        } else if (minute >= 60) {
            this.minute = 59;
        } else {
            this.minute = minute;
        }
    }

    // Getter e Setter do segundo
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0) {
            this.second = 0;
        } else if (second >= 60) {
            this.second = 59;
        } else {
            this.second = second;
        }
    }

    // Retorna o horário no formato HH:MM:SS
    public String getTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Método abstrato para conversão
    public abstract void convert(Clock clock);
}
