package com.allanwang.middleware.db.router.strategy;


/**
 * @description: db router strategy
 */
public interface IDBRouterStrategy {

    void doRouter(String dbKeyAttr);

    void clear();

}
