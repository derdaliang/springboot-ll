package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Mapper.DocLineMapper;
import com.example.demo.pojo.DocLine;
import com.example.demo.pojo.MaLocation;
import com.example.demo.service.IDocLineService;
import com.example.demo.service.IMaLocationService;
import com.example.demo.service.IWarehouseService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:14:13
 * @describe 服务实现类
 */
@Service
public class DocLineServiceImpl extends ServiceImpl<DocLineMapper, DocLine> implements IDocLineService {
        @Autowired
        private IWarehouseService warehouseService;
        @Autowired
        private IMaLocationService maLocationService;
        @Autowired
        private UserService userService;
        @Override
        public String saveOne(DocLine entity) {
                boolean flag=true;
                String msg="";
                if(flag||entity.getMaNo()==null||warehouseService.getById(entity.getMaNo())==null){
                        flag=false;
                        msg="不可输入为空或是仓库不存在";
                }else{
                        List<MaLocation> maLocationList=maLocationService.selectByMano(entity.getMaNo());
                        if(maLocationList.size()<=0){
                                flag=false;
                                msg="该仓库未维护库位";
                        }else{
                                if(flag||entity.getMtArea()==null||maLocationService.getById(entity.getMtArea())==null){
                                        flag=false;
                                        msg="不可输入为空或是k位不存在";
                                }else if(maLocationList.contains(maLocationService.getById(entity.getMtArea()))){
                                        flag=false;
                                        msg="该仓库下没有这个库位";
                                }

                        }
                }

                if(flag)
                        return msg;
                else
                        return "success insert";
        }
}
