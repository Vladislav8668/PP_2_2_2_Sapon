package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping()
    public String printAllCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = Car.makeListOfFiveCars();
        cars = carService.getCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
