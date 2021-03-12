// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecContractDelegateRequest extends TeaModel {
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

    // 交易消息体
    @NameInMap("body")
    @Validation(required = true)
    public String body;

    public static ExecContractDelegateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractDelegateRequest self = new ExecContractDelegateRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractDelegateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractDelegateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractDelegateRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ExecContractDelegateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
