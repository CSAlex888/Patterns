public class Main {
    public static void main(String[] args) {

        TotalTime totalTime = TimeManager.getCurrentTime();
        Time timeFromTotal = new TotalTimeAdapter(totalTime);
        System.out.println("Time from TotalTime: " + timeFromTotal.getHours() + ":" +
                timeFromTotal.getMinutes() + ":" + timeFromTotal.getSeconds());


        Time time = new SimpleTime(10, 30, 45);
        TotalTime totalTimeFromTime = new TimeAdapter(time);
        System.out.println("Total seconds from Time: " + totalTimeFromTime.getTotalSeconds());
    }
}