public class Calculation {

    public static void calculate(String[] array) {
        try {
            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[2]);
            int result;
            if (a <= 10 && b <= 10) {
                switch (array[1]) {
                    case "+" -> {
                        result = a + b;
                        System.out.println(result);
                    }
                    case "-" -> {
                        result = a - b;
                        System.out.println(result);
                    }
                    case "/" -> {
                        result = a / b;
                        System.out.println(result);
                    }
                    case "*" -> {
                        result = a * b;
                        System.out.println(result);
                    }
                    default -> throw new IllegalStateException("Неверное арифметическое действие: " + array[1]);
                }
            } else {
                throw new IllegalArgumentException("Калькулятор принимает арабские числа от 1 до 10");
            }
        } catch (NumberFormatException e) {
            int a = ConvertationToArabic.romanToArabic(array[0]);
            int b = ConvertationToArabic.romanToArabic(array[2]);
            int result;
            if (a <= 10 && b <= 10) {
                switch (array[1]) {
                    case "+" -> {
                        result = a + b;
                        System.out.println(ConvertationToRoman.arabicToRoman(result));
                    }
                    case "-" -> {
                        result = a - b;
                        System.out.println(ConvertationToRoman.arabicToRoman(result));
                    }
                    case "/" -> {
                        result = a / b;
                        System.out.println(ConvertationToRoman.arabicToRoman(result));
                    }
                    case "*" -> {
                        result = a * b;
                        System.out.println(ConvertationToRoman.arabicToRoman(result));
                    }
                    default -> throw new IllegalStateException("Неверное арифметическое действие: " + array[1]);
                }
            } else {
                throw new IllegalArgumentException("Калькулятор принимает римские числа от I до X");
            }
        }
    }
}

