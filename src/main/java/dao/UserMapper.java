package dao;

import org.apache.ibatis.annotations.Param;

import domain.User;

public interface UserMapper {

	public User getById(@Param("id") int id);
}
