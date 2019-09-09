package org.hackerandpainter.springbootresttemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-05 14:03
 **/
@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    public String get(Integer id){
        return restTemplate.getForObject("http://www.baidu.com",String.class);
    }

    public String post() {
        return restTemplate.getForObject("http://www.baidu.com",String.class);
    }
}
