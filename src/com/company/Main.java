package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(inf(30, 20));
        System.out.println(inf(15, 3));
        System.out.println(inf(50, 36));
        System.out.println(inf(12, 35));
        System.out.println(inf(70, -40));

    }

    public static String inf(int age, int temperature) {
        String result = "";
        if (age < 45 && age > 25 && temperature > -20 && temperature < 30) {
            result = "можно идти гулять";

        } else if (age < 20 && temperature > 0 && temperature < 28) {
            result = "Можно идти гулять!";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            result = "Можно идти гулять!!";
        } else {
            result = "Оставайтесь Дома";
        }
        return result;
    }


}

//            if (age< 45 && temperature > 10 && temperature <25 );
//            result = "можно идти гулять";
//            if (age >20 && temperature> 0 && temperature <28);
//          result = " можно идти гулять";
//           if (age >45 && temperature > 45 && temperature >50);
//           result = "Оставайтесь дома";