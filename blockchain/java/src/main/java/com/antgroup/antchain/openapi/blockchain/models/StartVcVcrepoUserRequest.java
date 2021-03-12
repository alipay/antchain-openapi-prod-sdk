// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartVcVcrepoUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户did标示
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 操作缩写
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 注册用户实际参数
    @NameInMap("payload")
    @Validation(required = true)
    public VcUserRegisterPayload payload;

    // 用户使用私钥对参数进行签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static StartVcVcrepoUserRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVcVcrepoUserRequest self = new StartVcVcrepoUserRequest();
        return TeaModel.build(map, self);
    }

    public StartVcVcrepoUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartVcVcrepoUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartVcVcrepoUserRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartVcVcrepoUserRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public StartVcVcrepoUserRequest setPayload(VcUserRegisterPayload payload) {
        this.payload = payload;
        return this;
    }
    public VcUserRegisterPayload getPayload() {
        return this.payload;
    }

    public StartVcVcrepoUserRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
