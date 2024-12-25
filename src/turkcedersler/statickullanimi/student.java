package turkcedersler.statickullanimi;

public class student {
    public String name;
    public int id;
    public int points;
    private static int counter= 0;

    student(String name, int id, int i){
        this.name = name;
        this.id = id;
        this.points = points;
        student.counter++;
    }
    public void exit(){
        student.counter--;
    }
    public static int howMany(){
        return student.counter;
    }
    public static double average(int[] arr){
        double overall = 0;
        for(int i=0; i<arr.length; i++){
            overall += arr[i];
        }
        return overall/arr.length;
    }
}
