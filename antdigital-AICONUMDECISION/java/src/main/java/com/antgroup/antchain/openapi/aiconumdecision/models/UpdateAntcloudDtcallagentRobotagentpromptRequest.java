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

}
