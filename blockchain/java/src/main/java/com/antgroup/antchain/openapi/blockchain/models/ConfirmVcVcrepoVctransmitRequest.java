// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ConfirmVcVcrepoVctransmitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求发起者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // vc_transmit_cnf
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // VC传输确认请求参数
    @NameInMap("payload")
    @Validation(required = true)
    public java.util.List<VcTransmitCnf> payload;

    // 签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static ConfirmVcVcrepoVctransmitRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmVcVcrepoVctransmitRequest self = new ConfirmVcVcrepoVctransmitRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmVcVcrepoVctransmitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmVcVcrepoVctransmitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmVcVcrepoVctransmitRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public ConfirmVcVcrepoVctransmitRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ConfirmVcVcrepoVctransmitRequest setPayload(java.util.List<VcTransmitCnf> payload) {
        this.payload = payload;
        return this;
    }
    public java.util.List<VcTransmitCnf> getPayload() {
        return this.payload;
    }

    public ConfirmVcVcrepoVctransmitRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public ConfirmVcVcrepoVctransmitRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
