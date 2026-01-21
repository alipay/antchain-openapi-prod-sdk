// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartAgentThingmodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求内容，内容为 AgentThingModelReq 对象的json字符串
    @NameInMap("agent_thing_model_request")
    @Validation(required = true)
    public String agentThingModelRequest;

    public static StartAgentThingmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAgentThingmodelRequest self = new StartAgentThingmodelRequest();
        return TeaModel.build(map, self);
    }

    public StartAgentThingmodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAgentThingmodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAgentThingmodelRequest setAgentThingModelRequest(String agentThingModelRequest) {
        this.agentThingModelRequest = agentThingModelRequest;
        return this;
    }
    public String getAgentThingModelRequest() {
        return this.agentThingModelRequest;
    }

}
