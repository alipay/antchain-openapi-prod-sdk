// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UnmountIotagentKbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目标 Agent ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 知识库 ID
    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    public static UnmountIotagentKbRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountIotagentKbRequest self = new UnmountIotagentKbRequest();
        return TeaModel.build(map, self);
    }

    public UnmountIotagentKbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnmountIotagentKbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnmountIotagentKbRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UnmountIotagentKbRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

}
