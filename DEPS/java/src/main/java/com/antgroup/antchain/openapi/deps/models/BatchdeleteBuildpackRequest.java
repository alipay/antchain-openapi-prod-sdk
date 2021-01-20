// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchdeleteBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // ids
    @NameInMap("id")
    public java.util.List<String> id;

    public static BatchdeleteBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteBuildpackRequest self = new BatchdeleteBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteBuildpackRequest setId(java.util.List<String> id) {
        this.id = id;
        return this;
    }
    public java.util.List<String> getId() {
        return this.id;
    }

}
