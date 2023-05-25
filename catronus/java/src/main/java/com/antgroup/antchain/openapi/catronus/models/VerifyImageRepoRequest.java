// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class VerifyImageRepoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // repo_id
    @NameInMap("repo_id")
    @Validation(required = true)
    public String repoId;

    public static VerifyImageRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyImageRepoRequest self = new VerifyImageRepoRequest();
        return TeaModel.build(map, self);
    }

    public VerifyImageRepoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyImageRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
