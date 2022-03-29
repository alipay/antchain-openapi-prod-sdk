// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // appkey
    @NameInMap("appkey")
    public String appkey;

    // cluster
    @NameInMap("cluster")
    public String cluster;

    // deploy_mode
    @NameInMap("deploy_mode")
    public String deployMode;

    // remark
    @NameInMap("remark")
    public String remark;

    public static UpdateSofamqClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqClusterRequest self = new UpdateSofamqClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqClusterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqClusterRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSofamqClusterRequest setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
    public String getAppkey() {
        return this.appkey;
    }

    public UpdateSofamqClusterRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public UpdateSofamqClusterRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public UpdateSofamqClusterRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
