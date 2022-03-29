// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqRoomRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // cluster
    @NameInMap("cluster")
    public String cluster;

    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    // region
    @NameInMap("region")
    public String region;

    // room
    @NameInMap("room")
    public String room;

    public static UpdateSofamqRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqRoomRequest self = new UpdateSofamqRoomRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqRoomRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqRoomRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqRoomRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSofamqRoomRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public UpdateSofamqRoomRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UpdateSofamqRoomRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateSofamqRoomRequest setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

}
