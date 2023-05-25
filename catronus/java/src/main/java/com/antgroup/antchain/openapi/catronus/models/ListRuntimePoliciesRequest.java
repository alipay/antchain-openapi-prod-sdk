// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ListRuntimePoliciesRequest extends TeaModel {
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

    // 标签选择
    @NameInMap("label_selectors")
    public java.util.List<Label> labelSelectors;

    public static ListRuntimePoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuntimePoliciesRequest self = new ListRuntimePoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListRuntimePoliciesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRuntimePoliciesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListRuntimePoliciesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListRuntimePoliciesRequest setLabelSelectors(java.util.List<Label> labelSelectors) {
        this.labelSelectors = labelSelectors;
        return this;
    }
    public java.util.List<Label> getLabelSelectors() {
        return this.labelSelectors;
    }

}
