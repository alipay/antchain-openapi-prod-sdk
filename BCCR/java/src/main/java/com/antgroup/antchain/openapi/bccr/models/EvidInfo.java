// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class EvidInfo extends TeaModel {
    // 取证ID
    /**
     * <strong>example:</strong>
     * <p>RS123</p>
     */
    @NameInMap("evidence_id")
    @Validation(required = true)
    public String evidenceId;

    // 取证人
    @NameInMap("witness")
    @Validation(required = true)
    public NotaryUser witness;

    public static EvidInfo build(java.util.Map<String, ?> map) throws Exception {
        EvidInfo self = new EvidInfo();
        return TeaModel.build(map, self);
    }

    public EvidInfo setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

    public EvidInfo setWitness(NotaryUser witness) {
        this.witness = witness;
        return this;
    }
    public NotaryUser getWitness() {
        return this.witness;
    }

}
