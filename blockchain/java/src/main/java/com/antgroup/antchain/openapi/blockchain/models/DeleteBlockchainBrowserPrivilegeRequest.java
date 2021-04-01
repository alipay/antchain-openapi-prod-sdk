// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteBlockchainBrowserPrivilegeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // ORGJC1CN
    @NameInMap("tenantid")
    @Validation(required = true)
    public String tenantid;

    public static DeleteBlockchainBrowserPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlockchainBrowserPrivilegeRequest self = new DeleteBlockchainBrowserPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlockchainBrowserPrivilegeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteBlockchainBrowserPrivilegeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteBlockchainBrowserPrivilegeRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DeleteBlockchainBrowserPrivilegeRequest setTenantid(String tenantid) {
        this.tenantid = tenantid;
        return this;
    }
    public String getTenantid() {
        return this.tenantid;
    }

}
