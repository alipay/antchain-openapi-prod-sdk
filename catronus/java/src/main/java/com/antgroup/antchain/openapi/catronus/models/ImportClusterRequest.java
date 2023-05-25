// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ImportClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群id
    @NameInMap("cluster_id")
    public String clusterId;

    // 集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 环境
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 导入方式（手工manual/自动auto）
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 命名空间白名单
    @NameInMap("namespace_whitelist")
    public java.util.List<String> namespaceWhitelist;

    public static ImportClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportClusterRequest self = new ImportClusterRequest();
        return TeaModel.build(map, self);
    }

    public ImportClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ImportClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ImportClusterRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ImportClusterRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ImportClusterRequest setNamespaceWhitelist(java.util.List<String> namespaceWhitelist) {
        this.namespaceWhitelist = namespaceWhitelist;
        return this;
    }
    public java.util.List<String> getNamespaceWhitelist() {
        return this.namespaceWhitelist;
    }

}
