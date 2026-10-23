// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherHistoryforecastRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 历史预测提交时返回的原请求 ID，不能为空；只允许查询当前网关租户所绑定合约的请求。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 合约编码，非必填。
    @NameInMap("agreement_code")
    public String agreementCode;

    public static QueryWeatherHistoryforecastRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherHistoryforecastRequest self = new QueryWeatherHistoryforecastRequest();
        return TeaModel.build(map, self);
    }

    public QueryWeatherHistoryforecastRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWeatherHistoryforecastRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherHistoryforecastRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

}
