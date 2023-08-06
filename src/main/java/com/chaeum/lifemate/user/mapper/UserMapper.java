package com.chaeum.lifemate.user.mapper;

import com.chaeum.lifemate.user.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {
    //List<User> getUserList(); // User 테이블 가져오기
    //void insertUser(UserVo userVo); // 회원 가입
    //UserVo getUserByEmail(String email); // 회원 정보 가져오기
    //UserVo getUserById(Long id);
    //void updateUser(UserVo userVo); // 회원 정보 수정
    //void deleteUser(Long id); // 회원 탈퇴
    ArrayList<HashMap<String, Object>> findAll();
    void insertUser(HashMap<String, Object> param);
}