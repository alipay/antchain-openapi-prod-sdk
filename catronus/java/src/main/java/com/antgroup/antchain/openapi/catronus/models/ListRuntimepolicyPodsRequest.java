// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ListRuntimepolicyPodsRequest extends TeaModel {
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

    // 策略名称
    @NameInMap("policy_name")
    @Validation(required = true)
    public String policyName;

    public static ListRuntimepolicyPodsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuntimepolicyPodsRequest self = new ListRuntimepolicyPodsRequest();
        return TeaModel.build(map, self);
    }

    public ListRuntimepolicyPodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRuntimepolicyPodsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListRuntimepolicyPodsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListRuntimepolicyPodsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
