// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ClusterDO extends TeaModel {
    // appkey
    @NameInMap("appkey")
    public String appkey;

    // cluster
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // cluster cluster
    @NameInMap("cluster_type")
    public String clusterType;

    // 0:单机房
    @NameInMap("deploy_mode")
    public String deployMode;

    // ldc模式
    @NameInMap("ldc_mode")
    public String ldcMode;

    // remark
    @NameInMap("remark")
    public String remark;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    public static ClusterDO build(java.util.Map<String, ?> map) throws Exception {
        ClusterDO self = new ClusterDO();
        return TeaModel.build(map, self);
    }

    public ClusterDO setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
    public String getAppkey() {
        return this.appkey;
    }

    public ClusterDO setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ClusterDO setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ClusterDO setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public ClusterDO setLdcMode(String ldcMode) {
        this.ldcMode = ldcMode;
        return this;
    }
    public String getLdcMode() {
        return this.ldcMode;
    }

    public ClusterDO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ClusterDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ClusterDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ClusterDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
