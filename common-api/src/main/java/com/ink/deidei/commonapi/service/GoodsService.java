package com.ink.deidei.commonapi.service;

import com.ink.deidei.commonutils.support.web.ReseponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("goods")
public interface GoodsService {
    @GetMapping("byPrimarykey")
    ReseponseResult getGoodsByPrimaryKey(@RequestParam("gid") Long gid);
}
