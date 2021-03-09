// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AcsClusterUnit extends TeaModel {
    // cluster_id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // address
    @NameInMap("address")
    public String address;

    // unit_status
    @NameInMap("unit_status")
    public Long unitStatus;

    // create_time
    @NameInMap("create_time")
    public String createTime;

    // modify_time
    @NameInMap("modify_time")
    public String modifyTime;

    // container_id
    @NameInMap("container_id")
    public String containerId;

    public static AcsClusterUnit build(java.util.Map<String, ?> map) throws Exception {
        AcsClusterUnit self = new AcsClusterUnit();
        return TeaModel.build(map, self);
    }

    public AcsClusterUnit setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AcsClusterUnit setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AcsClusterUnit setUnitStatus(Long unitStatus) {
        this.unitStatus = unitStatus;
        return this;
    }
    public Long getUnitStatus() {
        return this.unitStatus;
    }

    public AcsClusterUnit setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AcsClusterUnit setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public AcsClusterUnit setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

}
