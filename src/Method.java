import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Method {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = add(3, 8);
        int sum1 = add(3,8,4,9);
        String morning = morningGreeting("Toby Fox");
        String afternoon = afternoonGreeting("Toby Fox");
        String three = triple("ohbaby");
        int halfed = half(9);
        int round = roundPositiveValueToNearestInteger(7.88);
    }
    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c, int d){
        int sum1 = add(a, b);
        int sum2 = add(c, d);
        int finalSum = add(sum1, sum2);
        return finalSum;
    }
    public static void morningGreeting(String greeting){
        System.out.println("早上好, " + greeting);
    }
    public static void afternoonGreeting(String greeting){
        System.out.println("下午好, " + greeting);
    }

    public static void triple(String trip){
        System.out.println(trip + trip + trip);
    }

    public static int half(int a){
        int sum = a/2;
        return sum;
    }
    public static int roundPositiveValueToNearestInteger(int a){
        int roundedNumber = Math.round(a);
        return roundedNumber;
    }
    public static int roundNegativeValueToNearestInteger(int a){
        int negativeInteger = Math.round(a);
        return negativeInteger;
    }
}
