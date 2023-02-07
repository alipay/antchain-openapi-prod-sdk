// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateQuotaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 从Query接口找到此ID
    @NameInMap("quota_id")
    @Validation(required = true)
    public String quotaId;

    // 额度，不更新请保持原值，不要留空
    @NameInMap("hard_limit")
    @Validation(required = true)
    public Long hardLimit;

    public static UpdateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaRequest self = new UpdateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateQuotaRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public UpdateQuotaRequest setHardLimit(Long hardLimit) {
        this.hardLimit = hardLimit;
        return this;
    }
    public Long getHardLimit() {
        return this.hardLimit;
    }

}
