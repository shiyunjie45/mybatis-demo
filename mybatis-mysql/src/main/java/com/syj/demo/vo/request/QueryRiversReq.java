package com.syj.demo.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author syj
 * @version V1.0.0
 * @contact shiyunjie45@163.com
 * <ul>
 * @description 查询河流请求参数
 * </ul>
 * @className QueryRiversReq
 * @createdTime 2022/11/22 13:51
 */
@Setter
@Getter
public class QueryRiversReq implements Serializable {
    private static final long serialVersionUID = 4061916288124102335L;

    @ApiModelProperty(value = "河流名称")
    String riverName;
}
