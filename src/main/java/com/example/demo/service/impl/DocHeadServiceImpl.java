package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Mapper.DocHeadMapper;
import com.example.demo.pojo.DocHead;
import com.example.demo.pojo.User;
import com.example.demo.service.IDocHeadService;
import com.example.demo.service.IWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:14:13
 * @describe 服务实现类
 */
@Service
public class DocHeadServiceImpl extends ServiceImpl<DocHeadMapper, DocHead> implements IDocHeadService {
        @Autowired
        private IWarehouseService warehouseService;
        @Autowired
        private DocHeadMapper docHeadMapper;
        @Override
        public boolean save(DocHead entity, User user) {

                return false;
        }
}
