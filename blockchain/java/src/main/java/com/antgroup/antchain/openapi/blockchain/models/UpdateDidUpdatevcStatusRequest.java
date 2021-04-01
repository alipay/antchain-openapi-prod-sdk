// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidUpdatevcStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // did描述符
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 可验证声明更新
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 更新可验证声明状态
    @NameInMap("payload")
    @Validation(required = true)
    public UpdateVCStatus payload;

    // sig(hash(operation+payload+did)) 使用sdk生成方式
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static UpdateDidUpdatevcStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidUpdatevcStatusRequest self = new UpdateDidUpdatevcStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDidUpdatevcStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDidUpdatevcStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDidUpdatevcStatusRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateDidUpdatevcStatusRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateDidUpdatevcStatusRequest setPayload(UpdateVCStatus payload) {
        this.payload = payload;
        return this;
    }
    public UpdateVCStatus getPayload() {
        return this.payload;
    }

    public UpdateDidUpdatevcStatusRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public UpdateDidUpdatevcStatusRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
