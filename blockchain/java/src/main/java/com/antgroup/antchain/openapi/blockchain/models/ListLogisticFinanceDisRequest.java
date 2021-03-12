// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListLogisticFinanceDisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static ListLogisticFinanceDisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogisticFinanceDisRequest self = new ListLogisticFinanceDisRequest();
        return TeaModel.build(map, self);
    }

    public ListLogisticFinanceDisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListLogisticFinanceDisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
