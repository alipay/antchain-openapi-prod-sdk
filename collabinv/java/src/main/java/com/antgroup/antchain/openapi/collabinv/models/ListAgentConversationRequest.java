// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ListAgentConversationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // agent id
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // page_info
    @NameInMap("page_info")
    @Validation(required = true)
    public PageInfo pageInfo;

    public static ListAgentConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentConversationRequest self = new ListAgentConversationRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentConversationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAgentConversationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAgentConversationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListAgentConversationRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListAgentConversationRequest setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
