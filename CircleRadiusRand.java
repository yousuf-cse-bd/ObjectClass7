package ObjectClass7;public class CircleRadiusRand {    private double radius;    private static int objectCounter;    public CircleRadiusRand(){        radius = 1;        objectCounter++;    }    public CircleRadiusRand(double radius){        this();        this.radius = radius;    }    public void setRadius(double radius) {        this.radius = radius;    }    public double getRadius(){        return radius;    }    public double getAreaOfCircle(){        return (Math.pow(radius, 2) * Math.PI);    }    public static int getObjectCounter() {        return objectCounter;    }}