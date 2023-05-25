// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class AddClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群名
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 环境
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 必为manual
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 命名空间白名单
    @NameInMap("namespace_whitelist")
    @Validation(required = true)
    public java.util.List<String> namespaceWhitelist;

    // 新增集群kubeconfig
    @NameInMap("kubeconfig")
    @Validation(required = true)
    public String kubeconfig;

    public static AddClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClusterRequest self = new AddClusterRequest();
        return TeaModel.build(map, self);
    }

    public AddClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public AddClusterRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public AddClusterRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddClusterRequest setNamespaceWhitelist(java.util.List<String> namespaceWhitelist) {
        this.namespaceWhitelist = namespaceWhitelist;
        return this;
    }
    public java.util.List<String> getNamespaceWhitelist() {
        return this.namespaceWhitelist;
    }

    public AddClusterRequest setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

}
