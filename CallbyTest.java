class CallbyTest{
    public static void main (String args[]){
        int a=10;
        Car mycar = new Car("father", 500);
        System.out.println("call by value");
        System.out.println("before calling : a="+a);
        Callby.value(a);
        System.out.println("after calling : a="+a);


        System.out.println("");
        System.out.println("call by reference");
        System.out.println("before calling : mycar.price ="+mycar.price + "\t mycar.owner="+mycar.owner);
        Callby.ref(mycar);
        System.out.println("after calling : mycar.price = "+ mycar.price + "\t mycar.owner ="+mycar.owner);
    }
}
