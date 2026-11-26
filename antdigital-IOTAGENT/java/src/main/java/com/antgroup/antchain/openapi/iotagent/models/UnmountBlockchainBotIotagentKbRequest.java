// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UnmountBlockchainBotIotagentKbRequest extends TeaModel {
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

    public static UnmountBlockchainBotIotagentKbRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountBlockchainBotIotagentKbRequest self = new UnmountBlockchainBotIotagentKbRequest();
        return TeaModel.build(map, self);
    }

    public UnmountBlockchainBotIotagentKbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnmountBlockchainBotIotagentKbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnmountBlockchainBotIotagentKbRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UnmountBlockchainBotIotagentKbRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

}
