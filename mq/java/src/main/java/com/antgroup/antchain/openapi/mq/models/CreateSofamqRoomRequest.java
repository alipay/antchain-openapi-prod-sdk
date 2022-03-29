// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqRoomRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cluster
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    // endpoint_type
    @NameInMap("endpoint_type")
    public String endpointType;

    // region
    @NameInMap("region")
    public String region;

    // room
    @NameInMap("room")
    @Validation(required = true)
    public String room;

    public static CreateSofamqRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqRoomRequest self = new CreateSofamqRoomRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqRoomRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqRoomRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqRoomRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public CreateSofamqRoomRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateSofamqRoomRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateSofamqRoomRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateSofamqRoomRequest setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

}
