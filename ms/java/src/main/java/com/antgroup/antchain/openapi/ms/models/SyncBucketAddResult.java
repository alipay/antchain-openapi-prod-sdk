// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SyncBucketAddResult extends TeaModel {
    // 集群同步任务id
    @NameInMap("cluster_task_id")
    @Validation(required = true)
    public String clusterTaskId;

    // 集群同步任务状态
    @NameInMap("cluster_task_status")
    @Validation(required = true)
    public String clusterTaskStatus;

    // 源集群id
    @NameInMap("source_cluster_id")
    @Validation(required = true)
    public String sourceClusterId;

    // 目标集群id
    @NameInMap("target_cluster_id")
    @Validation(required = true)
    public String targetClusterId;

    public static SyncBucketAddResult build(java.util.Map<String, ?> map) throws Exception {
        SyncBucketAddResult self = new SyncBucketAddResult();
        return TeaModel.build(map, self);
    }

    public SyncBucketAddResult setClusterTaskId(String clusterTaskId) {
        this.clusterTaskId = clusterTaskId;
        return this;
    }
    public String getClusterTaskId() {
        return this.clusterTaskId;
    }

    public SyncBucketAddResult setClusterTaskStatus(String clusterTaskStatus) {
        this.clusterTaskStatus = clusterTaskStatus;
        return this;
    }
    public String getClusterTaskStatus() {
        return this.clusterTaskStatus;
    }

    public SyncBucketAddResult setSourceClusterId(String sourceClusterId) {
        this.sourceClusterId = sourceClusterId;
        return this;
    }
    public String getSourceClusterId() {
        return this.sourceClusterId;
    }

    public SyncBucketAddResult setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

}
