// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclComplainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 投诉订单号
    @NameInMap("complain_event_id")
    @Validation(required = true, maxLength = 64)
    public String complainEventId;

    public static QueryBclComplainRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBclComplainRequest self = new QueryBclComplainRequest();
        return TeaModel.build(map, self);
    }

    public QueryBclComplainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBclComplainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBclComplainRequest setComplainEventId(String complainEventId) {
        this.complainEventId = complainEventId;
        return this;
    }
    public String getComplainEventId() {
        return this.complainEventId;
    }

}
