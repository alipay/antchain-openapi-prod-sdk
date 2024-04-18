// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GetEvidenceInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 取证编号
    @NameInMap("evidence_id")
    @Validation(required = true)
    public String evidenceId;

    public static GetEvidenceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEvidenceInfoRequest self = new GetEvidenceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetEvidenceInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetEvidenceInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetEvidenceInfoRequest setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

}
