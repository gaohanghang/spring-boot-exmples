package org.hackerandpainter.springbootfeign;

import feign.Headers;
import feign.RequestLine;
import org.hackerandpainter.springbootfeign.model.PostDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface HelloRemote {

	@RequestLine("GET /")
    String hello();

    @RequestLine("POST /post")
    @Headers("Content-Type: application/json")
    String testPostRequest(@RequestBody PostDTO postDTO);
}
