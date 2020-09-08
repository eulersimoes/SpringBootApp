/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.app.SpringApp.infrastructure.webservice.fepam;

import com.mashape.unirest.http.Unirest;
import com.spring.app.SpringApp.infrastructure.util.HttpUtil;
import org.springframework.stereotype.Service;

/**
 *
 * @author euler
 */
@Service
public class FepamService implements IFepamService {


    public FepamService()
    {

    }

    public void SetProxy(String proxyUser, String proxyPass,String proxyHost, Integer proxyPort)
    {
        Unirest.setHttpClient(HttpUtil.proxyClientBuild(proxyUser,proxyPass,proxyHost,proxyPort).build());
    }


    @Override
    public String obterDadosManifesto(String codigoManifesto) 
    {
        return "TESTE FEPAM";
    }
    
}
