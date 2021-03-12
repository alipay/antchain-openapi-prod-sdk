// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBlockchainInstanceBizidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 内部建链的实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static QueryBlockchainInstanceBizidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainInstanceBizidRequest self = new QueryBlockchainInstanceBizidRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainInstanceBizidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainInstanceBizidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainInstanceBizidRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
