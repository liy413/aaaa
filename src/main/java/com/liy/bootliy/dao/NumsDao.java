package com.liy.bootliy.dao;

import com.liy.bootliy.entity.Nums;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： liy
 * @date： 2022/11/24 0024
 */
@Mapper
public interface NumsDao {

    @Select("select * from nums")
    List<Nums> getNums();


    Nums getById(int idd);
}
