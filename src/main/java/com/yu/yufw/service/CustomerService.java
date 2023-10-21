package com.yu.yufw.service;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.yu.yufw.domain.Customer;
import com.yu.yufw.helper.DatabaseHelper;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 * @author wukong
 * @since 2017-06-29.
 */
public class CustomerService {
    private static Logger logger = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id = " + id;
        return DatabaseHelper.queryEntity(Customer.class, sql);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
