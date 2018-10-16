package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(path = "/items")
public class ItemsController {
    @Autowired
    @Qualifier("itemsServiceImpl")
    private ItemsService itemsService;

    @RequestMapping(path = "/findAll")
    public String findAll(Model model){
        for (Items items : itemsService.findAll()) {
            System.out.println(items);
        }
        System.out.println("git测试");
        System.out.println("git测试2");
        return "success";
    }
}
