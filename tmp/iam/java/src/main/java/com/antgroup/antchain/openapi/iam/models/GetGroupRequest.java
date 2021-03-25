// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetGroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 成员组ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    public static GetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupRequest self = new GetGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
