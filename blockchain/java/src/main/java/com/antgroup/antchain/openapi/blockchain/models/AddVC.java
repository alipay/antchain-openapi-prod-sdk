// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddVC extends TeaModel {
    // vc原文hash
    @NameInMap("content_hash")
    @Validation(required = true)
    public String contentHash;

    // issuer后缀的hash值
    @NameInMap("issuer_hash")
    @Validation(required = true)
    public String issuerHash;

    // valid or invalid
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 接收者后缀hash值
    @NameInMap("subject_hash")
    @Validation(required = true)
    public String subjectHash;

    // 可验证声明id
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    public static AddVC build(java.util.Map<String, ?> map) throws Exception {
        AddVC self = new AddVC();
        return TeaModel.build(map, self);
    }

    public AddVC setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public AddVC setIssuerHash(String issuerHash) {
        this.issuerHash = issuerHash;
        return this;
    }
    public String getIssuerHash() {
        return this.issuerHash;
    }

    public AddVC setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddVC setSubjectHash(String subjectHash) {
        this.subjectHash = subjectHash;
        return this;
    }
    public String getSubjectHash() {
        return this.subjectHash;
    }

    public AddVC setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
