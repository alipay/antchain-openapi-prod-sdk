// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFederationDeploymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属应用
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // clusters
    @NameInMap("clusters")
    @Validation(required = true)
    public java.util.List<String> clusters;

    // FedDeploymentClusterOverride描述
    @NameInMap("cluster_overrides")
    public java.util.List<FedDeploymentClusterOverride> clusterOverrides;

    // DNS配置
    @NameInMap("dns_policy")
    public String dnsPolicy;

    // Host networking requested for this pod
    @NameInMap("host_network")
    public Boolean hostNetwork;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // Pod模板描述
    @NameInMap("pod_spec")
    @Validation(required = true)
    public PodSpec podSpec;

    // Deployment 副本数
    @NameInMap("replicas")
    @Validation(required = true)
    public Long replicas;

    // Pod volume list
    @NameInMap("volumes")
    public java.util.List<Volume> volumes;

    // 环境组名称
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static CreateFederationDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFederationDeploymentRequest self = new CreateFederationDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateFederationDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFederationDeploymentRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateFederationDeploymentRequest setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

    public CreateFederationDeploymentRequest setClusterOverrides(java.util.List<FedDeploymentClusterOverride> clusterOverrides) {
        this.clusterOverrides = clusterOverrides;
        return this;
    }
    public java.util.List<FedDeploymentClusterOverride> getClusterOverrides() {
        return this.clusterOverrides;
    }

    public CreateFederationDeploymentRequest setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public CreateFederationDeploymentRequest setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public CreateFederationDeploymentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFederationDeploymentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateFederationDeploymentRequest setPodSpec(PodSpec podSpec) {
        this.podSpec = podSpec;
        return this;
    }
    public PodSpec getPodSpec() {
        return this.podSpec;
    }

    public CreateFederationDeploymentRequest setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public CreateFederationDeploymentRequest setVolumes(java.util.List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<Volume> getVolumes() {
        return this.volumes;
    }

    public CreateFederationDeploymentRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
