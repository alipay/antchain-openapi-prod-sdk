// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ListRuntimepolicyNodesRequest extends TeaModel {
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

    public static ListRuntimepolicyNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuntimepolicyNodesRequest self = new ListRuntimepolicyNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListRuntimepolicyNodesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRuntimepolicyNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListRuntimepolicyNodesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListRuntimepolicyNodesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
