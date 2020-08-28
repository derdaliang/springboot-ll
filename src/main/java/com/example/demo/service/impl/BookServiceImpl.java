package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Mapper.BookMapper;
import com.example.demo.pojo.book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author lixuefeng
 * @date 2020-08-27 15:04
 * @description:书籍服务实现类
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper,book> implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean saveBatch(Collection<book> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<book> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateById(book entity) {
//        bookMapper.updateById(entity);
        return updateById(entity);
    }

    @Override
    public boolean updateBatchById(Collection<book> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(book entity) {
        return false;
    }

    @Override
    public book getById(Serializable id) {
//        return bookMapper.selectById(id);
            return null;
    }

    @Override
    public book getOne(Wrapper<book> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<book> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<book> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public List<book> queryAllBooks() {
        return list(null);
    }


    public IPage<book> selectBookPage(IPage<book> page) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
        return bookMapper.selectPage(page,null);
    }

    @Override
    public Long getIdByName(String name) {
      return bookMapper.findIdByName(name);
    }
}
