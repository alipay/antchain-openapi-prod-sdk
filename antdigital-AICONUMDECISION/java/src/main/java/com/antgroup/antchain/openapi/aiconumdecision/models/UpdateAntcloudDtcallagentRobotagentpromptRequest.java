// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class UpdateAntcloudDtcallagentRobotagentpromptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务空间
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    // agentid
    @NameInMap("robot_code")
    @Validation(required = true)
    public String robotCode;

    // 提示词内容
    @NameInMap("sys_content_agent")
    @Validation(required = true)
    public String sysContentAgent;

    // 敏感词定义
    @NameInMap("sensitive_word_regex")
    public String sensitiveWordRegex;

    // 敏感词回复
    @NameInMap("sensitive_word_reply")
    public String sensitiveWordReply;

    // 开常白
    @NameInMap("opening_content")
    public String openingContent;

    public static UpdateAntcloudDtcallagentRobotagentpromptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntcloudDtcallagentRobotagentpromptRequest self = new UpdateAntcloudDtcallagentRobotagentpromptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntcloudDtcallagentRobotagentpromptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptRequest setSysContentAgent(String sysContentAgent) {
        this.sysContentAgent = sysContentAgent;
        return this;
    }
    public String getSysContentAgent() {
        return this.sysContentAgent;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptRequest setSensitiveWordRegex(String sensitiveWordRegex) {
        this.sensitiveWordRegex = sensitiveWordRegex;
        return this;
    }
    public String getSensitiveWordRegex() {
        return this.sensitiveWordRegex;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptRequest setSensitiveWordReply(String sensitiveWordReply) {
        this.sensitiveWordReply = sensitiveWordReply;
        return this;
    }
    public String getSensitiveWordReply() {
        return this.sensitiveWordReply;
    }

    public UpdateAntcloudDtcallagentRobotagentpromptRequest setOpeningContent(String openingContent) {
        this.openingContent = openingContent;
        return this;
    }
    public String getOpeningContent() {
        return this.openingContent;
    }

}
