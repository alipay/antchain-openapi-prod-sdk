// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartEvidenceQueryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信物链单条存证查询请求结构体
    @NameInMap("evidence_query_info_req")
    @Validation(required = true)
    public EvidenceQueryInfoReq evidenceQueryInfoReq;

    // 输入交易唯一ID，短时内唯一
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static StartEvidenceQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        StartEvidenceQueryRequest self = new StartEvidenceQueryRequest();
        return TeaModel.build(map, self);
    }

    public StartEvidenceQueryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartEvidenceQueryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartEvidenceQueryRequest setEvidenceQueryInfoReq(EvidenceQueryInfoReq evidenceQueryInfoReq) {
        this.evidenceQueryInfoReq = evidenceQueryInfoReq;
        return this;
    }
    public EvidenceQueryInfoReq getEvidenceQueryInfoReq() {
        return this.evidenceQueryInfoReq;
    }

    public StartEvidenceQueryRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
