package com.chengh.mall.feign;

import com.chengh.mall.feign.fallback.GoodsServiceFeignFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: mall-web
 * @description:
 * @author: chengh
 * @create: 2020-04-07 16:50
 */
@FeignClient(value = "MALL-SERVICE", fallback = GoodsServiceFeignFallBack.class)
public interface GoodsServiceClient {

    @RequestMapping(value = "/goods/getGood", method = RequestMethod.GET)
    String getGood();
}
