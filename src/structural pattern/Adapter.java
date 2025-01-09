import java.util.Random;
interface Time {
    int getSeconds();
    int getMinutes();
    int getHours();
}

interface TotalTime {
    int getTotalSeconds();
}
class TotalTimeAdapter implements Time {
    private TotalTime totalTime;

    public TotalTimeAdapter(TotalTime totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int getSeconds() {
        return totalTime.getTotalSeconds() % 60;
    }

    @Override
    public int getMinutes() {
        return (totalTime.getTotalSeconds() / 60) % 60;
    }

    @Override
    public int getHours() {
        return totalTime.getTotalSeconds() / (60 * 60);
    }
}
class TimeAdapter implements TotalTime {
    private Time time;

    public TimeAdapter(Time time) {
        this.time = time;
    }

    @Override
    public int getTotalSeconds() {
        return time.getHours() * 60 * 60 + time.getMinutes() * 60 + time.getSeconds();
    }
}
class TimeManager {
    public static TotalTime getCurrentTime() {
        Random random = new Random();
        int totalSeconds = random.nextInt(86400);
        return () -> totalSeconds;
    }
}
class SimpleTime implements Time {
    private int seconds;
    private int minutes;
    private int hours;

    public SimpleTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public int getSeconds() {
        return seconds;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }

    @Override
    public int getHours() {
        return hours;
    }
}