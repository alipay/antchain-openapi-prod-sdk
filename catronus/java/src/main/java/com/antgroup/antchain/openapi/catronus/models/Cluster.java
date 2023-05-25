// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Cluster extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 环境
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 纳管状态（imported已纳管/unimported未纳管）
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 导入方式
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 白名单
    @NameInMap("namespace_whitelist")
    @Validation(required = true)
    public java.util.List<String> namespaceWhitelist;

    public static Cluster build(java.util.Map<String, ?> map) throws Exception {
        Cluster self = new Cluster();
        return TeaModel.build(map, self);
    }

    public Cluster setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Cluster setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public Cluster setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public Cluster setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Cluster setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public Cluster setNamespaceWhitelist(java.util.List<String> namespaceWhitelist) {
        this.namespaceWhitelist = namespaceWhitelist;
        return this;
    }
    public java.util.List<String> getNamespaceWhitelist() {
        return this.namespaceWhitelist;
    }

}
