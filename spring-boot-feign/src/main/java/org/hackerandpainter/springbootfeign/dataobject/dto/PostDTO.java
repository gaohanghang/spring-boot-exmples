package org.hackerandpainter.springbootfeign.dataobject.dto;

import lombok.Data;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-06 09:47
 **/
@Data
public class PostDTO {
    private String strange;

    public PostDTO(String strange) {
        this.strange = strange;
    }
}
