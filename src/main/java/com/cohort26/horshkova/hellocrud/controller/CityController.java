package com.cohort26.horshkova.hellocrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CityController {
    @GetMapping("/cities")
    public String cities(Model model){
        List<String> cityList = new ArrayList<>();
        cityList.add("New York");
        cityList.add("London");
        cityList.add("Tokyo");

        model.addAttribute("cities", cityList);

        return "city-list";
    }
}
