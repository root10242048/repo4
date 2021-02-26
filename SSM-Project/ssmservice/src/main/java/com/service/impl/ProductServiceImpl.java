package com.service.impl;

import com.domain.Product;
import com.dao.IProductDao;
import com.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//事务  因为涉及到save方法就必须开始用事务了
@Transactional
public class ProductServiceImpl implements IProductService {

    //自动按照类型注入
    @Autowired
    private IProductDao productDao;

    public List<Product> findAll() throws Exception {
//        List<Product> list = productDao.findAll();

        return productDao.findAll();

    }
    public void save(Product product) throws Exception {
//        List<Product> list = productDao.findAll();

        productDao.save(product);

    }
}
