// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryScoreDataGatewayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 事件上下文属性
    @NameInMap("event_info")
    @Validation(required = true)
    public String eventInfo;

    public static QueryScoreDataGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScoreDataGatewayRequest self = new QueryScoreDataGatewayRequest();
        return TeaModel.build(map, self);
    }

    public QueryScoreDataGatewayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryScoreDataGatewayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryScoreDataGatewayRequest setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }
    public String getEventInfo() {
        return this.eventInfo;
    }

}
