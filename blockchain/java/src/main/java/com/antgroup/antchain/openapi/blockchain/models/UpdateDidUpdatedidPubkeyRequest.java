// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidUpdatedidPubkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // did描述符
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 具体操作名
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 需要更新的新的公钥，仅在未完成上链的DID 才能做这个更新
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // sig(hash(operation+payload+did)) 使用sdk生成方式
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    public static UpdateDidUpdatedidPubkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidUpdatedidPubkeyRequest self = new UpdateDidUpdatedidPubkeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDidUpdatedidPubkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDidUpdatedidPubkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDidUpdatedidPubkeyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public UpdateDidUpdatedidPubkeyRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateDidUpdatedidPubkeyRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateDidUpdatedidPubkeyRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public UpdateDidUpdatedidPubkeyRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

}
