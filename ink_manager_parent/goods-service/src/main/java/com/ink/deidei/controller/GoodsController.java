package com.ink.deidei.controller;

import com.ink.deidei.commonapi.service.GoodsService;
import com.ink.deidei.commonutils.support.web.ReseponseResult;
import com.ink.deidei.commonutils.support.web.ReseponseResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController implements GoodsService {

    @Override
    @GetMapping("byPrimarykey")
    public ReseponseResult getGoodsByPrimaryKey(@RequestParam("gid")  Long gid) {
        return ReseponseResultUtils.buildSuccessfulResult("成功的"+gid);
    }
}
