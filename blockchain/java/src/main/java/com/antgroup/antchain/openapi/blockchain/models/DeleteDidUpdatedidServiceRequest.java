// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteDidUpdatedidServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待处理did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 具体操作名
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 删除did service操作信息
    @NameInMap("payload")
    @Validation(required = true)
    public DidDeleteService payload;

    // sig(hash(operation+payload+did)) 使用sdk生成方式签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static DeleteDidUpdatedidServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDidUpdatedidServiceRequest self = new DeleteDidUpdatedidServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDidUpdatedidServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDidUpdatedidServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDidUpdatedidServiceRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public DeleteDidUpdatedidServiceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public DeleteDidUpdatedidServiceRequest setPayload(DidDeleteService payload) {
        this.payload = payload;
        return this;
    }
    public DidDeleteService getPayload() {
        return this.payload;
    }

    public DeleteDidUpdatedidServiceRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public DeleteDidUpdatedidServiceRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
