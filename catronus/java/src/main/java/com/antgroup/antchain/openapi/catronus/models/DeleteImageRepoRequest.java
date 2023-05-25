// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class DeleteImageRepoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 镜像仓库ID
    @NameInMap("repo_id")
    @Validation(required = true)
    public String repoId;

    public static DeleteImageRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageRepoRequest self = new DeleteImageRepoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageRepoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteImageRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
