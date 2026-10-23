// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentCreativeImageeditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 子图编辑接口返回的独立消息 ID，必须属于当前调用用户及租户。
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    public static QueryAntcloudMarketingagentCreativeImageeditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentCreativeImageeditRequest self = new QueryAntcloudMarketingagentCreativeImageeditRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentCreativeImageeditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingagentCreativeImageeditRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
