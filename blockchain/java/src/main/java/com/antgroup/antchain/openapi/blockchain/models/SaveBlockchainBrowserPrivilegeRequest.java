// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveBlockchainBrowserPrivilegeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    public static SaveBlockchainBrowserPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBlockchainBrowserPrivilegeRequest self = new SaveBlockchainBrowserPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public SaveBlockchainBrowserPrivilegeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBlockchainBrowserPrivilegeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBlockchainBrowserPrivilegeRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public SaveBlockchainBrowserPrivilegeRequest setTenantid(String tenantid) {
        this.tenantid = tenantid;
        return this;
    }
    public String getTenantid() {
        return this.tenantid;
    }

}
