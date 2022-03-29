// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchdeleteUnifiedalarmRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // id
    @NameInMap("ids_repeat_list")
    @Validation(required = true)
    public java.util.List<Long> idsRepeatList;

    public static BatchdeleteUnifiedalarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteUnifiedalarmRuleRequest self = new BatchdeleteUnifiedalarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteUnifiedalarmRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteUnifiedalarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public BatchdeleteUnifiedalarmRuleRequest setIdsRepeatList(java.util.List<Long> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<Long> getIdsRepeatList() {
        return this.idsRepeatList;
    }

}
