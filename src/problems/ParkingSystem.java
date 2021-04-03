package problems;

public class ParkingSystem {
    /*
       big car = 1,
       medium car = 2,
       small car = 3,

     */
    int big, small, med;

    public ParkingSystem(int big, int medium, int small) {
        //this is where we init big, med, small
        this.big = big;
        this.small = small;
        this.med = medium;

    }

    @Override
    public String toString() {
        return "ParkingSystem{" +
                "big=" + this.big +
                ", small=" + this.small +
                ", med=" + this.med +
                '}';
    }

    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(0, 0, 2);
        System.out.println( ps.toString());
        System.out.println(ps.addCar(1));
        System.out.println(ps.addCar(2));
        System.out.println(ps.addCar(3));



    }

    // checks whether there is a parking space available of car type,
    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                this.big -= 1;
                return this.big > -1;
            case 2:
                this.med -= 1;
                return this.med > -1;
            case 3:
                this.small -= 1;
                return this.small > -1;
            default:
                return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */

