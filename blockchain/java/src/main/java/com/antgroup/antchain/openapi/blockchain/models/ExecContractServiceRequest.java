// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecContractServiceRequest extends TeaModel {
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

    // 16进制表示的合约identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    public static ExecContractServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractServiceRequest self = new ExecContractServiceRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractServiceRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ExecContractServiceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ExecContractServiceRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
