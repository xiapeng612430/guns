package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.UserApi;
import com.stylefeng.guns.api.user.UserInfoModel;
import com.stylefeng.guns.api.user.UserModel;
import org.springframework.stereotype.Component;

/**
 * Created by xianpeng.xia
 * on 2019-09-06 01:15
 */
@Component
@Service(interfaceClass = UserApi.class)
public class UserImpl implements UserApi {

    @Override
    public int login(String username, String password) {
        return 0;
    }

    @Override
    public boolean register(UserModel userModel) {
        return false;
    }

    @Override
    public boolean checkUsername(String username) {
        return false;
    }

    @Override
    public UserInfoModel getUserInfo(int uuid) {
        return null;
    }

    @Override
    public UserInfoModel updateUserInfoModel(UserInfoModel userInfoModel) {
        return null;
    }
}
