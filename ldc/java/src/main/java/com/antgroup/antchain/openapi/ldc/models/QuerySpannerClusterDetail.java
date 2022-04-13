// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySpannerClusterDetail extends TeaModel {
    // 用于描述联邦spanner 集群内容器实例采用内网还是外网 
    @NameInMap("address_type")
    @Validation(required = true)
    public String addressType;

    // cpu 核数
    @NameInMap("cpu")
    public Long cpu;

    // 创建时间
    @NameInMap("create_timestamp")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTimestamp;

    // 盘大小
    @NameInMap("disk")
    public Long disk;

    // 将cpu,mem,disk按照单位拼接起来
    @NameInMap("flavor")
    @Validation(required = true)
    public String flavor;

    // 描述集群容器是否采用了host网络	
    // 
    @NameInMap("host_network")
    @Validation(required = true)
    public Boolean hostNetwork;

    // 集群id
    @NameInMap("id")
    @Validation(required = true, maxLength = 256)
    public String id;

    // 关联的实例数
    @NameInMap("instances")
    @Validation(required = true)
    public Long instances;

    // mem 大小
    @NameInMap("mem")
    public Long mem;

    // 可能存在的错误信息
    @NameInMap("message")
    public String message;

    // 集群名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 63)
    public String name;

    // 描述集群状态	
    // 
    @NameInMap("state")
    @Validation(required = true, maxLength = 63)
    public String state;

    // 租户名称
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 最后更新的时间戳
    @NameInMap("update_timestamp")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String updateTimestamp;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 期望集群状态
    @NameInMap("expect_cluster_state")
    public String expectClusterState;

    public static QuerySpannerClusterDetail build(java.util.Map<String, ?> map) throws Exception {
        QuerySpannerClusterDetail self = new QuerySpannerClusterDetail();
        return TeaModel.build(map, self);
    }

    public QuerySpannerClusterDetail setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public QuerySpannerClusterDetail setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public QuerySpannerClusterDetail setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public String getCreateTimestamp() {
        return this.createTimestamp;
    }

    public QuerySpannerClusterDetail setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

    public QuerySpannerClusterDetail setFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }
    public String getFlavor() {
        return this.flavor;
    }

    public QuerySpannerClusterDetail setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public QuerySpannerClusterDetail setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QuerySpannerClusterDetail setInstances(Long instances) {
        this.instances = instances;
        return this;
    }
    public Long getInstances() {
        return this.instances;
    }

    public QuerySpannerClusterDetail setMem(Long mem) {
        this.mem = mem;
        return this;
    }
    public Long getMem() {
        return this.mem;
    }

    public QuerySpannerClusterDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySpannerClusterDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QuerySpannerClusterDetail setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QuerySpannerClusterDetail setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QuerySpannerClusterDetail setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public String getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public QuerySpannerClusterDetail setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QuerySpannerClusterDetail setExpectClusterState(String expectClusterState) {
        this.expectClusterState = expectClusterState;
        return this;
    }
    public String getExpectClusterState() {
        return this.expectClusterState;
    }

}
