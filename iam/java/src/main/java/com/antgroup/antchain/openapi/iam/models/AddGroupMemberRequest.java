// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AddGroupMemberRequest extends TeaModel {
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

    public static AddGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGroupMemberRequest self = new AddGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddGroupMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddGroupMemberRequest setOperatorIds(java.util.List<String> operatorIds) {
        this.operatorIds = operatorIds;
        return this;
    }
    public java.util.List<String> getOperatorIds() {
        return this.operatorIds;
    }

}
