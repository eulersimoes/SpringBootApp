/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.app.SpringApp.infrastructure.webservice.fepam;

import org.springframework.stereotype.Service;

/**
 *
 * @author euler
 */
@Service
public class FepamService implements IFepamService {

    @Override
    public String obterDadosManifesto(String codigoManifesto) 
    {
        return "TESTE FEPAM";
    }
    
}
