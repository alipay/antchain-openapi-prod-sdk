// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddVC extends TeaModel {
    // vc原文hash
    /**
     * <strong>example:</strong>
     * <p>1232</p>
     */
    @NameInMap("content_hash")
    @Validation(required = true)
    public String contentHash;

    // issuer后缀的hash值
    /**
     * <strong>example:</strong>
     * <p>12345667</p>
     */
    @NameInMap("issuer_hash")
    @Validation(required = true)
    public String issuerHash;

    // valid or invalid
    /**
     * <strong>example:</strong>
     * <p>valid</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 接收者后缀hash值
    /**
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("subject_hash")
    @Validation(required = true)
    public String subjectHash;

    // 可验证声明id
    /**
     * <strong>example:</strong>
     * <p>vc:mychain:xxxxxx</p>
     */
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
