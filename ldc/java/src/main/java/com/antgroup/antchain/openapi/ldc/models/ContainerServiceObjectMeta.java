// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerServiceObjectMeta extends TeaModel {
    // UID
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 部署单元名称
    @NameInMap("cell_display_name")
    @Validation(required = true)
    public String cellDisplayName;

    // 集群名称
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 创建时间
    @NameInMap("created_time")
    @Validation(required = true)
    public String createdTime;

    public static ContainerServiceObjectMeta build(java.util.Map<String, ?> map) throws Exception {
        ContainerServiceObjectMeta self = new ContainerServiceObjectMeta();
        return TeaModel.build(map, self);
    }

    public ContainerServiceObjectMeta setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ContainerServiceObjectMeta setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ContainerServiceObjectMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContainerServiceObjectMeta setCellDisplayName(String cellDisplayName) {
        this.cellDisplayName = cellDisplayName;
        return this;
    }
    public String getCellDisplayName() {
        return this.cellDisplayName;
    }

    public ContainerServiceObjectMeta setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ContainerServiceObjectMeta setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

}
