package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.bean.PmsBaseSaleAttr;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.service.AttrService;
import com.sun.xml.internal.ws.encoding.xml.XMLMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {
    @Reference
    AttrService attrService;

    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList(){
        List<PmsBaseSaleAttr> pmsBaseSaleAttrs =  attrService.baseSaleAttrList();
        return pmsBaseSaleAttrs;
    }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        String success = attrService.saveAttrInfo(pmsBaseAttrInfo);
        return "success";
    }
//    public List<PmsBaseAttrInfo> saveAttrInfo(String catalog3Id){
//        List<PmsBaseAttrInfo> pmsBaseAttrIn fos =  attrService.saveAttrInfo(catalog3Id);
//        return pmsBaseAttrInfos;
//    }


    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos =  attrService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }
}
