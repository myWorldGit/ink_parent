package com.ink.deidei.service.fallback;

import com.ink.deidei.commonutils.support.web.ReseponseResult;
import com.ink.deidei.commonutils.support.web.ReseponseResultUtils;
import com.ink.deidei.service.feign.GoodsServiceFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class GoodsServiceFallback implements FallbackFactory<GoodsServiceFeignClient> {
    @Override
    public GoodsServiceFeignClient create(Throwable throwable) {
        return new GoodsServiceFeignClient() {
            @Override
            public ReseponseResult getGoodsByPrimaryKey(Long gid) {
                return ReseponseResultUtils.buildHystrixExceptionResult(throwable.getMessage());
            }
        };

    }
}
