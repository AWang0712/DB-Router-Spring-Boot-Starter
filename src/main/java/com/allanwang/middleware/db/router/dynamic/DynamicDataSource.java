package com.allanwang.middleware.db.router.dynamic;

import com.allanwang.middleware.db.router.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @description: Dynamic data source fetching, whenever you switch data sources, you have to fetch from this one
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }

}

