// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractComplainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 投诉单号
    @NameInMap("complain_event_id")
    @Validation(required = true, maxLength = 64)
    public String complainEventId;

    public static QueryContractComplainRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractComplainRequest self = new QueryContractComplainRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractComplainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractComplainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractComplainRequest setComplainEventId(String complainEventId) {
        this.complainEventId = complainEventId;
        return this;
    }
    public String getComplainEventId() {
        return this.complainEventId;
    }

}
