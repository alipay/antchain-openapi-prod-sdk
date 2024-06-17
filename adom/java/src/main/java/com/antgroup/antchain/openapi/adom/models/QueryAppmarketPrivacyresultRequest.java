// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class QueryAppmarketPrivacyresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 执行记录id
    @NameInMap("record_id")
    @Validation(required = true)
    public String recordId;

    public static QueryAppmarketPrivacyresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppmarketPrivacyresultRequest self = new QueryAppmarketPrivacyresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppmarketPrivacyresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppmarketPrivacyresultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryAppmarketPrivacyresultRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
