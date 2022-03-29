// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class RoomDO extends TeaModel {
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

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    public static RoomDO build(java.util.Map<String, ?> map) throws Exception {
        RoomDO self = new RoomDO();
        return TeaModel.build(map, self);
    }

    public RoomDO setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public RoomDO setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public RoomDO setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public RoomDO setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public RoomDO setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

    public RoomDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RoomDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RoomDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
