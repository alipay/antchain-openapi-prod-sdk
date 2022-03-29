// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DataCenterDO extends TeaModel {
    // cluster
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // datacenter
    @NameInMap("datacenter")
    @Validation(required = true)
    public String datacenter;

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

    public static DataCenterDO build(java.util.Map<String, ?> map) throws Exception {
        DataCenterDO self = new DataCenterDO();
        return TeaModel.build(map, self);
    }

    public DataCenterDO setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public DataCenterDO setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    public String getDatacenter() {
        return this.datacenter;
    }

    public DataCenterDO setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

    public DataCenterDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DataCenterDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DataCenterDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
