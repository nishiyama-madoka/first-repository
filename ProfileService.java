package com.example.profileapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	/**
     * ユーザー情報 Mapper
     */
    @Autowired
    private ProfileMapper userInfoMapper;

  @Autowired
    private PasswordEncoder passwordEncoder;


    /**
     * ユーザ情報登録
     * @param userAddRequest リクエストデータ
     */
    public void save(UserAddRequest userAddRequest) {
	    String encodedPassword = passwordEncoder.encode(userAddRequest.getPassword());
        userAddRequest.setPassword(encodedPassword);
        userInfoMapper.save(userAddRequest);
    }

  
	
}
