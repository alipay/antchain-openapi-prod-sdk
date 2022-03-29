// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteAlarmwebhookRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static DeleteAlarmwebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmwebhookRequest self = new DeleteAlarmwebhookRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmwebhookRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAlarmwebhookRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public DeleteAlarmwebhookRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
