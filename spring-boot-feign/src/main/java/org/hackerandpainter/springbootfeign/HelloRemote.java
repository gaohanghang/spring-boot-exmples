package org.hackerandpainter.springbootfeign;

import feign.Headers;
import feign.RequestLine;
import org.hackerandpainter.springbootfeign.dataobject.vo.RequestPostVO;

public interface HelloRemote {

	@RequestLine("GET /")
    String hello();

    @RequestLine("POST /post")
    @Headers("Content-Type: application/json")
    String testPostRequest(RequestPostVO requestPostVO);
}
