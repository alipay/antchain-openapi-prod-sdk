// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class DeleteRuntimePolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 运行时策略命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 运行时策略名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static DeleteRuntimePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuntimePolicyRequest self = new DeleteRuntimePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuntimePolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteRuntimePolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteRuntimePolicyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteRuntimePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
