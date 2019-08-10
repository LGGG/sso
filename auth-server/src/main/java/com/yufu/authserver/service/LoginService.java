package com.yufu.authserver.service;

import com.yufu.authserver.entity.User;

public interface LoginService {
    boolean login(User user);
}
