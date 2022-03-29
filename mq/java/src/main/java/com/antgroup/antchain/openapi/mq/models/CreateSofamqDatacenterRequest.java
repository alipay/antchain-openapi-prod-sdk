// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqDatacenterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cluster
    @NameInMap("cluster")
    public String cluster;

    // datacenter
    @NameInMap("datacenter")
    public String datacenter;

    // room
    @NameInMap("room")
    public String room;

    public static CreateSofamqDatacenterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqDatacenterRequest self = new CreateSofamqDatacenterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqDatacenterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqDatacenterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqDatacenterRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public CreateSofamqDatacenterRequest setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    public String getDatacenter() {
        return this.datacenter;
    }

    public CreateSofamqDatacenterRequest setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

}
