// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddDidUpdatedidServicelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 待处理did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 具体操作名
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 更新ServiceList
    @NameInMap("payload")
    @Validation(required = true)
    public UpdateDidServiceList payload;

    // sig(hash(operation+payload+did)) 使用sdk生成方式
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    public static AddDidUpdatedidServicelistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDidUpdatedidServicelistRequest self = new AddDidUpdatedidServicelistRequest();
        return TeaModel.build(map, self);
    }

    public AddDidUpdatedidServicelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDidUpdatedidServicelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDidUpdatedidServicelistRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public AddDidUpdatedidServicelistRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public AddDidUpdatedidServicelistRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public AddDidUpdatedidServicelistRequest setPayload(UpdateDidServiceList payload) {
        this.payload = payload;
        return this;
    }
    public UpdateDidServiceList getPayload() {
        return this.payload;
    }

    public AddDidUpdatedidServicelistRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

}
