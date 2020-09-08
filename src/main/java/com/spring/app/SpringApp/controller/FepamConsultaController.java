/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.app.SpringApp.controller;

import com.spring.app.SpringApp.infrastructure.webservice.fepam.FepamService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author euler
 */
@RestController
//@Controller
@RequestMapping("/fepamconsulta")
public class FepamConsultaController {

    @Autowired
    private FepamService fepamService;

    @RequestMapping("/consultarmtr")
    public String ConsultarDadosManifesto(String mtr) {
        return fepamService.obterDadosManifesto(mtr);
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome() {
        LocalDateTime dtNow = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String date_time = dtf.format(dtNow);
        HashMap params = new HashMap<String, Object>();
        params.put("date_time", date_time);
        //params.put("teste_msg", "mensagem de teste");
        return new ModelAndView("welcome", params);
    }
}
