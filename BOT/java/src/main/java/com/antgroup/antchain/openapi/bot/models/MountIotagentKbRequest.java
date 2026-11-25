// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class MountIotagentKbRequest extends TeaModel {
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

    // 产品实例 ID（共享租户/实例范围接入时传入校验可见性）
    @NameInMap("instance_id")
    public String instanceId;

    public static MountIotagentKbRequest build(java.util.Map<String, ?> map) throws Exception {
        MountIotagentKbRequest self = new MountIotagentKbRequest();
        return TeaModel.build(map, self);
    }

    public MountIotagentKbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MountIotagentKbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MountIotagentKbRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public MountIotagentKbRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public MountIotagentKbRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
