// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotagentSessionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 客户端ID，可选；显式传时服务端按绑定记录恢复实际clientType，不传默认DEFAULT_IOA_API
    @NameInMap("client_id")
    public String clientId;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 客户端类型，可选；支持 DEFAULT_IOA_API（默认）、MOBILE_IOA_API（移动端 H5/App）、WEB_IOA_API（PC 网页端），不传默认走 DEFAULT_IOA_API
    @NameInMap("client_type")
    public String clientType;

    public static CreateIotagentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIotagentSessionRequest self = new CreateIotagentSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateIotagentSessionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIotagentSessionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIotagentSessionRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateIotagentSessionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateIotagentSessionRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CreateIotagentSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIotagentSessionRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

}
