// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ClusterEvents extends TeaModel {
    // 集群名称
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 集群事件
    @NameInMap("events")
    @Validation(required = true)
    public java.util.List<KubernetesEvents> events;

    public static ClusterEvents build(java.util.Map<String, ?> map) throws Exception {
        ClusterEvents self = new ClusterEvents();
        return TeaModel.build(map, self);
    }

    public ClusterEvents setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ClusterEvents setEvents(java.util.List<KubernetesEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<KubernetesEvents> getEvents() {
        return this.events;
    }

}
