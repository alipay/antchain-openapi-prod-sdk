// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class GetImageRepoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // repo ID
    @NameInMap("repo_id")
    @Validation(required = true)
    public String repoId;

    public static GetImageRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageRepoRequest self = new GetImageRepoRequest();
        return TeaModel.build(map, self);
    }

    public GetImageRepoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetImageRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
