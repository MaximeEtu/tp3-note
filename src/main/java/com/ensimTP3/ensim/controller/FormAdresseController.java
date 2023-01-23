package com.ensimTP3.ensim.controller;

import com.ensimTP3.ensim.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormAdresseController {
    @GetMapping("/adresse")
    public String adresse(Model model) {
        return "adresse";
    }
}