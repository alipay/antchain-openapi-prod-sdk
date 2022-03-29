// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListAlarmSubscriptionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static ListAlarmSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmSubscriptionRequest self = new ListAlarmSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmSubscriptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAlarmSubscriptionRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ListAlarmSubscriptionRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAlarmSubscriptionRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
