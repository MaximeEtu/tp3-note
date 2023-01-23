package com.ensimTP3.ensim.controller;

import com.ensimTP3.ensim.model.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.util.Collections;

@Controller
public class MeteoController {

    @Autowired
    RestTemplate restTemplate;

    private String token = "022d8e37e74c081f5f48ee818d522b5eff9f0a8820454399089c1955bd9bda07";

    @PostMapping(value = "/meteo", produces = MediaType.APPLICATION_JSON_VALUE)
    public String printMeteo(@RequestParam("address") String address, ModelMap model) {

        model.addAttribute("name", address);

        // GET address
        AddressInfo addressInfo = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q=" + address.replaceAll(" ", "+"), AddressInfo.class);

        // Get the x and y coordinates to get the forecast
        Feature firstFeature = addressInfo.getFeatures()[0];
        double longitude = firstFeature.getGeometry().getCoordinates()[0];
        double latitude = firstFeature.getGeometry().getCoordinates()[1];

        // METEO
        Meteo meteo = restTemplate.getForObject("https://api.meteo-concept.com/api/forecast/daily?token="+ token + "&latitude="+latitude+"&longitude="+longitude, Meteo.class);
        model.put("items", meteo.getForecast());

        return "meteo";
    }

}
