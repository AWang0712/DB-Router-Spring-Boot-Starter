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
     * set db key
     *
     * @param dbIdx route db index, need in config range
     */
    void setDBKey(int dbIdx);

    /**
     * set tb key
     *
     * @param tbIdx route tb index, need in config range
     */
    void setTBKey(int tbIdx);

    /**
     * get db count
     *
     * @return count
     */
    int dbCount();

    /**
     * get tb count
     *
     * @return count
     */
    int tbCount();

    /**
     * clear router
     */
    void clear();

}
