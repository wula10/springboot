package com.example.service;

import org.springframework.stereotype.Service;

@Service
 public class VerifyService {
 public boolean chineseName(String name) {
      String match = "^[\\u4e00-\\u9fa5]{2,4}$";
      if (name != null) {
       return name.matches(match);
       }
      return false;
      }
 }
