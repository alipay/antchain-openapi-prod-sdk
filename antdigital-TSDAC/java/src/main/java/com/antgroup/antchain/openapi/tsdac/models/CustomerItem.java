// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CustomerItem extends TeaModel {
    // 客户ID
    /**
     * <strong>example:</strong>
     * <p>800123238998</p>
     */
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 客户名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 客户角色
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("roles")
    @Validation(required = true)
    public java.util.List<RoleItem> roles;

    public static CustomerItem build(java.util.Map<String, ?> map) throws Exception {
        CustomerItem self = new CustomerItem();
        return TeaModel.build(map, self);
    }

    public CustomerItem setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CustomerItem setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public CustomerItem setRoles(java.util.List<RoleItem> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<RoleItem> getRoles() {
        return this.roles;
    }

}
