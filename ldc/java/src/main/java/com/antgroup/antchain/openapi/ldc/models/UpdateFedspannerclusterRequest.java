// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFedspannerclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用于描述联邦spanner 集群内容器实例采用内网还是外网
    @NameInMap("address_type")
    @Validation(required = true)
    public String addressType;

    // 集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 用于描述联邦spanner 集群内容器实例 cpu大小， 单位core
    @NameInMap("cpu")
    @Validation(required = true)
    public String cpu;

    // 用于描述联邦spanner 集群内容器实例disk大小， 单位Gi
    @NameInMap("disk")
    @Validation(required = true)
    public String disk;

    // 用于描述联邦spanner 集群内容器实例的网络是否采用host网络
    @NameInMap("host_network")
    @Validation(required = true)
    public Boolean hostNetwork;

    // 用于描述联邦spanner 集群内容器实例mem 大小， 单位 Gi
    @NameInMap("mem")
    @Validation(required = true)
    public String mem;

    // 用于描述联邦spanner 集群名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 描述集群状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 定义了sub cluster的config信息，包含多版本，镜像，副本数，标签等
    @NameInMap("sub_clusters_config")
    @Validation(required = true)
    public String subClustersConfig;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateFedspannerclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFedspannerclusterRequest self = new UpdateFedspannerclusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFedspannerclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFedspannerclusterRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public UpdateFedspannerclusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateFedspannerclusterRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public UpdateFedspannerclusterRequest setDisk(String disk) {
        this.disk = disk;
        return this;
    }
    public String getDisk() {
        return this.disk;
    }

    public UpdateFedspannerclusterRequest setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public UpdateFedspannerclusterRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public UpdateFedspannerclusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFedspannerclusterRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateFedspannerclusterRequest setSubClustersConfig(String subClustersConfig) {
        this.subClustersConfig = subClustersConfig;
        return this;
    }
    public String getSubClustersConfig() {
        return this.subClustersConfig;
    }

    public UpdateFedspannerclusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
