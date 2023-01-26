package lecture08;

import classA.A1;

class Programming {
    // constructor
    Programming(){
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
       Car car1 = new Car("Toyota", "Revo", 2023);
       System.out.println(car1.getMake());
       System.out.println(car1.getModel());
        car1.setYear(2022);
       System.out.println(car1.getYear());
    }
}
