// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class CancelPartnerSettleinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户来源-用于租户隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 入驻申请id
    @NameInMap("apply_id")
    @Validation(required = true)
    public Long applyId;

    public static CancelPartnerSettleinRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPartnerSettleinRequest self = new CancelPartnerSettleinRequest();
        return TeaModel.build(map, self);
    }

    public CancelPartnerSettleinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelPartnerSettleinRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CancelPartnerSettleinRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

}
