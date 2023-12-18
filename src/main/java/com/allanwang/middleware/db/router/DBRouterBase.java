package com.allanwang.middleware.db.router;


/**
 * @description: datasource router base
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}

