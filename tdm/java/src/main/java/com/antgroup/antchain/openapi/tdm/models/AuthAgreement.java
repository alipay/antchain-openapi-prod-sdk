// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class AuthAgreement extends TeaModel {
    // 授权协议code
    @NameInMap("auth_agreement_code")
    @Validation(required = true)
    public String authAgreementCode;

    // 授权协议类型：
    // TIME、时间授权
    // COUNT、次数授权
    // TIME_COUNT、时间范围内次数授权
    @NameInMap("auth_agreement_type")
    @Validation(required = true)
    public String authAgreementType;

    // 授权开始ishi见
    @NameInMap("auth_begin_time")
    public String authBeginTime;

    // 授权截止日期
    // 
    // 
    @NameInMap("auth_end_time")
    public String authEndTime;

    // 授权次数
    // 
    // 
    @NameInMap("auth_count")
    public Long authCount;

    // 剩余授权次数
    @NameInMap("auth_balance_count")
    public Long authBalanceCount;

    public static AuthAgreement build(java.util.Map<String, ?> map) throws Exception {
        AuthAgreement self = new AuthAgreement();
        return TeaModel.build(map, self);
    }

    public AuthAgreement setAuthAgreementCode(String authAgreementCode) {
        this.authAgreementCode = authAgreementCode;
        return this;
    }
    public String getAuthAgreementCode() {
        return this.authAgreementCode;
    }

    public AuthAgreement setAuthAgreementType(String authAgreementType) {
        this.authAgreementType = authAgreementType;
        return this;
    }
    public String getAuthAgreementType() {
        return this.authAgreementType;
    }

    public AuthAgreement setAuthBeginTime(String authBeginTime) {
        this.authBeginTime = authBeginTime;
        return this;
    }
    public String getAuthBeginTime() {
        return this.authBeginTime;
    }

    public AuthAgreement setAuthEndTime(String authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public String getAuthEndTime() {
        return this.authEndTime;
    }

    public AuthAgreement setAuthCount(Long authCount) {
        this.authCount = authCount;
        return this;
    }
    public Long getAuthCount() {
        return this.authCount;
    }

    public AuthAgreement setAuthBalanceCount(Long authBalanceCount) {
        this.authBalanceCount = authBalanceCount;
        return this;
    }
    public Long getAuthBalanceCount() {
        return this.authBalanceCount;
    }

}
