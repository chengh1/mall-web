package com.chengh.mall.feign.fallback;

import com.chengh.mall.feign.GoodsServiceClient;
import org.springframework.stereotype.Component;

/**
 * @program: mall-web
 * @description:
 * @author: chengh
 * @create: 2020-04-07 18:02
 */
@Component
public class GoodsServiceFeignFallBack implements GoodsServiceClient {

    @Override
    public String getGood() {
        return "获取商品失败.";
    }
}
