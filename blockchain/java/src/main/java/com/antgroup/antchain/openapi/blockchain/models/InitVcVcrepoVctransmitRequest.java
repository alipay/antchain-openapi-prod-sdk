// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitVcVcrepoVctransmitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vc传输发起人did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // vc_transmit_init
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 使用对应的did私钥进行签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 可验证声明id
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 传递目标
    @NameInMap("verifiers")
    @Validation(required = true)
    public java.util.List<VcTransmitTargetStruct> verifiers;

    public static InitVcVcrepoVctransmitRequest build(java.util.Map<String, ?> map) throws Exception {
        InitVcVcrepoVctransmitRequest self = new InitVcVcrepoVctransmitRequest();
        return TeaModel.build(map, self);
    }

    public InitVcVcrepoVctransmitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitVcVcrepoVctransmitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitVcVcrepoVctransmitRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public InitVcVcrepoVctransmitRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public InitVcVcrepoVctransmitRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public InitVcVcrepoVctransmitRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public InitVcVcrepoVctransmitRequest setVerifiers(java.util.List<VcTransmitTargetStruct> verifiers) {
        this.verifiers = verifiers;
        return this;
    }
    public java.util.List<VcTransmitTargetStruct> getVerifiers() {
        return this.verifiers;
    }

}
