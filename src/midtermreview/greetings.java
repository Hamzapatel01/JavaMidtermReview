package midtermreview;

public class greetings {

    private String name;
    private int YOB;

    public greetings(String n, int y) {
        this.name = n;
        this.YOB = y;
    }

    private String BuildMessage() {

        String message = "Welcome, " + this.name + " you are " + (2025 - this.YOB) + " year old ;)";
        return message;
    }

    public void PrintMessage() {
        System.out.println(this.BuildMessage());
    }

}
