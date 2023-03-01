package com.wxy97.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxy97.system.mapper.DictionaryMapper;
import com.wxy97.system.model.po.Dictionary;
import com.wxy97.system.service.DictionaryService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* <p>
 * 数据字典 服务实现类
 * </p>
*
* @author wxy
* @since 2023-03-01
*/
@Service
@Slf4j
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, Dictionary> implements
    DictionaryService {

    @Override
    public List<Dictionary> queryAll() {
        List<Dictionary> list = this.list();
        return list;
    }

    @Override
    public Dictionary getByCode(String code) {
        LambdaQueryWrapper<Dictionary> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Dictionary::getCode, code);
        Dictionary dictionary = this.getOne(queryWrapper);
        return dictionary;
    }
}
