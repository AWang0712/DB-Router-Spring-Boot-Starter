package com.allanwang.middleware.db.router.strategy;


/**
 * @description: db router strategy
 */
public interface IDBRouterStrategy {

    /**
     * router calculate
     *
     * @param dbKeyAttr
     */

    void doRouter(String dbKeyAttr);

    /**
     * set manual router for db
     *
     * @param dbIdx
     */
    void setDBKey(int dbIdx);

    /**
     * set manual router for table
     *
     * @param tbIdx
     */
    void setTBKey(int tbIdx);

    /**
     * get db count
     *
     * @return
     */
    int dbCount();

    /**
     * get table count
     *
     * @return 数量
     */
    int tbCount();

    /**
     * clear router
     */

    void clear();

}
