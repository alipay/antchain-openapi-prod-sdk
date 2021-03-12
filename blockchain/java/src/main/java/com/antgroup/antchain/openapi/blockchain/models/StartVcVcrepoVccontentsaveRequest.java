// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartVcVcrepoVccontentsaveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 操作缩写
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // vc原文内容
    @NameInMap("payload")
    @Validation(required = true)
    public String payload;

    // 用户使用私钥对参数进行签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static StartVcVcrepoVccontentsaveRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVcVcrepoVccontentsaveRequest self = new StartVcVcrepoVccontentsaveRequest();
        return TeaModel.build(map, self);
    }

    public StartVcVcrepoVccontentsaveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartVcVcrepoVccontentsaveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartVcVcrepoVccontentsaveRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartVcVcrepoVccontentsaveRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public StartVcVcrepoVccontentsaveRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public StartVcVcrepoVccontentsaveRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
