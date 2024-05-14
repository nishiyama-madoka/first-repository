package com.example.profileapp;


import org.apache.ibatis.annotations.Mapper;

import com.example.profileapp.UserAddRequest;
import com.example.profileapp.Person;

@Mapper
public interface ProfileMapper {

	/**
     * ユーザー情報登録
     * @param userRequest 登録用リクエストデータ
     */
    void save(UserAddRequest userRequest);

//ログイン
    public UserAccount getAccount(String email);
	
}
