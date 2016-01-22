package Lesson2_Objects;// BlueJ project: lesson2/touchingRectangles
//
// You need to construct and draw two rectangles for this quiz.
//
// Both rectangles have width 20 and height 30. The first rectangle
// has top left corner at (60, 90). The bottom right corner of the 
// first rectangle should be the top left corner of the second 
// rectangle. 

public class RectangleDemo
{
    public static void main(String[] args)
    {
        /*Rectangle box = new Rectangle(60, 90, 20, 30);
        Rectangle box2 = new Rectangle(80, 120, 20, 30);

        box.draw();
        box2.draw();*//*
        // TODO: Construct and draw the rectangles
        Rectangle box = new Rectangle(5, 10, 60, 90);
        *//*System.out.println(box.getX());
        System.out.println(box.getWidth());
        box.translate(25, 40);
        System.out.println(box.getX());
        System.out.println(box.getWidth());*//*
        Rectangle box2 = box;
        box.setColor(Color.RED);
        box2.setColor(Color.BLUE);
        box.fill();*/

        Rectangle box = new Rectangle(45, 90, 60, 90);
        System.out.println("Before");
        System.out.println("X is: " + box.getX());
        System.out.println("Y is: " + box.getY());
        System.out.println("Width is: " + box.getWidth());
        System.out.println("Height is: " + box.getHeight());
        System.out.println();
        box.grow(20, 20);

        // You need to print out the following values of box and its expected values:
        //
        System.out.println("After");
        System.out.println("X is: " + box.getX());
        System.out.println("Expected X: " + 25);
        System.out.println("Y is: " + box.getY());
        System.out.println("Expected Y: " + 70);
        System.out.println("Width is: " + box.getWidth());
        System.out.println("Expected width: " + 100);
        System.out.println("Height is: " + box.getHeight());
        System.out.println("Expected height: " + 130);
        System.out.println();
        // X, by using box.getX();
        // Y, by using box.getY();
        // width, by using box.getWidth();
        // height, by using box.getHeight();
        //
        // To print out a value and its expected value, use System.out.println(...);
        // For example:
        // System.out.println(box.getY());
        // System.out.println("Expected: " + 50);
        //
        // Print out the actual and test values below this line:






        }
    }

