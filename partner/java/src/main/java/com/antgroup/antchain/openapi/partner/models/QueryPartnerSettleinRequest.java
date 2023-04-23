// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryPartnerSettleinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户来源-用于租户隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 入驻申请时，返回的申请id
    @NameInMap("apply_id")
    @Validation(required = true)
    public Long applyId;

    public static QueryPartnerSettleinRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnerSettleinRequest self = new QueryPartnerSettleinRequest();
        return TeaModel.build(map, self);
    }

    public QueryPartnerSettleinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPartnerSettleinRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryPartnerSettleinRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

}
