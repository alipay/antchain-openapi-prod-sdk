// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRiskinfoEnterprisescoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 统一信用代码
    @NameInMap("social_credit_code")
    @Validation(required = true)
    public String socialCreditCode;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 客户号
    @NameInMap("customer_no")
    @Validation(required = true)
    public String customerNo;

    // 渠道号
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    //  手机号md5
    @NameInMap("mobile_md5")
    public String mobileMd5;

    public static QueryDubbridgeRiskinfoEnterprisescoreRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRiskinfoEnterprisescoreRequest self = new QueryDubbridgeRiskinfoEnterprisescoreRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRiskinfoEnterprisescoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRiskinfoEnterprisescoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRiskinfoEnterprisescoreRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public QueryDubbridgeRiskinfoEnterprisescoreRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryDubbridgeRiskinfoEnterprisescoreRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryDubbridgeRiskinfoEnterprisescoreRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryDubbridgeRiskinfoEnterprisescoreRequest setMobileMd5(String mobileMd5) {
        this.mobileMd5 = mobileMd5;
        return this;
    }
    public String getMobileMd5() {
        return this.mobileMd5;
    }

}
