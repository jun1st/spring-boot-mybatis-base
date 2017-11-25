package me.fengqijun.mapper;

import me.fengqijun.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fengqijun on 25/11/2017.
 */
@Mapper
@Repository
public interface CustomerMapper {

    @Select("SELECT * from customer")
    List<Customer> all();
}
