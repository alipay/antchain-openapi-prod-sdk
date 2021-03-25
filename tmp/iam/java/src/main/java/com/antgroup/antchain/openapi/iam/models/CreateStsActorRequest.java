// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class CreateStsActorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 虚拟身份受信关系集合，通常只包含一个
    @NameInMap("bindings")
    @Validation(required = true)
    public java.util.List<StsActorBinding> bindings;

    // 针对虚拟身份的描述
    @NameInMap("description")
    public String description;

    // 虚拟身份名称，租户内唯一
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static CreateStsActorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStsActorRequest self = new CreateStsActorRequest();
        return TeaModel.build(map, self);
    }

    public CreateStsActorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateStsActorRequest setBindings(java.util.List<StsActorBinding> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<StsActorBinding> getBindings() {
        return this.bindings;
    }

    public CreateStsActorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStsActorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
