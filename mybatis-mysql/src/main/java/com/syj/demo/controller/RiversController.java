package com.syj.demo.controller;

import com.syj.demo.vo.request.QueryRiversReq;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author syj
 * @version V1.0.0
 * @contact shiyunjie45@163.com
 * <ul>
 * @description 获取所有的河流信息
 * </ul>
 * @className Rivers
 * @createdTime 2022/11/22 8:54
 */
@Controller
public class RiversController {
    @ApiOperation(value = "查询河流")
    @PostMapping(value = "/queryRivers", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String queryRivers(@RequestBody QueryRiversReq queryRiversReq) {
        return queryRiversReq.getRiverName();
    }
}
