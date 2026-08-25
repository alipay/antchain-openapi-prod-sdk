// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ListbysubjectAntchainDasKyaVcdigestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主体did
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 接收者did对应的keyId
    @NameInMap("subject_key_id")
    @Validation(required = true)
    public String subjectKeyId;

    // 时间戳
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 时间戳签名
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    public static ListbysubjectAntchainDasKyaVcdigestRequest build(java.util.Map<String, ?> map) throws Exception {
        ListbysubjectAntchainDasKyaVcdigestRequest self = new ListbysubjectAntchainDasKyaVcdigestRequest();
        return TeaModel.build(map, self);
    }

    public ListbysubjectAntchainDasKyaVcdigestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListbysubjectAntchainDasKyaVcdigestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListbysubjectAntchainDasKyaVcdigestRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public ListbysubjectAntchainDasKyaVcdigestRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListbysubjectAntchainDasKyaVcdigestRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListbysubjectAntchainDasKyaVcdigestRequest setSubjectKeyId(String subjectKeyId) {
        this.subjectKeyId = subjectKeyId;
        return this;
    }
    public String getSubjectKeyId() {
        return this.subjectKeyId;
    }

    public ListbysubjectAntchainDasKyaVcdigestRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public ListbysubjectAntchainDasKyaVcdigestRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
