package com.wxy97.system.controller;

import com.wxy97.system.service.DictionaryService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.wxy97.system.model.po.Dictionary;


/**
* <p>
* 数据字典 前端控制器
* </p>
*
* @author wxy
* @since 2023-03-01
*/
@Slf4j
@RestController
public class DictionaryController {
    private final DictionaryService  dictionaryService;

    public DictionaryController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("/dictionary/all")
    public List<Dictionary> queryAll() {
        return dictionaryService.queryAll();
    }

    @GetMapping("/dictionary/code/{code}")
    public Dictionary getByCode(@PathVariable String code) {
        return dictionaryService.getByCode(code);
    }
}
