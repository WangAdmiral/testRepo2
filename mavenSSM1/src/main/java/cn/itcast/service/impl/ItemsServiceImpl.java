package cn.itcast.service.impl;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("itemsServiceImpl")
//@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    public List<Items> findAll(){
        return itemsDao.findAll();
    }
}
