package com.example.demo.dao;

import com.example.demo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by longmu on 13/01/2018.
 */

@Mapper
public interface CityDao {

    /***
     * 通过注解方式链接数据库，好处是简单，不用配置文件。但是不好的地方是如果涉及到多表join的时候，代码会叫繁琐，没有sql语句直接。
     * @param cityName
     * @return
     */
    @Select("SELECT * FROM city")
    @Results({
        @Result(property = "id",column = "id"),
        @Result(property = "provinceId",column = "province_id"),
        @Result(property = "cityName",column = "city_name"),
        @Result(property = "description",column = "description")
    })
    City findByName(@Param("cityName") String cityName);
}
