// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateLogisticFinanceAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 指定的分布式数字身份，缺省时为自己的分布式数字身份
    @NameInMap("did")
    public String did;

    // 业务方用户列表，一次最多不超过200
    @NameInMap("users")
    @Validation(required = true)
    public java.util.List<LogisticFinUser> users;

    public static BatchcreateLogisticFinanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateLogisticFinanceAccountRequest self = new BatchcreateLogisticFinanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateLogisticFinanceAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateLogisticFinanceAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateLogisticFinanceAccountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public BatchcreateLogisticFinanceAccountRequest setUsers(java.util.List<LogisticFinUser> users) {
        this.users = users;
        return this;
    }
    public java.util.List<LogisticFinUser> getUsers() {
        return this.users;
    }

}
