// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LoadBuildpackDockerfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 技术栈大版本
    @NameInMap("tech_stack")
    @Validation(required = true)
    public String techStack;

    // 云原生技术栈版本
    @NameInMap("tech_stack_version")
    @Validation(required = true)
    public String techStackVersion;

    // 应用包地址，可以为相对目录，或者远程可访问存储地址. 用于组装Dockerfile模板中对应的应用包获取地址
    @NameInMap("package_url")
    @Validation(required = true)
    public String packageUrl;

    public static LoadBuildpackDockerfileRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadBuildpackDockerfileRequest self = new LoadBuildpackDockerfileRequest();
        return TeaModel.build(map, self);
    }

    public LoadBuildpackDockerfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoadBuildpackDockerfileRequest setTechStack(String techStack) {
        this.techStack = techStack;
        return this;
    }
    public String getTechStack() {
        return this.techStack;
    }

    public LoadBuildpackDockerfileRequest setTechStackVersion(String techStackVersion) {
        this.techStackVersion = techStackVersion;
        return this;
    }
    public String getTechStackVersion() {
        return this.techStackVersion;
    }

    public LoadBuildpackDockerfileRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

}
