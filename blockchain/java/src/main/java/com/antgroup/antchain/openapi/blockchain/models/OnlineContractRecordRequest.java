// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OnlineContractRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链唯一标识
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 16进制表示的合约identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    public static OnlineContractRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineContractRecordRequest self = new OnlineContractRecordRequest();
        return TeaModel.build(map, self);
    }

    public OnlineContractRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OnlineContractRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OnlineContractRecordRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public OnlineContractRecordRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
