package com.ink.deidei.service.feign;

import com.ink.deidei.commonapi.service.GoodsService;
import com.ink.deidei.commonutils.support.web.ReseponseResult;
import com.ink.deidei.service.fallback.GoodsServiceFallback;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name="goods-service",fallbackFactory = GoodsServiceFallback.class)
public interface GoodsServiceFeignClient extends GoodsService {
}
