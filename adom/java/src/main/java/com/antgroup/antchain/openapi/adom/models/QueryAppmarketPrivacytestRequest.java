// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class QueryAppmarketPrivacytestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 记录id
    @NameInMap("record_id")
    @Validation(required = true)
    public String recordId;

    // 实例id
    @NameInMap("inst_id")
    @Validation(required = true)
    public String instId;

    public static QueryAppmarketPrivacytestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppmarketPrivacytestRequest self = new QueryAppmarketPrivacytestRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppmarketPrivacytestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppmarketPrivacytestRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public QueryAppmarketPrivacytestRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

}
