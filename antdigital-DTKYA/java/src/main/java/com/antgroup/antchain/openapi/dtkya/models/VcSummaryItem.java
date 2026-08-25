// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VcSummaryItem extends TeaModel {
    // vcId
    /**
     * <strong>example:</strong>
     * <p>vcId</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // vc被签发者did
    /**
     * <strong>example:</strong>
     * <p>did:xxxx:xxxxx</p>
     */
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 签发者did
    /**
     * <strong>example:</strong>
     * <p>did:xxxx:xxxxx</p>
     */
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // vc状态
    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static VcSummaryItem build(java.util.Map<String, ?> map) throws Exception {
        VcSummaryItem self = new VcSummaryItem();
        return TeaModel.build(map, self);
    }

    public VcSummaryItem setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public VcSummaryItem setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public VcSummaryItem setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public VcSummaryItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
