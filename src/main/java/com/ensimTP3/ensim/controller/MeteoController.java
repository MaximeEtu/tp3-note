package com.ensimTP3.ensim.controller;

import com.ensimTP3.ensim.model.AddressInfo;
import com.ensimTP3.ensim.model.Feature;
import com.ensimTP3.ensim.model.Geometry;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;

@Controller
public class MeteoController {

    private String token = "022d8e37e74c081f5f48ee818d522b5eff9f0a8820454399089c1955bd9bda07";

    @PostMapping(value = "/meteo")
    public String printMeteo(HttpServletRequest request, Model model) {

        String content = request.getParameter("address");
        model.addAttribute("name", content);

        RestTemplate restTemplate = new RestTemplate();
        AddressInfo addressInfo = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q=" + content.replaceAll(" ", "+"), AddressInfo.class);

        // Get the x and y coordinates to get the forecast
        Feature firstFeature = addressInfo.getFeatures()[0];
        double longitude = firstFeature.getGeometry().getCoordinates()[0];
        double latitude = firstFeature.getGeometry().getCoordinates()[1];

        return "meteo";
    }

}


// autowired the restTemplate
// https://api.meteo-concept.com/api/location/city?token=bonjourToken&latitude=333&longitude=-1.6819

// TO:DO
// afficher proprement la météo dans l'html la météo de la ville dans /meteo
// readme.md avec les réponses aux questions
//  push github et umtice
