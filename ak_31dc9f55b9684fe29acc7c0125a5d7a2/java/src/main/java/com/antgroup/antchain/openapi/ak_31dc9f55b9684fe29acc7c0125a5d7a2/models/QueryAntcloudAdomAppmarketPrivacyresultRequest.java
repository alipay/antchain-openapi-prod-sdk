// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31dc9f55b9684fe29acc7c0125a5d7a2.models;

import com.aliyun.tea.*;

public class QueryAntcloudAdomAppmarketPrivacyresultRequest extends TeaModel {
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

    public static QueryAntcloudAdomAppmarketPrivacyresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudAdomAppmarketPrivacyresultRequest self = new QueryAntcloudAdomAppmarketPrivacyresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudAdomAppmarketPrivacyresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudAdomAppmarketPrivacyresultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryAntcloudAdomAppmarketPrivacyresultRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
