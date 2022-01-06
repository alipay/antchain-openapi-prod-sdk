// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DeleteSofaOspCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static DeleteSofaOspCellRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSofaOspCellRequest self = new DeleteSofaOspCellRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSofaOspCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSofaOspCellRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSofaOspCellRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public DeleteSofaOspCellRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
