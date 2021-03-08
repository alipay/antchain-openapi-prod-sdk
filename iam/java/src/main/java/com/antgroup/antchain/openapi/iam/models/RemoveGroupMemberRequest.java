// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class RemoveGroupMemberRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 成员组ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 操作员ID
    @NameInMap("operator_ids")
    @Validation(required = true)
    public java.util.List<String> operatorIds;

    public static RemoveGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupMemberRequest self = new RemoveGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveGroupMemberRequest setOperatorIds(java.util.List<String> operatorIds) {
        this.operatorIds = operatorIds;
        return this;
    }
    public java.util.List<String> getOperatorIds() {
        return this.operatorIds;
    }

}
