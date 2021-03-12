// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddDidUpdatedidServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    // 添加的did service info
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

    public static AddDidUpdatedidServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDidUpdatedidServiceRequest self = new AddDidUpdatedidServiceRequest();
        return TeaModel.build(map, self);
    }

    public AddDidUpdatedidServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDidUpdatedidServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDidUpdatedidServiceRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public AddDidUpdatedidServiceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public AddDidUpdatedidServiceRequest setPayload(UpdateDidService payload) {
        this.payload = payload;
        return this;
    }
    public UpdateDidService getPayload() {
        return this.payload;
    }

    public AddDidUpdatedidServiceRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public AddDidUpdatedidServiceRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
