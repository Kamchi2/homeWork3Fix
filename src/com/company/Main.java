package com.company;

public class Main {

    public static void main(String[] args) {
        double[] nums = {-3123.1213,1231.423,-13234.2452,3823.2566,-45665.224,46245.5624,-2465.25786,6776.89,-997.578,3535.437,-356.37356,3556.3677,-3565.3676,3635.2463};
        int result = 0;
        for (double m : nums) {
            result += m;
        }
        System.out.println("Значение среднего арифметического равно: " + result / nums.length);
    }

}
