// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryCustomerProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 登录支付宝账号，手机号或者邮箱地址
    @NameInMap("logon_id")
    @Validation(required = true)
    public String logonId;

    // 登录账号类型，PHONE 为手机号，EMAIL 为邮箱地址。
    @NameInMap("logon_id_type")
    @Validation(required = true)
    public String logonIdType;

    public static QueryCustomerProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerProjectRequest self = new QueryCustomerProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomerProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCustomerProjectRequest setLogonId(String logonId) {
        this.logonId = logonId;
        return this;
    }
    public String getLogonId() {
        return this.logonId;
    }

    public QueryCustomerProjectRequest setLogonIdType(String logonIdType) {
        this.logonIdType = logonIdType;
        return this;
    }
    public String getLogonIdType() {
        return this.logonIdType;
    }

}
