// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PauseAlarmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 告警暂停开始时间
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 告警暂停结束时间
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 告警关闭原因
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源 ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static PauseAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseAlarmRequest self = new PauseAlarmRequest();
        return TeaModel.build(map, self);
    }

    public PauseAlarmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PauseAlarmRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public PauseAlarmRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public PauseAlarmRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public PauseAlarmRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public PauseAlarmRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public PauseAlarmRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
