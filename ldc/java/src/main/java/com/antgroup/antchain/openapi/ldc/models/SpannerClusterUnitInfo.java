// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SpannerClusterUnitInfo extends TeaModel {
    // 单元IP地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 所属集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 容器id
    @NameInMap("container_id")
    @Validation(required = true)
    public String containerId;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modify")
    @Validation(required = true)
    public String gmtModify;

    // 集群单元状态 ： 1-下线状态 2- 上线状态 3-删除状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 扩展信息，json字符串格式
    @NameInMap("extend_properties")
    public String extendProperties;

    public static SpannerClusterUnitInfo build(java.util.Map<String, ?> map) throws Exception {
        SpannerClusterUnitInfo self = new SpannerClusterUnitInfo();
        return TeaModel.build(map, self);
    }

    public SpannerClusterUnitInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SpannerClusterUnitInfo setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SpannerClusterUnitInfo setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public SpannerClusterUnitInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SpannerClusterUnitInfo setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public SpannerClusterUnitInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SpannerClusterUnitInfo setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

}
