// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class QueryMerchantAgreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 签约时的请求单据号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务来源场景码，由中台分配给业务方
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 渠道场景码, 由中台分配给业务方
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    public static QueryMerchantAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantAgreementRequest self = new QueryMerchantAgreementRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantAgreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantAgreementRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMerchantAgreementRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryMerchantAgreementRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
