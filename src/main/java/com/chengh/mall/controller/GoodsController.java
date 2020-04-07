package com.chengh.mall.controller;

import com.chengh.mall.feign.GoodsServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mall-web
 * @description:
 * @author: chengh
 * @create: 2020-04-07 14:22
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsServiceClient goodsServiceClient;

    @RequestMapping(value = "/print", method = RequestMethod.GET)
    public String print() {
        return goodsServiceClient.getGood();
    }
}
