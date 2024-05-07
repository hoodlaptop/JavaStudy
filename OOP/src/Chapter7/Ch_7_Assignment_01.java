package Chapter7;

import java.util.*;

public class Ch_7_Assignment_01
{
    public static double BMI(int heightCm, int weightKg)
    {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    public static int BmiYear(HashMap<Integer, Double> bmiMap)
    {
        int maxYear = 0;
        double maxBMI = Double.MIN_VALUE;

        Iterator<Integer> iterator = bmiMap.keySet().iterator();
        while (iterator.hasNext())
        {
            int year = iterator.next();
            double bmi = bmiMap.get(year);

            if (maxYear == 0 || bmi > maxBMI)
            {
                maxYear = year;
                maxBMI = bmi;
            }
        }

        return maxYear;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> heightV = new Vector<>();
        HashMap<Integer, Double> bmiM = new HashMap<>();

        System.out.println("2000~2009년까지 1년 단위로 키(cm)와 몸무게(kg)를 입력하세요.");

        for (int i = 0; i <= 9; i++) {
            int height = scanner.nextInt();
            int weight = scanner.nextInt();

            heightV.add(height);
            bmiM.put(i, BMI(height, weight));
        }

        int max = heightV.get(1) - heightV.get(0);
        int year = 0;

        for (int i = 0; i < 9 ; i++)
        {
            int x = heightV.get(i + 1) - heightV.get(i);
            if (max < x)
            {
                max = x;
                year = 2000 + i;
            }
        }

        System.out.println("가장 키가 많이 자란 연도는 " + year + "년 " + max + "cm");
        System.out.println("가장 큰 BMI를 가진 연도는 " + (2000 + BmiYear(bmiM)) + "년 " + bmiM.get(BmiYear(bmiM)));

        scanner.close();
    }
}
