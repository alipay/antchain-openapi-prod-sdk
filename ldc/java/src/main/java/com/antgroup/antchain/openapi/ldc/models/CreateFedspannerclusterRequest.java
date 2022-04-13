// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFedspannerclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用于描述联邦spanner 集群内容器实例采用内网还是外网
    @NameInMap("address_type")
    @Validation(required = true)
    public String addressType;

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

    // 描述集群初始状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 定义了container的spec信息，包含多版本，镜像，副本数，标签等
    @NameInMap("sub_clusters_config")
    @Validation(required = true)
    public String subClustersConfig;

    // 工作空间组信息
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static CreateFedspannerclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFedspannerclusterRequest self = new CreateFedspannerclusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateFedspannerclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFedspannerclusterRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateFedspannerclusterRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public CreateFedspannerclusterRequest setDisk(String disk) {
        this.disk = disk;
        return this;
    }
    public String getDisk() {
        return this.disk;
    }

    public CreateFedspannerclusterRequest setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public CreateFedspannerclusterRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public CreateFedspannerclusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFedspannerclusterRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateFedspannerclusterRequest setSubClustersConfig(String subClustersConfig) {
        this.subClustersConfig = subClustersConfig;
        return this;
    }
    public String getSubClustersConfig() {
        return this.subClustersConfig;
    }

    public CreateFedspannerclusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
