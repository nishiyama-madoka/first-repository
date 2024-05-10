package com.example.profileapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	/**
     * ユーザー情報 Mapper
     */
    @Autowired
    private ProfileMapper userInfoMapper;

  

    /**
     * ユーザ情報登録
     * @param userAddRequest リクエストデータ
     */
    public void save(UserAddRequest userAddRequest) {
        userInfoMapper.save(userAddRequest);
    }

  
	
}
