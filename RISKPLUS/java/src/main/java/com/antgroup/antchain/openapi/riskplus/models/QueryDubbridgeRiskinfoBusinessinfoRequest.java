// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRiskinfoBusinessinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道号
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 客户号
    @NameInMap("customer_no")
    @Validation(required = true)
    public String customerNo;

    // 统一社会信用代码
    @NameInMap("social_credit_code")
    public String socialCreditCode;

    public static QueryDubbridgeRiskinfoBusinessinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRiskinfoBusinessinfoRequest self = new QueryDubbridgeRiskinfoBusinessinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRiskinfoBusinessinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRiskinfoBusinessinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRiskinfoBusinessinfoRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryDubbridgeRiskinfoBusinessinfoRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryDubbridgeRiskinfoBusinessinfoRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

}
