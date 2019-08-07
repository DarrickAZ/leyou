package com.leyou.item.service;

import com.leyou.item.mapper.SpecificationMapper;
import com.leyou.item.pojo.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Darrick
 * @Date: 2019/7/31 12:10
 * @Description:
 */
@Service
public class SpecificationService {

    @Autowired
    private SpecificationMapper specificationMapper;

    /**
     * 根据主键查询规格信息
     * @param id
     * @return
     */
    public Specification queryById(Long id){
        return this.specificationMapper.selectByPrimaryKey(id);
    }


}
