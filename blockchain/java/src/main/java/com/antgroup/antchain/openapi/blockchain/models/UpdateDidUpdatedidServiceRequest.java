// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidUpdatedidServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // did描述符
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 更新did service endpoint
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // update did service的payload
    @NameInMap("payload")
    @Validation(required = true)
    public UpdateDidService payload;

    // sig(hash(operation+payload+did)) 使用sdk生成方式
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static UpdateDidUpdatedidServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidUpdatedidServiceRequest self = new UpdateDidUpdatedidServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDidUpdatedidServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDidUpdatedidServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDidUpdatedidServiceRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateDidUpdatedidServiceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateDidUpdatedidServiceRequest setPayload(UpdateDidService payload) {
        this.payload = payload;
        return this;
    }
    public UpdateDidService getPayload() {
        return this.payload;
    }

    public UpdateDidUpdatedidServiceRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public UpdateDidUpdatedidServiceRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
