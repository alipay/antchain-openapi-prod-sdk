// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExecuteSwitchoverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // target zone
    @NameInMap("dest_cell")
    @Validation(required = true)
    public String destCell;

    // instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // source zone
    @NameInMap("source_cell")
    @Validation(required = true)
    public String sourceCell;

    public static ExecuteSwitchoverRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSwitchoverRequest self = new ExecuteSwitchoverRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSwitchoverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecuteSwitchoverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecuteSwitchoverRequest setDestCell(String destCell) {
        this.destCell = destCell;
        return this;
    }
    public String getDestCell() {
        return this.destCell;
    }

    public ExecuteSwitchoverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecuteSwitchoverRequest setSourceCell(String sourceCell) {
        this.sourceCell = sourceCell;
        return this;
    }
    public String getSourceCell() {
        return this.sourceCell;
    }

}
