// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class QueryGwdefaultChatstreamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 业务配置标识（必传），决定模型、策略、提示词
    @NameInMap("agent_code")
    @Validation(required = true)
    public String agentCode;

    // 用户输入
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 会话标识（可选），新会话不传，继续会话传
    @NameInMap("session_id")
    public String sessionId;

    // 扩展字段（可选），用于后端服务直接调用时指定技术参数
    @NameInMap("ext_info")
    public String extInfo;

    // 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools。
    @NameInMap("tag_info")
    public String tagInfo;

    public static QueryGwdefaultChatstreamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGwdefaultChatstreamRequest self = new QueryGwdefaultChatstreamRequest();
        return TeaModel.build(map, self);
    }

    public QueryGwdefaultChatstreamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGwdefaultChatstreamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGwdefaultChatstreamRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryGwdefaultChatstreamRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryGwdefaultChatstreamRequest setAgentCode(String agentCode) {
        this.agentCode = agentCode;
        return this;
    }
    public String getAgentCode() {
        return this.agentCode;
    }

    public QueryGwdefaultChatstreamRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGwdefaultChatstreamRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryGwdefaultChatstreamRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public QueryGwdefaultChatstreamRequest setTagInfo(String tagInfo) {
        this.tagInfo = tagInfo;
        return this;
    }
    public String getTagInfo() {
        return this.tagInfo;
    }

}
