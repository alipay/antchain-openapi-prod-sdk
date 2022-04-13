// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryPodLogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群名称
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 容器名称
    // The container for which to stream logs. Defaults to only container if there is one container in the pod. (optional)
    @NameInMap("container_name")
    public String containerName;

    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // pod名称
    @NameInMap("pod_name")
    @Validation(required = true)
    public String podName;

    // A relative time in seconds before the current time from which to show logs. If this value precedes the time a pod was started, only logs since the pod start will be returned. If this value is in the future, no logs will be returned. Only one of sinceSeconds or sinceTime may be specified. (optional)
    @NameInMap("since_seconds")
    public Long sinceSeconds;

    // the number of lines from the end of the logs to show
    @NameInMap("tail_lines")
    public Long tailLines;

    // If true, add an RFC3339 or RFC3339Nano timestamp at the beginning of every line of log output. Defaults to false. (optional)
    @NameInMap("timestamps")
    public Boolean timestamps;

    // cluster对应的aks中minion cluster的id
    @NameInMap("minion_cluster_id")
    public String minionClusterId;

    public static QueryPodLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPodLogRequest self = new QueryPodLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryPodLogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPodLogRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public QueryPodLogRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public QueryPodLogRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryPodLogRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public QueryPodLogRequest setSinceSeconds(Long sinceSeconds) {
        this.sinceSeconds = sinceSeconds;
        return this;
    }
    public Long getSinceSeconds() {
        return this.sinceSeconds;
    }

    public QueryPodLogRequest setTailLines(Long tailLines) {
        this.tailLines = tailLines;
        return this;
    }
    public Long getTailLines() {
        return this.tailLines;
    }

    public QueryPodLogRequest setTimestamps(Boolean timestamps) {
        this.timestamps = timestamps;
        return this;
    }
    public Boolean getTimestamps() {
        return this.timestamps;
    }

    public QueryPodLogRequest setMinionClusterId(String minionClusterId) {
        this.minionClusterId = minionClusterId;
        return this;
    }
    public String getMinionClusterId() {
        return this.minionClusterId;
    }

}
