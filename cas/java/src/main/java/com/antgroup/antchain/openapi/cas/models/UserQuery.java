// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UserQuery extends TeaModel {
    // 基础查询
    @NameInMap("base_query")
    public PaginationQuery baseQuery;

    // id
    @NameInMap("id")
    public String id;

    // customerId
    @NameInMap("customer_id")
    public String customerId;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // type
    @NameInMap("type")
    public String type;

    // types
    @NameInMap("types")
    public java.util.List<String> types;

    // email
    @NameInMap("email")
    public String email;

    // mobile
    @NameInMap("mobile")
    public String mobile;

    // realName
    @NameInMap("real_name")
    public String realName;

    // loginName
    @NameInMap("login_name")
    public String loginName;

    public static UserQuery build(java.util.Map<String, ?> map) throws Exception {
        UserQuery self = new UserQuery();
        return TeaModel.build(map, self);
    }

    public UserQuery setBaseQuery(PaginationQuery baseQuery) {
        this.baseQuery = baseQuery;
        return this;
    }
    public PaginationQuery getBaseQuery() {
        return this.baseQuery;
    }

    public UserQuery setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UserQuery setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public UserQuery setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UserQuery setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UserQuery setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public UserQuery setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UserQuery setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UserQuery setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public UserQuery setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
