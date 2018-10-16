package cn.itcast.dao;

import cn.itcast.domain.Items;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemsDao {
    @Select("select * from items")
    List<Items> findAll();
}
