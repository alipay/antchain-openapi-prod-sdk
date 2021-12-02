// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class QueryModelrelationshipRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 目标模型的唯一标识
    @NameInMap("destination_model_id")
    public String destinationModelId;

    public static QueryModelrelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelrelationshipRequest self = new QueryModelrelationshipRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelrelationshipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelrelationshipRequest setDestinationModelId(String destinationModelId) {
        this.destinationModelId = destinationModelId;
        return this;
    }
    public String getDestinationModelId() {
        return this.destinationModelId;
    }

}
