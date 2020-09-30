package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Mapper.WarehouseMapper;
import com.example.demo.pojo.Warehouse;
import com.example.demo.service.IWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:10:51
 * @describe 服务实现类
 */
@Service
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse> implements IWarehouseService {
        @Autowired
        private WarehouseMapper warehouseMapper;

        @Override
        public boolean save(Warehouse entity) {
                return warehouseMapper.insert(entity)>0;
        }

        @Override
        public boolean removeById(Serializable id) {
                return warehouseMapper.deleteById(id)>0;
        }

        @Override
        public boolean updateById(Warehouse entity) {
                return warehouseMapper.updateById(entity)>0;
        }
}
