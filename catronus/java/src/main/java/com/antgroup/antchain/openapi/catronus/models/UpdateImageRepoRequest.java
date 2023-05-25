// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class UpdateImageRepoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 仓库ID
    @NameInMap("repo_id")
    @Validation(required = true)
    public String repoId;

    // 用户名
    @NameInMap("user_name")
    public String userName;

    // 密码
    @NameInMap("password")
    public String password;

    // 仓库名称
    @NameInMap("name")
    public String name;

    public static UpdateImageRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageRepoRequest self = new UpdateImageRepoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageRepoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateImageRepoRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public UpdateImageRepoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateImageRepoRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateImageRepoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
