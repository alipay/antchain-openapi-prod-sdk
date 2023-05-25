// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class CreateRuntimePolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 运行时策略yaml文件内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static CreateRuntimePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuntimePolicyRequest self = new CreateRuntimePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuntimePolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRuntimePolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateRuntimePolicyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateRuntimePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRuntimePolicyRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
