package com.example.controller;

import com.example.service.VerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class VerifyController {
 @Autowired
 VerifyService verify;

      @RequestMapping("/verify/name")
 public String name(String name) {
     if (verify.chineseName(name)) {
     return " 中文名检验通过 ";
     }
     return " 这不是一个有效的中文姓名 ";
     }
 }
