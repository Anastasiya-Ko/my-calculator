package kopylova.mycalculator.controllers;

import kopylova.mycalculator.services.CalculatorService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@Validated
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CalculatorController {

    CalculatorService service;

    @GetMapping
    public Double webCalculator(
            @RequestParam double numberFirst,
            @RequestParam char sign,
            @RequestParam double numberSecond
    ) {
        return service.webCalculator(numberFirst, sign, numberSecond);
    }
}
