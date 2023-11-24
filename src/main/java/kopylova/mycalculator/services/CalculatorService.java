package kopylova.mycalculator.services;

import org.springframework.stereotype.Service;



@Service
public class CalculatorService {
    public double calculator(double numberFirst, char sign, double numberSecond) {

        return switch ((int) sign) {
            case 32 -> numberFirst + numberSecond;
            case 45 -> numberFirst - numberSecond;
            case 42 -> numberFirst * numberSecond;
            case 47 -> numberFirst / numberSecond;
            default -> throw new RuntimeException("Введите математический символ!");
        };
    }
}
