class Vehicle{
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    Student(String licensePlate,String ownerName,int hoursParked){
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.hoursParked = hoursParked;
    }
    public int getLicensePlate() {
        return licensePlate;
    }
    public int getOwnerName() {
        return ownerName;
    }
    public int getHoursParked() {
        return hoursParked;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setHoursParked(int hoursParked) {
        this.hoursParked = hoursParked;
    }



    

}


public class Main{   
    public static void main(String [] args){

        
    }
}