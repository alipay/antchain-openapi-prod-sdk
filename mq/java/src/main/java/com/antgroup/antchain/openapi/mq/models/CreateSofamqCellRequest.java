// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cell
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // cell_type
    @NameInMap("cell_type")
    public String cellType;

    // default
    @NameInMap("datacenter")
    public String datacenter;

    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    // endpoint_type
    @NameInMap("endpoint_type")
    public String endpointType;

    // ns id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // room
    @NameInMap("room")
    public String room;

    public static CreateSofamqCellRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqCellRequest self = new CreateSofamqCellRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqCellRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqCellRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public CreateSofamqCellRequest setCellType(String cellType) {
        this.cellType = cellType;
        return this;
    }
    public String getCellType() {
        return this.cellType;
    }

    public CreateSofamqCellRequest setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    public String getDatacenter() {
        return this.datacenter;
    }

    public CreateSofamqCellRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateSofamqCellRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateSofamqCellRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqCellRequest setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

}
