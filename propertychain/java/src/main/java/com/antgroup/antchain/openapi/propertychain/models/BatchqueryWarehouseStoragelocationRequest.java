// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BatchqueryWarehouseStoragelocationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BatchqueryWarehouseStoragelocationRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryWarehouseStoragelocationRequest self = new BatchqueryWarehouseStoragelocationRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryWarehouseStoragelocationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryWarehouseStoragelocationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
