package org.hackerandpainter.springbootresttemplate.service;

import com.alibaba.fastjson.JSONObject;
import org.hackerandpainter.springbootresttemplate.vo.RequestPostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
        //创建请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //也可以这样设置contentType
        //MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        //headers.setContentType(type);

        //加不加Accept都可以
        //headers.add("Accept", MediaType.APPLICATION_JSON.toString());

        RequestPostVO boom = new RequestPostVO("boom");
        String jsonString = JSONObject.toJSONString(boom);
        HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);

        ResponseEntity<String> responseEntity = restTemplate.postForEntity("https://postman-echo.com/post", entity, String.class);
        return responseEntity.getBody();
    }
}
