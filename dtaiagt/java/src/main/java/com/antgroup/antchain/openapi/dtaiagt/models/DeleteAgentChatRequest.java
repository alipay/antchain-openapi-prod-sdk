// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DeleteAgentChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // agent_code
    @NameInMap("agent_code")
    @Validation(required = true)
    public String agentCode;

    // session 主键ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static DeleteAgentChatRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentChatRequest self = new DeleteAgentChatRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAgentChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAgentChatRequest setAgentCode(String agentCode) {
        this.agentCode = agentCode;
        return this;
    }
    public String getAgentCode() {
        return this.agentCode;
    }

    public DeleteAgentChatRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
