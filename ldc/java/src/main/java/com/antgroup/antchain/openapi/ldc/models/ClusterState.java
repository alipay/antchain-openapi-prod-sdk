// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ClusterState extends TeaModel {
    // 集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 联邦资源的分发状态，空字符串代表成功，否则为错误码
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 详细错误信息
    @NameInMap("message")
    public String message;

    public static ClusterState build(java.util.Map<String, ?> map) throws Exception {
        ClusterState self = new ClusterState();
        return TeaModel.build(map, self);
    }

    public ClusterState setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ClusterState setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ClusterState setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
