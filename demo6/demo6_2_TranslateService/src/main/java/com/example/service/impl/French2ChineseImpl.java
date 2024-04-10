package com.example.service.impl;
import com.example.service.TranslateService;
import org.springframework.stereotype.Service;
@Service
 public class French2ChineseImpl implements TranslateService {
       @Override
 public String translate(String word) {
       if ("bonjour".equalsIgnoreCase(word)) {
           return "bonjour -> 你好 ";
           }
       return " 我还没有学会这个单词，你可以教我吗？ ";
       }
 }