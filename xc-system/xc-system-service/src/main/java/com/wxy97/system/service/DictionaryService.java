package com.wxy97.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxy97.system.model.po.Dictionary;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author wxy
 * @since 2023-03-01
 */
public interface DictionaryService extends IService<Dictionary> {


    /**
     * 查询所有数据字典内容
     * @return
     */
    List<Dictionary> queryAll();

    /**
     * 根据code查询数据字典
     * @param code -- String 数据字典Code
     * @return
     */
    Dictionary getByCode(String code);
}
