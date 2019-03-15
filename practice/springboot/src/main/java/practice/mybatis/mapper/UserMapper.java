package practice.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import practice.mybatis.bean.User;

/**
 * 
 * @author wcs
 *
 */
@Mapper
public interface UserMapper {
	@Results({
		@Result(property = "id",column = "id",javaType=java.lang.Integer.class),
        @Result(property = "name",column = "name",javaType=java.lang.String.class),
        @Result(property = "age",column = "age",javaType=java.lang.Integer.class)
	})
    @Select("select id,name,age from user where name = #{name}")
    List<User> findUserByName(@Param("name")String name);
}