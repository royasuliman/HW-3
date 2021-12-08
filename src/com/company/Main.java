// PP 4.1 Write a class called Counter that represents a simple
// tally counter, which might be used to count people as they
// enter a room. The Counter class should contain a single
// integer as instance data, representing the count. Write a
// constructor to initialize the count to zero. Write a method called
// click that increments the count and another method called
// getCount that returns the current count. Include a method
// called reset that resets the counter to zero. Finally, create a
// driver class called CounterTest that create a Counter
// objects and tests their methods.
class Counter
{
    private int counter;
    public Counter()
    {
        counter=0;
    }
    public void click()
    {
        counter=counter+1;
    }
    public int getCount()
    {
        return counter;
    }
    public void reset()
    {
        counter=0;
    }
}
public class CounterTest {

    public static void main(String[] args) {
        Counter c1=new Counter();
        System.out.println("counter:");
        System.out.println("Incrementing 3x:");
        c1.click();
        c1.click();
        c1.click();
        System.out.println("Counter_1 count "+c1.getCount());

        System.out.println("Reset counter 1");
        c1.reset();
        System.out.println("Counter_1 count "+c1.getCount());


    }

}

// PP 4.2 Write a class called Bulb that represents a light bulb
// that can be turned on and off. Create a driver class called
// Lights whose main method instantiates and turns on some
// Bulb objects.

public class LightBulb
{
    public static void main(String[] args)
    {
        Bulb bulbone=new Bulb("on");
        Bulb bulbtwo=new Bulb("off");
        Bulb bulbthree= new Bulb("on");
        System.out.println("First bulb:"+bulbone.toString());
        System.out.println("Second bulb:"+bulbtwo.toString());
        System.out.println("Third bulb:"+bulbthree.toString());
        bulbtwo= Bulb ("on");

        System.out.println("\nTurning on the bulbs");
        System.out.println("First bulb:"+bulbone.toString());
        System.out.println("Second bulb:"+bulbtwo.toString());
        System.out.println("Third bulb:"+bulbthree.toString());

    }
}

public class Bulb
{
    private String onandoff;
    public Bulb(String str)
    {
        onandoff=str;

    }
}

// PP 4.3 Write a class called Sphere that contains instance data
// that represents the sphere’s diameter. Define the Sphere
// constructor to accept and initialize the diameter, and include
// getter and setter methods for the diameter. Include methods
// that calculate and return the volume and surface area of the
// sphere (see PP 3.6 for the formulas). Include a toString
// method that returns a one-line description of the sphere. Create
// a driver class called MultiSphere , whose main method
// instantiates and updates several Sphere objects.

public class Sphere{

    {
        private int diameter;
        private double area;
        private double volume;
	public Sphere(int diameter)
        this.diameter = diameter;
        setSphereVolume();
        setSphereArea();
    }

    public void setSphereDiameter(int diameter)
    {
        this.diameter = diameter;
    }
    public int getSphereDiameter()
    {
        return diameter;
    }

    public void setSphereVolume()
    {

        volume = Math.PI * (4.0/3.0) *
                Math.pow((double)diameter/2.0,3);
    }
    public double getSphereVolume()
    {
        return volume;
    }
    public double getSphereArea()
    {
        return area;
    }
    public void setSphereArea()
    {
        area = Math.PI * 4.0 *

                Math.pow((double) diameter/2.0,2);
    }
    public String toString()
    {
        String info1 = Integer.toString(diameter);
        String info2 = Double.toString(area);
        String info3 = Double.toString(volume);
        return "Diameter: " +
                info1 + "\t" + "Area: " + info2 + "\t" +
                "Volume: " + info3 + "\t";
    }
    public static void main (String[] args)
    {
        Sphere sphere1 = new Sphere(4);
        Sphere sphere2 = new Sphere(9);
        Sphere sphere3 = new Sphere(13);

        sphere1.setSphereDiameter(7);

        System.out.println

                (sphere1.getSphereVolume());

        System.out.println
                (sphere1.getSphereArea());
        System.out.println
                (sphere1.getSphereDiameter());
        System.out.println(sphere1);
        System.out.println();
        System.out.println(sphere2.getSphereVolume());
        System.out.println(sphere2.getSphereArea());
        System.out.println(sphere2.getSphereDiameter());
        System.out.println(sphere2);
        System.out.println();
        System.out.println(sphere3.getSphereVolume());
        System.out.println(sphere3.getSphereArea());
        System.out.println(sphere3.getSphereDiameter());
        System.out.println(sphere3);

    }

}

// PP 4.4 Write a class called Dog that contains instance data that
// represents the dog’s name and age. Define the Dog constructor
// to accept and initialize instance data. Include getter and setter
// methods for the name and age. Include a method to compute
// and return the age of the dog in “person years” (seven times
// the dog’s age). Include a toString method that returns a oneline
// description of the dog. Create a driver class called Kennel ,
// whose main method instantiates and updates several Dog
// objects.
public class Dog
{
    private String name;
    private int Age = 0;

    public Dog(String d_name, int d_age)
    {
        Name=d_name;
        Age=d_age;
    }
    public void setd_Name(String dog_name)
    {
        Name = dog_name;
    }
    public String getd_Name()
    {
        return Name;
    }
    public int getd_Age()
    {
        return Age;
    }
    public void setd_Age(int dog_age)
    {
        Age = dog_age;
    }
    public int person_Years()
    {
        return Age*7;
    }
}

Agedog.class
import java.util.Scanner;
public class Agedog {

    public static void main (String[] args)
    {   String cleanInputBuffer;
        String dname,exit="exit";
        int age;
        Dog a=new Dog(" ",0);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println ( "Enter Name of the Dog(exit to exit): ");
            dname = sc.nextLine();
            if(dname.compareTo(exit)==0)
                System.exit(0);
            System.out.println ("Enter the age of the Dog: ");
            age= sc.nextInt();
            cleanInputBuffer =sc.nextLine();
            a.setd_Name(dname);
            a.setd_Age(age);
            System.out.println("Dog "+a.getd_Name()+" is "+a.getd_Age());
            System.out.println("Which is "+a.person_Years()+" years of person\n");

        }

    }

}

// PP 4.5 Write a class called Car that contains instance data that
// represents the make, model, and year of the car. Define the
// Car constructor to initialize these values. Include getter and
// setter methods for all instance data, and a toString method
// that returns a one-line description of the car. Add a method
// called isAntique that returns a boolean indicating if the car is
// an antique (if it is more than 45 years old). Create a driver class
// called CarTest , whose main method instantiates and updates
// several Car objects.
public class Car {
    private String make;
    private String model;
    private String year;
    public Car(String make,String model,String year) {
        this.make = make;
        this.model=model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String toString() {
        return "Make : "+this.make+" Model : "+this.model+" Year: "+this.year;
    }
    public boolean isAntique()

    {
        if((2021-this.year) > 45)
            return true;
        else
            return false;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("A", 1998);
        Car c2 = new Car();
        System.out.println(c1.toString());
        c2.setModel("ABC");
        c2.setYear(1890);
        System.out.println("Check Antique: "+c2.isAntique());
    }
}

// PP 4.6 Write a class called Box that contains instance data that
// represents the height, width, and depth of the box. Also include
// a boolean variable called full as instance data that
// represents whether the box is full or not. Define the Box
// constructor to accept and initialize the height, width, and depth
// of the box. Each newly created Box is empty (the constructor
// should initialize full to false). Include getter and setter
// methods for all instance data. Include a toString method that
// returns a one-line description of the box. Create a driver class
// called BoxTest , whose main method instantiates and updates
// several Box objects.
class BoxMaking{
    private double depth,width,height;
    BOX(double d,double b,double h){
        depth = d; width = b; height =h;
    }
    public void setDepth(double d) {
        this.depth = d;
    }
    public void setWidth(double b) {
        this.width = b;
    }
    public void setHeight(double h) {
        this.height = h;
    }
    public double getDepth() {
        return this.depth;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public double surfaceArea(){
        return 2 * (depth * width + width*height + height*depth);
    }
    public double volume() {
        return depth*width*height ;
    }
    public String toString(){
        return "Depth: "+Math.round(this.depth*100.0)/100.0 + ", Width:"+Math.round(this.width*100.0)/100.0+", Height: "+Math.round(this.height*100.0)/100.0;
    }
}
public class Box {
    private double height;
    private double width;
    private double depth;
    private boolean full;

    public Box() {
        height = width = depth = 1.0;
        full = false;
    }
    public Box(double side) {
        height = width = depth = side;
        full = false;
    }
    public Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
        full = false;
    }
    public String toString() {
        return height + "x" + width + "x" + depth + " Full: " + full;
    }
}

// PP 4.7 Write a class called Book that contains instance data for
// the title, author, publisher, and copyright date. Define the Book
// constructor to accept and initialize this data. Include setter and
// getter methods for all instance data. Include a toString
// method that returns a nicely formatted, multi-line description of
// the book. Create a driver class called Bookshelf , whose main
// method instantiates and updates several Book objects.
import java.text.SimpleDateFormat;
        import java.util.Date;

public class Book {

    private String title,author,publisher;
    private double price;
    private Date copyrightdate;
    public Book()

    {
        title = "";
        author = "";
        publisher = "";
        price = 0.0;
        copyrightdate = null;
    }

    public Book(String title, String author, String publisher, double price, Date copyrightdate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.copyrightdate = copyrightdate;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {

        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Date getCopyrightdate() {
        return copyrightdate;
    }
    public void setCopyrightdate(Date copyrightdate) {
        this.copyrightdate = copyrightdate;
    }
    public String toString() {
        String datepattern = "MM-dd-yyyy";
        return
                "Title: " + title +
                        "\nAuthor: " + author +
                        "\nPublisher: " + publisher +
                        "\nPrice: $" + price +
                        "\nCopyright Date: " + cpyrightdate;
    }
    public class Bookshelf {
        private final static int MAXIMUMSIZE=5;
        private Book[] object;
        private int countValue;
        public Bookshelf()
        {
            object = new Book[MAXIMUMSIZE];
            countValue=0;
        }
        public void addBook(Book book){
            if(countValue<MAXIMUMSIZE){
                object[countValue++]=book;
            }
        }
        public void removeBook(Book book){
            int indexDelete=-1;
            for(int k=0;k<countValue;k++){
                Book index=object;
                if(book.getTitle().equals(index.getTitle()) &&
                        book.getPublisher().equals(index.getPublisher()))
                {
                    delete=k;
                    break;
                }
            }
            if(delete==-1)
            {
                return;
            }
            if(delete==countValue-1)
            {
                countValue = countValue - 1;
                return;
            }
            public boolean isFull(){
                return countValue==MAXIMUMSIZE;
            }
            public boolean isEmpty(){
                return countValue==0;
            }
        }
        // PP 4.8 Write a class called Flight that represents an airline
// flight. It should contain instance data that represents the airline
// name, flight number, and the flight’s origin and destination
// cities. Define the Flight constructor to accept and initialize all
// instance data. Include getter and setter methods for all instance
// data. Include a toString method that returns a one-line
// description of the flight. Create a driver class called
// FlightTest , whose main method instantiates and updates
// several Flight objects.
        class Flight{
            private String airline, origin, destination;
            private int flightNumber;

            public Flight (String airline,int flightNumber, String origin, String destination){
                this.airline = airline;
                this.flightNumber = flightNumber;
                this.origin = origin;
                this.destination = destination;
            }
            public String getAirline ()
            {
                return airline;
            }
            public int getFlightNumber ()
            {
                return flightNumber;
            }
            public String getOrigin ()
            {
                return origin;
            }
            public String getDestination ()
            {
                return destination;
            }
            public void setAirline (String airline)
            {
                this.airline = airline;
            }
            public void setFlightNumber (int flightNumber)
            {
                this.flightNumber = flightNumber;
            }
            public void setOrigin (String origin)
            {
                this.origin = origin;
            }
            public void setDestination (String destination)
            {
                this.destination = destination;
            }
            public String toString (){
                return airline + ", " + flightNumber + "Coming from: " + origin +" Arriving at: " + destination;
            }
        }
        class FlightTest{
            public static void main (String[] args)
            {
                Flight one = new Flight ("Qatar",454, "Abu Dhabi", "Los Angeles" );
                Flight two = new Flight ("Turkish Airways",787, "Turkey", "London" );
                Flight three = new Flight ("Emarats", 333,"Shanghi", "Brisbane" );
                System.out.println (one);
                System.out.println (two);
                System.out.println (three);
                System.out.println();
            }


