// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartEvidenceStoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信物链存证结构体参数
    @NameInMap("evidence_storage_req")
    @Validation(required = true)
    public EvidenceStorageReq evidenceStorageReq;

    // 输入唯一交易ID序号，客户端管理短时内唯一
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static StartEvidenceStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        StartEvidenceStoreRequest self = new StartEvidenceStoreRequest();
        return TeaModel.build(map, self);
    }

    public StartEvidenceStoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartEvidenceStoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartEvidenceStoreRequest setEvidenceStorageReq(EvidenceStorageReq evidenceStorageReq) {
        this.evidenceStorageReq = evidenceStorageReq;
        return this;
    }
    public EvidenceStorageReq getEvidenceStorageReq() {
        return this.evidenceStorageReq;
    }

    public StartEvidenceStoreRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
