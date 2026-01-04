class Pen{
    String color;
    String type; //ballpen or gelpen

    public void write(){
        System.out.println("Write something ");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class Ch0_oops{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gelpen";
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "fountain";

        Pen pen3 = new Pen();
        pen3.color = "red";
        pen3.type = "ballpen";
        //pen3.write();
        
    }
}