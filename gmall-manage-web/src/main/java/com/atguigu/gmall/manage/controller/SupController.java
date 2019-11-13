package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class SupController {
    @Reference

    SpuService spuService;


    @RequestMapping("supList")
    @ResponseBody
    public List<PmsProductInfo> supList(String catalog3Id){

        List<PmsProductInfo> pmsBaseAttrInfos = spuService.supList(catalog3Id);
        return pmsBaseAttrInfos;
    }
}
