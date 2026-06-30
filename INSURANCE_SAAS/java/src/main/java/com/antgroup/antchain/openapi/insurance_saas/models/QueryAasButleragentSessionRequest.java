// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryAasButleragentSessionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 请求唯一标识
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 客户唯一标识
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 查询会话起始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 查询会话结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    public static QueryAasButleragentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAasButleragentSessionRequest self = new QueryAasButleragentSessionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAasButleragentSessionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAasButleragentSessionRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryAasButleragentSessionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAasButleragentSessionRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryAasButleragentSessionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAasButleragentSessionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
