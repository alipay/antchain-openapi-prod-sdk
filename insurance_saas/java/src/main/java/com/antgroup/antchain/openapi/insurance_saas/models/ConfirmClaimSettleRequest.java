// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ConfirmClaimSettleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 报案单编号（蚂蚁内部）
    @NameInMap("claim_notification_form_no_inner")
    @Validation(required = true)
    public String claimNotificationFormNoInner;

    // 附加内容
    @NameInMap("biz_info")
    public String bizInfo;

    public static ConfirmClaimSettleRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmClaimSettleRequest self = new ConfirmClaimSettleRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmClaimSettleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmClaimSettleRequest setClaimNotificationFormNoInner(String claimNotificationFormNoInner) {
        this.claimNotificationFormNoInner = claimNotificationFormNoInner;
        return this;
    }
    public String getClaimNotificationFormNoInner() {
        return this.claimNotificationFormNoInner;
    }

    public ConfirmClaimSettleRequest setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public String getBizInfo() {
        return this.bizInfo;
    }

}
