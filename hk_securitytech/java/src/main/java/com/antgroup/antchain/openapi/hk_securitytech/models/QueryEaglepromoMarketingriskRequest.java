// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class QueryEaglepromoMarketingriskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // security_data
    @NameInMap("security_data")
    @Validation(required = true)
    public MarketingRiskSecurityData securityData;

    // sign_factor
    @NameInMap("sign_factor")
    @Validation(required = true)
    public String signFactor;

    // client_id
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // request_id
    @NameInMap("request_id")
    public String requestId;

    // biz_code
    @NameInMap("biz_code")
    public String bizCode;

    // terminal_type
    @NameInMap("terminal_type")
    @Validation(required = true)
    public String terminalType;

    public static QueryEaglepromoMarketingriskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEaglepromoMarketingriskRequest self = new QueryEaglepromoMarketingriskRequest();
        return TeaModel.build(map, self);
    }

    public QueryEaglepromoMarketingriskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEaglepromoMarketingriskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEaglepromoMarketingriskRequest setSecurityData(MarketingRiskSecurityData securityData) {
        this.securityData = securityData;
        return this;
    }
    public MarketingRiskSecurityData getSecurityData() {
        return this.securityData;
    }

    public QueryEaglepromoMarketingriskRequest setSignFactor(String signFactor) {
        this.signFactor = signFactor;
        return this;
    }
    public String getSignFactor() {
        return this.signFactor;
    }

    public QueryEaglepromoMarketingriskRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QueryEaglepromoMarketingriskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEaglepromoMarketingriskRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryEaglepromoMarketingriskRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
