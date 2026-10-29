// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotAgentDailysummaryRequest extends TeaModel {
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

    public static QueryBlockchainBotAgentDailysummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotAgentDailysummaryRequest self = new QueryBlockchainBotAgentDailysummaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotAgentDailysummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotAgentDailysummaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotAgentDailysummaryRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryBlockchainBotAgentDailysummaryRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public QueryBlockchainBotAgentDailysummaryRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
