//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Условный оператор if-else
         */
/*
        boolean isRain = true;

        System.out.println("Надеть куртку");
        System.out.println("Надеть обувь");
        System.out.println("Взять сумку");

        if (isRain) {
            System.out.println("Взять зонт");
        }

       /* Long a = 1000L;
        Long b = 1000L;

        System.out.println(a.equals(b));*/
        /*String animal = "Cat";
        if (animal.equals("cat")) {
            System.out.println("Мяу");
        } else if (animal.equals("dog")) {
            System.out.println("Гав");
        } else {
            System.out.println("Хрю");
        }*/
/*
        int floor = 1;
        double price = 3000;
        if (floor == 1 && price < 3000) {
            System.out.println("Подходит для аренды!");
        }

        // Тернарный оператор
        int a = 0;
        System.out.println(a > 0 ? "a положительное число" : "отрицательное число");

        /**
         * Условный оператор switch
         */
    /*    String animal = "dog";
        switch (animal) {
            case "cat":
                System.out.println("Мяу");
                break;
            case "dog":
                System.out.println("Гав");
                break;
            case "fish":
                System.out.println("Буль");
                break;
            case "bear":
                System.out.println("rrrr");
                break;
            default:
                System.out.println("Привет!");

        }
        /**
         * Циклы
         */
       /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                //выход из цикла
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                //пропуск итерации
                continue;
            }
            System.out.println(i);
        }*/
        /**
         * Условный оператор if-else
         */
        // 1. Программа, которая определяет, является ли оно четным или нечетным

        int number = 12;

        if (number % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }

        // 2. Программа, которая выводит «Первое больше», «Второе больше» или «Равны»

        int number1 = 12;
        int number2 = 12;

        if (number1 > number2) {
            System.out.println("Первое больше");
        } else if (number1 < number2) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Равны");
        }

        // 3. Программа, которая выводит «Положительное», «Отрицательное» или «Равно нулю»

        int number3 = 0;

        if (number3 > 0) {
            System.out.println("Число положительное");
        } else if (number3 < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

        // 4. Программа, которая по возрасту выводит  «Доступ разрешен», иначе — «Доступ запрещен», если возраст >= 18

        int age = 13;

        if (age >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        // 5. Калькулятор  ИМТ с интерпретацией

        BMICalculator bmiCalculator = new BMICalculator();

        bmiCalculator.BMI(163.0, 53.5);


        /**
         * Тернарный оператор
         */
        // 1. Программа определяет число «Положительное», «Отрицательное» или «Равно нулю», используя тернарный оператор

        int a = -1;
        System.out.println(a > 0 ? "число положительное число" :
                a < 0 ? "число отрицательное число" :
                        "число равно нулю");


        // 2. С помощью тернарного оператора программа проверяет, делится ли число на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»

        int b = 45;
        System.out.println(b % 3 == 0 && b % 5 == 0 ? "Кратно" :
                "Не кратно");


        // 3. Программа возвращает Для заданного числа строку «Четное» или «Нечетное», используя тернарный оператор

        int с = 46;
        System.out.println(с % 2 == 0 ? "Четное" :
                "Нечетное");


        /**
         * switch
         */
        // 1. Программа выводит название дня недели. Если число вне диапазона, выведится «Ошибка»

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int dayNumber = scanner1.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка");
        }

        // 2. Программа выводит описание оценки от 1 до 5

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Введите оценку от 1 до 5: ");
        int grade = scanner2.nextInt();

        String description;

        switch (grade) {
            case 1:
                description = "Плохо";
                break;
            case 2:
                description = "Неудовлетворительно";
                break;
            case 3:
                description = "Удовлетворительно";
                break;
            case 4:
                description = "Хорошо";
                break;
            case 5:
                description = "Отлично";
                break;
            default:
                description = "Ошибка: введите число от 1 до 5";
        }

        System.out.println(description);
        scanner2.close();


        /**
         * for
         */

        // 1.  Дан список чисел. Посчитайте сумму всех четных элементов

        int sum = 0;
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);


        // 2. Дан список чисел. Найдите максимальное значение

        int max = 0;
        for (int i = 1; i < 20; i++) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);


        // 3. Дано число n. Выведите таблицу умножения для n от 1 до 10

        int n = 5;

        System.out.println("Таблица умножения для " + n + ":");
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }


        // 4. С помощью цикла for выведите числа от 10 до 1 в обратном порядке

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 5.  Найдите количество четных чисел в диапазоне от 1 до 50
        int count = 0;
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                count += 1;
            }
        }
        System.out.println(count);

        /**
         * while
         */

        // 1. Найдите наименьшее число больше 100, которое делится на 7

        int x = 100;
        while (true) {
            if (x % 7 == 0) {
                System.out.println(x);
                break;
            }
            x++;
        }

        // 2. Дано число n. Вычислите его факториал через цикл while

        int f = 6;
        long factorial = 1;
        int i = 1;

        while (i <= f) {
            factorial *= i;
            i++;
        }
        System.out.println(n + "! = " + factorial);

        // 3. Дано число. Определите, является ли оно простым

        int z = 5;
        int h = 2;
        boolean isPrime = true;

        while (h < z) {
            if (z % h == 0) {
                isPrime = false;
                break;
            }
            h++;
        }
        if (isPrime) {
            System.out.println("Число является простым");
        } else {
            System.out.println("Число является непростым");
        }
        System.out.println();

        //4. Придумать задачу самим

        int countdown = 10;

        while (countdown > 1) {
            countdown--;
            System.out.println(countdown);
        }
        System.out.println("Поехали!");
        System.out.println();

        /**
         * break & continue
         */

        // 1. Выведите все числа от 1 до 20, кроме тех, что делятся на 3

        for (int j = 1; j < 20; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }

        // 2. Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int sum2 = 0;

        // Генерируем 10 случайных чисел от -50 до 50
        for (int y = 0; y < 10; y++) {
            numbers.add(random.nextInt(101) - 50);
        }
        System.out.println("Список чисел" + numbers);

        for (int num : numbers) {
            if (num < 0) {
                break;
            }
            sum2 += num;
        }
        System.out.println("Сумма: " + sum2);

        // 3. Дан список чисел. Суммируйте элементы, пока сумма не превысит 100

        List<Integer> numbers2 = new ArrayList<>();
        Random random2 = new Random();
        int sum3 = 0;

        // Генерируем 10 случайных чисел от 0 до 99
        for (int y = 0; y < 10; y++) {
            numbers2.add(random2.nextInt(100));
        }
        System.out.println("Список чисел" + numbers2);

        for (int num : numbers2) {
            if (sum3 + num <= 100) {
                sum3 += num;
            } else {
                break;
            }
        }
        System.out.println("Сумма: " + sum3);

    }
}





