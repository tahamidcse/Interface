public class Interface {
}
######1
public interface Measurable

{

    //Declare the method

    double getMeasure();
    public static Measurable largest(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }
        Measurable largestData = objects[0];
        for (int i = 1; i < objects.length; i++)
        {
            Measurable current = objects[i];
            if (current.getMeasure() > largestData.getMeasure())
            {
                largestData = current;
            }
        }
        return largestData;

        public static Measurable smallest(Measurable[] objects)
        {
            if (objects.length == 0)
            {
                return null;
            }
            Measurable smallestData = objects[0];
            for (int i = 1; i < objects.length; i++)
            {
                Measurable current = objects[i];
                if (current.getMeasure() < smallestData.getMeasure())
                {
                    smallestData = current;
                }
            }
            return smallestData;
        }

    }

}

###2
        File name: “Measurable.java”

//Create an interface

public interface Measurable

{

    //Declare the method

    double getMeasure();

}

    File name: “Data.java”

//Create a class

public class Data

{

    //Define the method

    public static double average(Measurable[] objects)

    {

        //Initialize the variable

        double sum = 0;

        //Make for loop for objects

        for(Measurable obj:objects)

        {

            //Update sum value

            sum = sum + obj.getMeasure();

        }

        //Check the value is positive

        if (objects.length > 0)

        {

            //Return the value

            return sum / objects.length;

        }

        //Otherwise

        else

        {

            //Return "0"

            return 0;

        }

    }

    //Define the method

    public static Measurable max(Measurable[] objects)

    {

        //Check whether the length of the object is "0"

        if (objects.length == 0)

        {

            //Return null value

            return null;

        }

        //Assign the object

        Measurable max = objects[0];

        //Make for loop to traverse objects

        for (Measurable obj : objects)

        {

            //Check the condition

            if (obj.getMeasure() > max.getMeasure())

            {

                //Assign the maximum measures of object

                max = obj;

            }

        }

        //Return the value that has maximum measures

        return max;

    }

}

    File name: “Quiz.java”

//Create a class

public class Quiz implements Measurable

{

    //Declare the necessary variables

    private double score1;

    private String grade1;

    //Define the constructor

    public Quiz(double a_Score, String a_Grade)

    {

        //Assign the initial values

        score1 = a_Score;

        grade1 = a_Grade;

    }

    //Define the getter method

    public double getScore()

    {

        //Return the score

        return score1;

    }

    //Define the getter method to return grade

    public String getGrade()

    {

        //Return the grade

        return grade1;

    }

    //Define the method

    public double getMeasure()

    {

        //Return score

        return score1;

    }

}

    File name: “QuizTest.java”

//Create a class

public class QuizTest

{

    //Define a method

    public static void main(String[] args)

    {

        //Create array of objects

        Measurable quiz_Data[] = new Measurable[3];

        //Call the constructor to assign initial values

        quiz_Data[0] = new Quiz(89, "B+");

        quiz_Data[1] = new Quiz(90, "A-");

        quiz_Data[2] = new Quiz(73, "C");

        //Assign the value returned from average()

        double avge = Data.average(quiz_Data);

        //Assign the value returned from max()

        Quiz maximum = (Quiz) Data.max(quiz_Data);

        //Print he average score

        System.out.println("Average score: " + avge);

        //Print the expected score

        System.out.println("Expected: 84.0");

        //Print the highest score

        System.out.println("Highest score: " + maximum.getScore());

        //Print the expected highest score

        System.out.println("Expected: 90.0");

        //Print the highest grade

        System.out.println("Highest grade: " + maximum.getGrade());

        //Print the expected grade

        System.out.println("Expected: A-");

    }

}
Step 4 > Sample Output

        Output:

        Average score: 84.0

        Expected: 84.0

        Highest score: 90.0

        Expected: 90.0

        Highest grade: A-

        Expected: A-


        #########3




        File name: “Measurable.java”
//Create an interface
public interface Measurable
{
    //Declare the method
            double getMeasure();
}
    File name: “Data.java”
//Create a class
public class Data
{
    //Define the method
            public static double average(Measurable[] objects)
    {
        //Initialize the variable
        double sum = 0;
        //Make for loop for objects
        for(Measurable obj:objects)
        {
            //Update sum value
            sum = sum + obj.getMeasure();
        }
        //Check the value is positive
        if (objects.length > 0)
        {
            //Return the value
            return sum / objects.length;
        }
        //Otherwise
        else
        {
            //Return "0"
            return 0;
        }
    }
    //Define the method
            public static Measurable max(Measurable[] objects)
    {
        //Check whether the length of the object is "0"
        if (objects.length == 0)
        {
            //Return null value
            return null;
        }
        //Assign the object
        Measurable max = objects[0];
        //Make for loop to traverse objects
        for (Measurable obj : objects)
        {
            //Check the condition
            if (obj.getMeasure() > max.getMeasure())
            {
                //Assign the maximum measures of object
                max = obj;
            }
        }
        //Return the value that has maximum measures
        return max;
    }
}
    File name: “Person.java”
//Create a class
public class Person implements Measurable
{
    //Declare the necessary variables
            private String nameP;
    private double heightP;
    //Define the constructor
            public Person(String nameP, double heightP)
    {
        //Assign the initial values
        this.nameP = nameP;
        this.heightP = heightP;
    }
    //Define the getter method to return the height
            public double getHeight()
    {
        //Return height
        return heightP;
    }
    //Define the getter method to return the name
            public String getName()
    {
        //Return the name
        return nameP;
    }
    /*Define the method to return the height for the Measurable interface*/

    Tahamid, [11/7/2022 8:32 PM]
            public double getMeasure()
    {
        //Return the height
        return heightP;
    }
}
    File name: “PersonTest.java”
//Create a class
public class PersonTest
{
    //Define the method
            public static void main(String[] args)
    {
        //Create array of objects
        Measurable persons[] = new Measurable[3];
        //Call the constructor to assign the values
        persons[0] = new Person("Joe", 183);
        persons[1] = new Person("Chrissy", 158);
        persons[2] = new Person("Bobby", 175);
        //Assign the value returned from "average()"
        double avge = Data.average(persons);
        //Assign the value returned from "max()"
        Person max1 = (Person) Data.max(persons);
        //Print the average and expected height
        System.out.println("Average height: " + avge);
        System.out.println("Expected: 172.0");
        //Print the name of the person
    System.out.println("Name of tallest person: " + max1.getName());
        //Print the expected name of the person
        System.out.println("Expected: Joe");
    }
}
    Sample Output
Output:
        Average height: 172.0
        Expected: 172.0
        Name of tallest person: Joe
        Expected: Joe
        #######4

public interface Sequence
{
    int next();
    public interface Sequence
    {

        int next();
        default int [] values(int n){
            int[] v = new int[n];
            for(int i = 0; i < n; i++)
                v[i] = next();
            return v;
        }
    }
    public static Sequence multiplesOf(int n)

    {


        Sequence s =new Sequence() {

            private int m;

            private int multiplier=n;

            @Override

            public int next() {


                int number= m*multiplier;

                m++;

                return number;

            }

        };

        return s;

    }

}

    public static Sequence powersOf(int n)

    {


        Sequence s =new Sequence() {

            private int exponent;

            private int base=n;

            @Override

            public int next() {


                int number=Math.pow(base,exponent);

                exponent++;

                return number;

            }

        }

        return s;

    }

}
import java.util.Arrays;



public class Test {



    public static void main(String args[])



    {

        Sequence s1=Sequence.multiplesOf(5);
        Sequence s2=Sequence.powersOf(5);




        int[] multiplesOf5=s1.values(5);

        int[] powersOf5=s2.values(5);



        System.out.println(Arrays.toString(multiplesOf5));
        System.out.println(Arrays.toString(powersOf5));



    }

}

#####5

public interface Sequence
{

    int next();
    default int [] values(int n){
        int[] v = new int[n];
        for(int i = 0; i < n; i++)
            v[i] = next();
        return v;
    }
}
###########6
        File name: “Sequence.java”

        //Create a package

        package Seq;

//Import necessary package

        import java.util.Arrays;

//Create an interface

public interface Sequence

{

    //Declare the method

    int next();

    //Define the method

    default void process(int valuesTo_Process)

    {

        //Declare an array

        int[] counter = new int[10];

        //Create loop till the value passed

        for (int i = 1; i <= valuesTo_Process; i++)

        {

            //Assign the value returned from next()

            int val = next();

            //Calculate one's place

            int last_Digit = val % 10;

            //Increment the array element value by "1"

            counter[last_Digit]++;

        }

        //Print the array

        System.out.println(Arrays.toString(counter));

    }

}

    File name: “SquareSequence.java”

        //Create a package

        package Seq;

//Create a class

public class SquareSequence implements Sequence

{

    //Declare the variable

    private int n;

    //Define the method

    public int next()

    {

        //Increment the value by "1"

        n++;

        //Return the multiplied value

        return n * n;

    }

}

    File name: “SequenceProcessTest.java”

        //Create a package

        package Seq;

//Create a class

public class SequenceProcessTest

{

    //Define main() method

    public static void main(String[] args)

    {

        //Create object for SquareSequence

        Sequence seq = new SquareSequence();

        //Call the method "process()"

        seq.process(1000);

        //Print expected values

        System.out.println("Expected: [100, 200, 0, 0, 200, 100, 200, 0, 0, 200]");

    }

}
    Sample Output

Output:

        [100, 200, 0, 0, 200, 100, 200, 0, 0, 200]

        Expected: [100, 200, 0, 0, 200, 100, 200, 0, 0, 200]



        ######7

public class Data
{
    public static double average (Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if(objects.length > 0) {return sum / objects.length;}
        return 0;
    }

    public static double average(Object[] objects, Measurer meas)
    {
        double sum = 0;
        for (Object obj : objects)
        {
            sum = sum + meas.measure(obj);
        }
        if (objects.length > 0) {return sum/objects.length;}
        else {return 0;}
    }
    public static Object max(Object[] objects, Measurer m) {
        double maxMeasure = m.measure(0);
        int maxIndex = 0;
        for (int i=0; i< objects.length; i++)
        {
            Object obj = objects[i];
            if(maxMeasure<m.measure(i)){
                maxMeasure = m.measure(i);
                maxIndex = i;
            }
        }
        return objects[maxIndex];
    }
}


######8


/************************** Measurer.java ***************************/
/**
 * Describes any class whose objects can measure other objects.
 */
public interface Measurer {

    /**
     * Computes the mesure of an object.
     * @param anObject the object to be measured
     * @return the measure
     */
    double measure(Object anObject);
}

/*********************** RectangleMeasurer.java *******************/
public class RectangleMeasurer implements Measurer {

    @Override
    public double measure(Object anObject) {
        Rectangle r = (Rectangle) anObject;
        double perimeter = r.getWidth() + r.getHeight();
        return perimeter;
    }
}

/******************* Rectangle.java ***********************/

public class Rectangle extends Object {


    double height;

    double width;


    Rectangle(double h, double w) {

        height = h;

        width = w;

    }


    double getHeight() {

        return height;

    }


    double getWidth() {

        return width;

    }


    public static void main(String args[]) {

        Measurer m = new RectangleMeasurer();

        double max = -1, measure;

        Rectangle[] rect = new Rectangle[5];

        rect[0] = new Rectangle(1,3);

        rect[1] = new Rectangle(4,5);

        rect[2] = new Rectangle(7,9);

        rect[3] = new Rectangle(2,2);

        rect[4] = new Rectangle(4,4);

        for(int i = 0; i < 5; i++) {

            measure = m.measure(rect[i]);

            if(max < measure)

                max = measure;

        }

        System.out.println("Maximum perimeter : " + max);

    }

}

#####9
        File name: “Coin.java”
        //Create a package
        package group;
//Create a class
public class Coin implements Comparable
{
    //Declare the necessary variables
    private double value;
    private String name;
    //Define the constructor
    public Coin(double aValue, String aName)
    {
        //Assign initial values
        value = aValue;
        name = aName;
    }
    //Define the method
    public double getValue()
    {
        //Return the value
        return value;
    }
    //Define the method
    public String getName()
    {
        //Return the name
        return name;
    }
    //Define the method
    public int compareTo(Object otherObject)
    {
        //Assign the object properties to Coin object
        Coin other = (Coin) otherObject;
        /*Check whether the coin value is less than the specified value*/
        if (value < other.value)
            //Return "-1"
            return -1;
            /*Otherwise check whether the coin value is greater than the specified coin value*/
        else if (value > other.value)
            //Return "1"
            return 1;
            //Otherwise
        else
            //Return "0"
            return 0;
    }
}
    File name: “CoinTest.java”
        //Create a package
        package group;
//Create a class
public class CoinTest
{
    //Define the method
    public static void main(String[] args)
    {
        //Create objects for Coin class
        Comparable coin_1 = new Coin(.25, "Quarter");
        Comparable coin_2 = new Coin(.10, "Dime");
        Comparable coin_3 = new Coin(.10, "Dime");
        //Print the value returned from "compareTo()"
        System.out.println(coin_1.compareTo(coin_2));
        //Print the expected value
        System.out.println("Expected: 1");
        //Print the value returned
        System.out.println(coin_2.compareTo(coin_3));
        //Print the expected value
        System.out.println("Expected: 0");
        //Print the value returned
        System.out.println(coin_3.compareTo(coin_1));
        //Print the expected value
        System.out.println("Expected: -1");
    }
}
Step 4 > Sample Output
        Output:
        1
        Expected: 1
        0
        Expected: 0
        -1
        Expected: -1

        #######10

        import java.awt.Rectangle;



/**

 Test data with measurable , Measure objects

 */

public class Data

{

    public static void main(String[] args)

    {

        class RectangleMeasurer implements Measurer

        {

            public double measure(Object anObject)

            {

                Rectangle aRectangle1 = (Rectangle) anObject;

                double perimeter = 2*(aRectangle1.getWidth()+aRectangle1.getHeight());

                return perimeter;

            }

        }



        Measurer m = new RectangleMeasurer();



        DataSet d1 = new DataSet(m);



        d1.add(new Rectangle(5, 10, 20, 30));

        d1.add(new Rectangle(10, 20, 30, 40));

        d1.add(new Rectangle(20, 30, 5, 10));



        System.out.println("Average perimeter: " + d1.getAverage());

        System.out.println("Expected: 616.6666667");



        Object max = d1.getMaximum();

        System.out.println("Largest perimeter: " + m.measure(max));

        System.out.println("Expected: 1200");



    }


######11







    File name: “Measurer.java”

        //Create a package

        package group;

//Create an interface

    public interface Measurer

    {

        //Declare the method

        double measure(Object an_Object);

    }

    File name: “Data.java”

        //Create a package

        package group;

//Create a class

    public class Data

    {

        //Define the method

        public static double average(Object[] objects, Measurer meas)

        {

            //Initialize the variable

            double sum = 0;

            //Make for loop for objects

            for (Object obj : objects)

            {

                //Update sum value

                sum = sum + meas.measure(obj);

            }

            //Check whether the value is positive

            if (objects.length > 0)

            {

                //Return the value

                return sum / objects.length;

            }

            //Otherwise

            else

            {

                //Return "0"

                return 0;

            }

        }

        //Define the method

        public static Object max(Object[] objects, Measurer meas)

        {

            //Check whether the length of the object is "0"

            if (objects.length == 0)

            {

                //Return null value

                return null;

            }

            /*Assign the first object's value as the maximum measure */

            Object max = objects[0];

            //Make for loop for objects

            for (Object obj : objects)

            {

                //Check the condition

                if (meas.measure(obj) > meas.measure(max))

                {

                    //Assign the maximum measures of object

                    max = obj;

                }

            }

            //Return the maximum measures

            return max;

        }

    }

    File name: “PerimeterMeasurer.java”

        //Create a package

        package group;

//Import necessary package

import java.awt.Rectangle;

//Create a class

    public class PerimeterMeasurer implements Measurer

    {

        //Define the method

        public double measure(Object an_Object)

        {

            //Assign the object properties to the Rectangle object

            Rectangle a_Rectangle = (Rectangle) an_Object;

            //Computer the perimeter

            double perimeter = (2 * a_Rectangle.getWidth())

                    + (2 * a_Rectangle.getHeight());

            //Return the perimeter

            return perimeter;

        }

    }

    File name: “PerimeterTest.java”

        //Create a package

        package group;

//Import necessary package

import java.awt.Rectangle;

//Create a class

    public class PerimeterTest

    {

        //Define a method

        public static void main(String[] args)

        {

            //Create the object for PerimeterMeasurer

            Measurer m = new PerimeterMeasurer();

            //Create array object for Rectangle

            Rectangle rects[] = new Rectangle[3];

            //Call the constructor with different values

            rects[0] = new Rectangle(5, 10, 20, 30);

            rects[1] = new Rectangle(10, 20, 30, 40);

            rects[2] = new Rectangle(20, 30, 5, 10);

            //Print the average perimeter

            System.out.println("Average perimeter: " + Data.average(rects, m));

            //Print the expected perimeter

            System.out.println("Expected: 90.0");

            //Assign the value returned from the method "max()"

            Rectangle max = (Rectangle) Data.max(rects, m);

            //Print the largest perimeter

            System.out.println("Largest perimeter: " + max);

            //Print the expected largest perimeter

            System.out.println("Expected: java.awt.Rectangle"

                    + "[x=10,y=20,width=30,height=40]");

        }

    }
    Step 4 > Sample Output

    Output:

    Average perimeter: 90.0

    Expected: 90.0

    Largest perimeter: java.awt.Rectangle[x=10,y=20,width=30,height=40]

    Expected: java.awt.Rectangle[x=10,y=20,width=30,height=40]


        ########12

    File name: “Bag.java”
        //Create a package
        package group;
//Import necessary packages
import java.util.List;
import java.util.ArrayList;
    //Create a class
    public class Bag
    {
    //Create a list
            private List<Item> item;
    //Define the constructor
            public Bag()
    {
        //Create array list
        item = new ArrayList<Item>();
    }
    //Define the method
            public void add(String itemName)
    {
        //Make a loop to iterate over items
        for (Item itm : item)
        {
            /*Check whether the name of the list item is equals to the name passed*/
            if (itm.getName().equals(itemName))
            {
                //Call the method
                itm.incrementQuantity();
                //Return nothing
                return;
            }
        }
        //Call the method to add the item
        item.add(new Item(itemName, 1));
    }
    //Define the method
            public int count(String itemName)
    {
        //Make a loop to iterate over items
        for (Item itm : item)
        {
            /*Check whether the name of the list item is equals to the name passed*/
            if (itm.getName().equals(itemName))
            {
                //Return the item quantity
                return itm.getQuantity();
            }
        }
        //Return "0"
        return 0;
    }
    //Create an inner class
            private static class Item
    {
        //Declare the necessary variables
        private String iname;
        private int iquantity;
        //Define the constructor
        public Item(String iname, int iquantity)
        {
            //Assign the initial values for the variables
            this.iname = iname;
            this.iquantity = iquantity;
        }
        //Define the method
        public String getName()
        {
            //Return the name
            return iname;
        }
        //Define the method
        public int getQuantity()
        {
            //Return the quantity
            return iquantity;
        }
        //Define the method
        public void incrementQuantity()


        {
            //Increment the quantity
            iquantity++;
        }
    }
    }




    File name: “BagTest.java”
        //Create a package
        package group;
    //Create a class
    public class BagTest
    {
    //Define the method
            public static void main(String[] args)
    {
        //Construct the object for "Bag" class
        Bag bagob = new Bag();
        //Add the different items into the array list
        bagob.add("car");
        bagob.add("tree");
        bagob.add("car");
        bagob.add("tree");
        bagob.add("shoe");
        bagob.add("tree");
        //Print the item "Shoe" and its quantity
        System.out.println("Shoes: " + bagob.count("shoe"));
        //Print the expected quantity
        System.out.println("Expected: 1");
        //Print the item "Car" and its quantity
        System.out.println("Cars: " + bagob.count("car"));
        //Print the expected quantity
        System.out.println("Expected: 2");
        //Print the item "tree" and its quantity
        System.out.println("Trees: " + bagob.count("tree"));
        //Print the expected quantity
        System.out.println("Expected: 3");
        //Print the item "Light" and its quantity
        System.out.println("Lights: " + bagob.count("light"));
        //Print the expected quantity
        System.out.println("Expected: 0");
    }
    }
    Step 4 > Sample Output
    Output:
    Shoes: 1
    Expected: 1
    Cars: 2
    Expected: 2
    Trees: 3
    Expected: 3
    Lights: 0
    Expected: 0


        ############13

    File name: “Grid.java”

        //Create a package

        package group;

//Import necessary package

import java.util.ArrayList;

//Create a class

    public class Grid

    {

        //Declare the two dimensional array

        private String grids[][];

        //Define the constructor

        public Grid(int numRows, int numColumns)

        {

            //Assign the grid values

            grids = new String[numRows][numColumns];

        }

        //Define the method

        public void add(int row, int column, String description)

        {

            /*Check whether the row is greater than or equal to "0" and less than the grid length and column is greater than or equal to "0" and is less than the length of the current row*/

            if (row >= 0 && row < grids.length && column >= 0 && column < grids[row].length)

            {

                //Add the description to a location of the grid

                grids[row][column] = description;

            }

        }

        //Define the method

        public String getDescription(int row, int column)

        {

            /*Check whether the row is greater than or equal to "0" and less than the grid length and column is greater than or equal to "0" and is less than the length of the current row*/

            if (row >= 0 && row < grids.length && column >= 0

                    && column < grids[row].length)

            {

                //Return the description at a location in grid

                return grids[row][column];

            }

            //Return null value

            return null;

        }

        //Define the method

        public ArrayList<Location> getDescribedLocations()

        {

            //Create ArrayList

            ArrayList<Location> location = new ArrayList<Location>();

            //Create loop to iterate over row in a grid

            for (int r = 0; r < grids.length; r++)

            {

                //Create loop to iterate over row in a grid

                for (int col = 0; col < grids[r].length; col++)

                {

                    /*Check whether the grid location has a description */

                    if (grids[r][col] != null)

                    {

                        //Add the location to the list

                        location.add(new Location(r, col));

                    }

                }

            }

            //Return the list

            return location;

        }

        //Create an inner class

        public static class Location

        {

            //Declare the necessary variables

            private int r;

            private int col;

            //Define the constructor to create location

            public Location(int r, int col)

            {

                //Set initial row

                this.r = r;

                //Set initial column

                this.col = col;

            }

            //Define the method

            public int getRow()

            {

                //Return he row

                return r;

            }

            //Define the method

            public int getColumn()

            {

                //Return the column

                return col;

            }

        }

    }

    File name: “GridTest.java”

        //Create a package

        package group;

//Create a class

    public class GirdTest

    {

        //Define the method

        public static void main(String[] args)

        {

            //Create object for "Grid" class

            Grid gr = new Grid(3, 4);

            //Add the description into the grid

            gr.add(2, 1, "shoe");

            gr.add(1, 2, "tree");

            gr.add(0, 1, "car");

            //Print the description for the specified location

            System.out.println(gr.getDescription(0, 1));

            //Print the expected description

            System.out.println("Expected: car");

            //Print the description for the specified location

            System.out.println(gr.getDescription(1, 2));

            //Print the expected description

            System.out.println("Expected: tree");

            //Print the description for the specified location

            System.out.println(gr.getDescription(2, 1));

            //Print the expected description

            System.out.println("Expected: shoe");

            /*Create loop to iterate over grid location that has description*/

            for (Grid.Location location : gr.getDescribedLocations())

            {

                //Print the grid location
                System.out.print(location.getRow() + "," + location.getColumn() + " ");

            }

            //Print new line

            System.out.println();

            //Print the expected grid location

            System.out.println("Expected: 0,1 1,2 2,1 ");

        }

    }
    Step 4 > Sample Output

    Output:

    car

    Expected: car

        tree

    Expected: tree

        shoe

    Expected: shoe

0,1 1,2 2,1

    Expected: 0,1 1,2 2,1

        #######14

    File name: “Grid.java”

        //Create a package

        package group;

//Import necessary package

import java.util.ArrayList;

//Create a class

    public class Grid

    {

        //Create ArrayList

        private ArrayList<Row> grid1;

        //Define the constructor

        public Grid()

        {

            //Set the grid

            grid1 = new ArrayList<Row>();

        }

        //Define the method

        public void add(int r, int col, String desc)

        {

            //Assign null value to Row object

            Row the_Row = null;

            //Create loop to iterate over grid row

            for (Row a_Row : grid1)

            {

                //Check whether the row is a specified row

                if (a_Row.getRowNumber() == r)

                {

                    //Assign the row

                    the_Row = a_Row;

                }

            }

            //Check whether the row is null

            if (the_Row == null)

            {

                //Assign the new row

                the_Row = new Row(r);

                //Add that row into the list

                grid1.add(the_Row);

            }

            //Call the method

            the_Row.setColumn(col, desc);

        }

        //Define the method

        public String getDescription(int r, int col)

        {

            //Make a loop to iterate over row

            for (Row the_Row : grid1)

            {

                //Check whether the row is a specified row

                if (the_Row.getRowNumber() == r)

                {

                    /*Return the description at the location in a grid*/

                    return the_Row.getDescription(col);

                }

            }

            //Return null value

            return null;

        }

        //Define the method

        public ArrayList<Location> getDescribedLocations()

        {

            //Create array list to gather the location

            ArrayList<Location> location = new ArrayList<Location>();

            //Create loop to iterate over grid location

            for (Row r : grid1)

            {

                //Add the location to the list                            location.addAll(r.getDescribedLocations());

            }

            //Return the list that has the location

            return location;

        }

        //Create a class

        public static class Location

        {

            //Declare the necessary variables

            private int r;

            private int col;

            //Define the constructor

            public Location(int r, int col)

            {

                //Set the location

                this.r = r;

                this.col = col;

            }

            //Define the method

            public int getRow()

            {

                //Return the row

                return r;

            }

            //Define the method

            public int getColumn()

            {

                //Return the column

                return col;

            }

        }

        //Create an inner class

        private static class Row

        {

            //Declare the variable

            private int row_Number;

            //Create ArrayList

            private ArrayList<RowColumn> column;

            //Define the constructor to create an unbounded row

            public Row(int row_Number)

            {

                //Set the values

                this.row_Number = row_Number;

                this.column = new ArrayList<RowColumn>();

            }

            //Define the method to set the column

            public void setColumn(int column_Number, String descrip)

            {

                //Initialize the necessary variables

                int column_Index = 0;

                boolean done = false;

                //Create loop to iterate over columns

                for (RowColumn col : column)

                {

                    //Execute for true

                    if (!done)

                    {

                        /*Check whether the column number is the specified column */

                        if (col.getColumnNumber() == column_Number)

                        {

                            //Set the value to true

                            done = true;

                        }

                        //Otherwise

                        else

                        {

                            //Increase the column index

                            column_Index++;

                        }

                    }

                }

                /*Check whether the column index is less than the column size*/

                if (column_Index < column.size())

                {

                    //Set the column

                    column.set(column_Index, new RowColumn(column_Number, descrip));

                }

                //Otherwise

                else

                {

                    //Add to the list

                    column.add(new RowColumn(column_Number, descrip));

                }

            }

            //Define the method

            public String getDescription(int column_Number)

            {

                //Create loop to iterate over column

                for (RowColumn column : column)

                {

                    /*Check whether the column is a specified column */

                    if (column.getColumnNumber() == column_Number)

                    {

                        //Return the description at a column

                        return column.getDescription();

                    }

                }

                //Return null value

                return null;

            }

            //Define the method

            public int getRowNumber()

            {

                //Return the row

                return row_Number;

            }

            //Define the method

            public ArrayList<Location> getDescribedLocations()

            {

                //Create ArrayList

                ArrayList<Location> location = new ArrayList<Location>();

                //Create loop to iterate over column

                for (RowColumn col : column)

                {

                    //Add the described location to the list

                    location.add(new Location(row_Number, col.getColumnNumber()));

                }

                //Return the list that has described locations

                return location;

            }

        }

        //Create a class

        private static class RowColumn

        {

            //Declare the necessary variables

            private int column_Number;

            private String descrip;

            //Define the constructor to create a column in a row

            public RowColumn(int column_Number, String descrip)

            {

                //Set a column

                this.column_Number = column_Number;

                //Set a description

                this.descrip = descrip;

            }

            //Define the method

            public int getColumnNumber()

            {

                //Return the column number

                return column_Number;

            }

            //Define the method

            public String getDescription()

            {

                //Return the description

                return descrip;

            }

        }

    }

    File name: “GridTest.java”

        //Create a package

        package group;

//Create a class

    public class GridTest

    {

        //Define the method

        public static void main(String[] args)

        {

            //Create object for "Grid" class

            Grid gr = new Grid();

            //Add the description into the grid

            gr.add(2, 1, "shoe");

            gr.add(1, 2, "tree");

            gr.add(0, 1, "car");

            //Print the description for the specified location

            System.out.println(gr.getDescription(0, 1));

            //Print the expected description

            System.out.println("Expected: car");

            //Print the description for the specified location

            System.out.println(gr.getDescription(1, 2));

            //Print the expected description

            System.out.println("Expected: tree");

            //Print the description for the specified location

            System.out.println(gr.getDescription(2, 1));

            //Print the expected description

            System.out.println("Expected: shoe");

            /*Create loop to iterate over grid location that has description*/

            for (Grid.Location location : gr.getDescribedLocations())

            {

                //Print the grid location

                System.out.print(location.getRow() + "," + location.getColumn() + " ");

            }

            //Print new line

            System.out.println();

            //Print the expected grid location

            System.out.println("Expected: 2,1 1,2 0,1 ");

        }

    }
    Step 4 > Sample Output

    Output:

    car

    Expected: car

        tree

    Expected: tree

        shoe

    Expected: shoe

2,1 1,2 0,1

    Expected: 2,1 1,2 0,1


