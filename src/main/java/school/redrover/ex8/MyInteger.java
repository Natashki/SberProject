package school.redrover.ex8;

public class MyInteger {
    int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return isEven(value);
    }

    public boolean isOdd(){
        return isOdd(value);
    }

    public boolean isPrime(){
        return isPrime(value);
    }

    public static boolean isPrime(int num){
        if(num == 1 || num == 2){
            return true;
        }
        for(int i = 2; i <=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

    public static boolean isPrime(MyInteger num){
        return isPrime(num.getValue());
    }

    public static boolean isEven(MyInteger num){
        return isEven(num.getValue());
    }

    public static boolean isOdd(MyInteger num){
        return isOdd(num.getValue());
    }



    public boolean equals(int num){
        return value == num;
    }

    public boolean equals(MyInteger num){
        return value == num.getValue();
    }

//    Статический метод parseInt(char[]), который преобразует массив числовых символов в значение типа int.
    public static int parseInt(char[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + (arr[i] - '0');
        }

        return result;
    }

    public static int parseInt(String st){
        return Integer.parseInt(st);
    }

}
