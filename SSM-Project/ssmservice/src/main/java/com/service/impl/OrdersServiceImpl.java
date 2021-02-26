package com.service.impl;

import com.dao.IOrdersDao;
import com.domain.Orders;
import com.github.pagehelper.PageHelper;
import com.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//事务
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    //自动按照类型注入
    @Autowired
    private IOrdersDao ordersDao;

    public List<Orders> findAll() throws Exception {

        return ordersDao.findAll();

    }

    public List<Orders> findAllByPage(int page, int size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception{

        return ordersDao.findById(ordersId);
    }

}
