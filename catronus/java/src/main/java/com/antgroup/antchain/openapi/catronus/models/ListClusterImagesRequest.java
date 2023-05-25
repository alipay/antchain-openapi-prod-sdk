// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ListClusterImagesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 目标命名空间
    @NameInMap("namespace")
    public String namespace;

    // 工作负载类型
    @NameInMap("workload_types")
    public java.util.List<String> workloadTypes;

    // 标签列表
    @NameInMap("labels")
    public java.util.List<Label> labels;

    public static ListClusterImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterImagesRequest self = new ListClusterImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterImagesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListClusterImagesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterImagesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListClusterImagesRequest setWorkloadTypes(java.util.List<String> workloadTypes) {
        this.workloadTypes = workloadTypes;
        return this;
    }
    public java.util.List<String> getWorkloadTypes() {
        return this.workloadTypes;
    }

    public ListClusterImagesRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

}
