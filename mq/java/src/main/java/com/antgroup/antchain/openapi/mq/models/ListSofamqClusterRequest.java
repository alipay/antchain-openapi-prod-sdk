// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cluster
    @NameInMap("cluster")
    public String cluster;

    // appkey
    @NameInMap("appkey")
    public String appkey;

    public static ListSofamqClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqClusterRequest self = new ListSofamqClusterRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqClusterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqClusterRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListSofamqClusterRequest setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
    public String getAppkey() {
        return this.appkey;
    }

}
