// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidAddvcExecuteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起该交易的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 操作名
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 创建VC具体参数
    @NameInMap("payload")
    @Validation(required = true)
    public AddVC payload;

    // 使用私钥对消息中其他字段进行签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidAddvcExecuteRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidAddvcExecuteRequest self = new StartDidAddvcExecuteRequest();
        return TeaModel.build(map, self);
    }

    public StartDidAddvcExecuteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidAddvcExecuteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidAddvcExecuteRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidAddvcExecuteRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public StartDidAddvcExecuteRequest setPayload(AddVC payload) {
        this.payload = payload;
        return this;
    }
    public AddVC getPayload() {
        return this.payload;
    }

    public StartDidAddvcExecuteRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public StartDidAddvcExecuteRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
