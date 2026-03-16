// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AuthTradeCreditgrantingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // merchant_id
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    // fund_id
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String fundId;

    // auth_id
    @NameInMap("auth_id")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String authId;

    // apply_role
    @NameInMap("apply_role")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String applyRole;

    // auth_sign_type
    @NameInMap("auth_sign_type")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String authSignType;

    // auth_begin_date
    // 授权开始时间
    // yyyy-MM-dd HH:mm:ss
    // 非空，不可早于当前时间
    // 为空，设置为当前时间
    @NameInMap("auth_begin_date")
    public String authBeginDate;

    // 授权结束时间
    // yyyy-MM-dd HH:mm:ss
    // 非空，不可早于authBeginDate
    @NameInMap("auth_end_date")
    public String authEndDate;

    public static AuthTradeCreditgrantingRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthTradeCreditgrantingRequest self = new AuthTradeCreditgrantingRequest();
        return TeaModel.build(map, self);
    }

    public AuthTradeCreditgrantingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthTradeCreditgrantingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthTradeCreditgrantingRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AuthTradeCreditgrantingRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public AuthTradeCreditgrantingRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public AuthTradeCreditgrantingRequest setApplyRole(String applyRole) {
        this.applyRole = applyRole;
        return this;
    }
    public String getApplyRole() {
        return this.applyRole;
    }

    public AuthTradeCreditgrantingRequest setAuthSignType(String authSignType) {
        this.authSignType = authSignType;
        return this;
    }
    public String getAuthSignType() {
        return this.authSignType;
    }

    public AuthTradeCreditgrantingRequest setAuthBeginDate(String authBeginDate) {
        this.authBeginDate = authBeginDate;
        return this;
    }
    public String getAuthBeginDate() {
        return this.authBeginDate;
    }

    public AuthTradeCreditgrantingRequest setAuthEndDate(String authEndDate) {
        this.authEndDate = authEndDate;
        return this;
    }
    public String getAuthEndDate() {
        return this.authEndDate;
    }

}
