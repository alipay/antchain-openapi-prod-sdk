// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAgentDailysummaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备客户端ID；与 agent_id 至少传一个
    @NameInMap("client_id")
    public String clientId;

    // 智能体ID；与 client_id 至少传一个，两者同时传入时必须与设备绑定的智能体一致
    @NameInMap("agent_id")
    public String agentId;

    // 总结日期，格式 yyyy-MM-dd，按 GMT+8 自然日
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    public static QueryAgentDailysummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentDailysummaryRequest self = new QueryAgentDailysummaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgentDailysummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgentDailysummaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAgentDailysummaryRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryAgentDailysummaryRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public QueryAgentDailysummaryRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
