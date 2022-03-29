// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // appkey
    @NameInMap("appkey")
    public String appkey;

    // cluster
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // cluster_type
    @NameInMap("cluster_type")
    public String clusterType;

    // 0:单机房,1:本地优先,2:交叉部署,3:独占LDC
    @NameInMap("deploy_mode")
    public String deployMode;

    // unshared: 独占
    // shared: 共享
    @NameInMap("ldc_mode")
    public String ldcMode;

    // remark
    @NameInMap("remark")
    public String remark;

    public static CreateSofamqClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqClusterRequest self = new CreateSofamqClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqClusterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqClusterRequest setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
    public String getAppkey() {
        return this.appkey;
    }

    public CreateSofamqClusterRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public CreateSofamqClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateSofamqClusterRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateSofamqClusterRequest setLdcMode(String ldcMode) {
        this.ldcMode = ldcMode;
        return this;
    }
    public String getLdcMode() {
        return this.ldcMode;
    }

    public CreateSofamqClusterRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
