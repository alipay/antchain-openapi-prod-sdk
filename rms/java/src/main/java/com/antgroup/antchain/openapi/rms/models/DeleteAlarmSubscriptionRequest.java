// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteAlarmSubscriptionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 待删除的告警订阅 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static DeleteAlarmSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmSubscriptionRequest self = new DeleteAlarmSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmSubscriptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAlarmSubscriptionRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public DeleteAlarmSubscriptionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
