package com.example.profileapp;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;  // Spring SecurityのUserクラスをインポート

public class CustomUserDetails extends User {

	public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);  // 親クラスのコンストラクタを呼び出してインスタンスを初期化
    }
	
}
