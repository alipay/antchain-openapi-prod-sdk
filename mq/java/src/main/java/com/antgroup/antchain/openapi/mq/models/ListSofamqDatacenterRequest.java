// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqDatacenterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // instance id
    @NameInMap("instance_id")
    public String instanceId;

    // cluster
    @NameInMap("cluster")
    public String cluster;

    // datacenter
    @NameInMap("datacenter")
    public String datacenter;

    // room
    @NameInMap("room")
    public String room;

    public static ListSofamqDatacenterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqDatacenterRequest self = new ListSofamqDatacenterRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqDatacenterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqDatacenterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqDatacenterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSofamqDatacenterRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListSofamqDatacenterRequest setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    public String getDatacenter() {
        return this.datacenter;
    }

    public ListSofamqDatacenterRequest setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

}
