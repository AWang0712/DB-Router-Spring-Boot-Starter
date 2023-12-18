package com.allanwang.middleware.test;

import com.allanwang.middleware.db.router.annotation.DBRouter;


public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);

}

