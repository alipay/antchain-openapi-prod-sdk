// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckCloudconfigBgreleaseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CheckCloudconfigBgreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudconfigBgreleaseRequest self = new CheckCloudconfigBgreleaseRequest();
        return TeaModel.build(map, self);
    }

    public CheckCloudconfigBgreleaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCloudconfigBgreleaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
