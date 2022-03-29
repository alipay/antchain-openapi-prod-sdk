// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CellDO extends TeaModel {
    // cell
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // cell type
    @NameInMap("cell_type")
    public String cellType;

    // default
    @NameInMap("datacenter")
    public String datacenter;

    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    // endpoint type
    @NameInMap("endpoint_type")
    public String endpointType;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // room
    @NameInMap("room")
    public String room;

    public static CellDO build(java.util.Map<String, ?> map) throws Exception {
        CellDO self = new CellDO();
        return TeaModel.build(map, self);
    }

    public CellDO setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public CellDO setCellType(String cellType) {
        this.cellType = cellType;
        return this;
    }
    public String getCellType() {
        return this.cellType;
    }

    public CellDO setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    public String getDatacenter() {
        return this.datacenter;
    }

    public CellDO setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CellDO setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CellDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CellDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CellDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CellDO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CellDO setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

}
