package org.hackerandpainter.springbootfeign.dataobject.vo;

import lombok.Data;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-06 09:47
 **/
@Data
public class RequestPostVO {
    private String strange;

    public RequestPostVO(String strange) {
        this.strange = strange;
    }
}
