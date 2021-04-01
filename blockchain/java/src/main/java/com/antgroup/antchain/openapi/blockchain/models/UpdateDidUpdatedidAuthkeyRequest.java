// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidUpdatedidAuthkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // did描述符
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 具体操作名
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 更新Auth 操作具体描述
    @NameInMap("payload")
    @Validation(required = true)
    public UpdateDidAuthPayload payload;

    // sig(hash(operation+payload+did))  使用sdk生成方式
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static UpdateDidUpdatedidAuthkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidUpdatedidAuthkeyRequest self = new UpdateDidUpdatedidAuthkeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDidUpdatedidAuthkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDidUpdatedidAuthkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDidUpdatedidAuthkeyRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateDidUpdatedidAuthkeyRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateDidUpdatedidAuthkeyRequest setPayload(UpdateDidAuthPayload payload) {
        this.payload = payload;
        return this;
    }
    public UpdateDidAuthPayload getPayload() {
        return this.payload;
    }

    public UpdateDidUpdatedidAuthkeyRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public UpdateDidUpdatedidAuthkeyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
