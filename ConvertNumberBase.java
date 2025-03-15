class Base10Number {
    double value;

    public int convertWholePartToBase2() {
        int aux = (int) value;
        int counter = 0;
        int result = 0;

        while (aux > 0) {
            int binary_digit = (aux % 2);
            result += (binary_digit * Math.pow(10, counter));
            aux = aux / 2;
            counter++;
        }

        return result;
    }

    public double convertDecimalPartToBase2(int precision) {
        double aux = value - (int) value;
        int counter = 0;
        double result = 0;

        while (counter < precision) {
            double binary_digit = aux * 2;

            if (binary_digit > 1){
                result += (1 * Math.pow(10, -(counter+1)));
                aux = binary_digit - (int) binary_digit;
            }
            else{
                result += (0 * Math.pow(10, -(counter+1)));
                aux = binary_digit;
            }

            counter++;
        }

        return result;
    }

    public double convertToBase2(int precision) {
        int wholePart = convertWholePartToBase2();
        double decimalPart = convertDecimalPartToBase2(precision);
        return wholePart + decimalPart;
    }
}

public class ConvertNumberBase {
    public static void main(String[] args) {
        Base10Number number = new Base10Number();

        number.value = 6.7;

        System.out.println(number.value + " em binário: " + number.convertToBase2(30));
    }
}