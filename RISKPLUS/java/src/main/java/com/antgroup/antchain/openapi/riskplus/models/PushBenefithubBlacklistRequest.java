// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushBenefithubBlacklistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流量平台编码
    @NameInMap("platform_code")
    @Validation(required = true)
    public String platformCode;

    // 流量平台用户唯一id
    @NameInMap("user_unique_id")
    @Validation(required = true)
    public String userUniqueId;

    // 用户姓名
    @NameInMap("user_name")
    public String userName;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 身份证号
    @NameInMap("cert_no")
    public String certNo;

    // 加黑名单理由
    @NameInMap("reason")
    public String reason;

    public static PushBenefithubBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBenefithubBlacklistRequest self = new PushBenefithubBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public PushBenefithubBlacklistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushBenefithubBlacklistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushBenefithubBlacklistRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public PushBenefithubBlacklistRequest setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
        return this;
    }
    public String getUserUniqueId() {
        return this.userUniqueId;
    }

    public PushBenefithubBlacklistRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public PushBenefithubBlacklistRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public PushBenefithubBlacklistRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public PushBenefithubBlacklistRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
