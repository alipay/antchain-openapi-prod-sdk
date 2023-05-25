// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class CreateImageRepoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 镜像仓库名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 镜像仓库类型
    @NameInMap("repo_type")
    @Validation(required = true)
    public String repoType;

    // hub域名
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // API endpoint
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    // 用户名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 仓库密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static CreateImageRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageRepoRequest self = new CreateImageRepoRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageRepoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateImageRepoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateImageRepoRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public CreateImageRepoRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateImageRepoRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateImageRepoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateImageRepoRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
