// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBlockchainBrowserPrivilegeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 租户id
    @NameInMap("tenantid")
    @Validation(required = true)
    public String tenantid;

    public static QueryBlockchainBrowserPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBrowserPrivilegeRequest self = new QueryBlockchainBrowserPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBrowserPrivilegeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBrowserPrivilegeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBrowserPrivilegeRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryBlockchainBrowserPrivilegeRequest setTenantid(String tenantid) {
        this.tenantid = tenantid;
        return this;
    }
    public String getTenantid() {
        return this.tenantid;
    }

}
