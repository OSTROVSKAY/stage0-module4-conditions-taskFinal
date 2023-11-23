package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {

        boolean check = firstSide > 0 && secondSide > 0 && thirdSide > 0 && (firstSide < secondSide + thirdSide) && (secondSide < firstSide + thirdSide) && (thirdSide < firstSide + secondSide);

        if(check) {

            System.out.println("this is a valid triangle");

        } else {

          System.out.println("it's not a triangle");

        }

    }
}
