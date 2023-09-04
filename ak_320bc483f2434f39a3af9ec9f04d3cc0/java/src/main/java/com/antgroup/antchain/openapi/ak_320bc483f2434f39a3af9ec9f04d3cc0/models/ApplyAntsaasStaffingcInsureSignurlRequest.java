// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class ApplyAntsaasStaffingcInsureSignurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("enterprise_name")
    @Validation(required = true)
    public String enterpriseName;

    // 社会信用代码
    @NameInMap("social_credit_code")
    @Validation(required = true)
    public String socialCreditCode;

    // 签约支付宝账号（企业支付宝是邮箱）
    @NameInMap("auth_account")
    @Validation(required = true)
    public String authAccount;

    // 联系手机号（用于接收投保失败等短信通知）
    @NameInMap("mobile")
    public String mobile;

    // 外部业务号(64长度以内）
    // 
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    public static ApplyAntsaasStaffingcInsureSignurlRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntsaasStaffingcInsureSignurlRequest self = new ApplyAntsaasStaffingcInsureSignurlRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntsaasStaffingcInsureSignurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAntsaasStaffingcInsureSignurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAntsaasStaffingcInsureSignurlRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public ApplyAntsaasStaffingcInsureSignurlRequest setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public ApplyAntsaasStaffingcInsureSignurlRequest setAuthAccount(String authAccount) {
        this.authAccount = authAccount;
        return this;
    }
    public String getAuthAccount() {
        return this.authAccount;
    }

    public ApplyAntsaasStaffingcInsureSignurlRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ApplyAntsaasStaffingcInsureSignurlRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

}
