// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryProjectGetprojectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 项目id
    @NameInMap("project_id")
    public String projectId;

    public static QueryProjectGetprojectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectGetprojectRequest self = new QueryProjectGetprojectRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectGetprojectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProjectGetprojectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
