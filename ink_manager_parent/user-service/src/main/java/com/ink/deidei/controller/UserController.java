package com.ink.deidei.controller;

import com.ink.deidei.commonutils.support.web.ReseponseResult;
import com.ink.deidei.service.feign.GoodsServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    GoodsServiceFeignClient goodsServiceFeignClient;
    @GetMapping("userbyGoods")
    public ReseponseResult getUserOfGoods(@RequestParam("gid")  Long gid){
        return goodsServiceFeignClient.getGoodsByPrimaryKey(gid);
    }

}
