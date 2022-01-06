// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CancelDssSwitchoverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("dest_cell")
    @Validation(required = true)
    public String destCell;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("source_cell")
    @Validation(required = true)
    public String sourceCell;

    public static CancelDssSwitchoverRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDssSwitchoverRequest self = new CancelDssSwitchoverRequest();
        return TeaModel.build(map, self);
    }

    public CancelDssSwitchoverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelDssSwitchoverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelDssSwitchoverRequest setDestCell(String destCell) {
        this.destCell = destCell;
        return this;
    }
    public String getDestCell() {
        return this.destCell;
    }

    public CancelDssSwitchoverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelDssSwitchoverRequest setSourceCell(String sourceCell) {
        this.sourceCell = sourceCell;
        return this;
    }
    public String getSourceCell() {
        return this.sourceCell;
    }

}
