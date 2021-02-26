package com.controller;

import com.domain.Orders;
import com.github.pagehelper.PageInfo;
import com.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//控制器
@Controller
@RequestMapping("/orders")
public class OrdersController {
//    引入serviced
    @Autowired
    private IOrdersService ordersService;



    //分页展示
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "size", required = true, defaultValue = "4") int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Orders> ordersList = ordersService.findAllByPage(page, size);
        //PageInfo就是一个分页Bean
        PageInfo pageInfo = new PageInfo(ordersList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }



    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id", required = true) String ordersId) throws Exception {

        Orders orders = ordersService.findById(ordersId);
        ModelAndView mv = new ModelAndView();
        mv.addObject("orders", orders);
        mv.setViewName("orders-show");
        return mv;
    }





}
