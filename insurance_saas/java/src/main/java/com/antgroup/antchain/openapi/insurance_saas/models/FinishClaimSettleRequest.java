// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class FinishClaimSettleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 报案单编号（蚂蚁内部）
    @NameInMap("claim_notification_form_no_inner")
    @Validation(required = true)
    public String claimNotificationFormNoInner;

    // 报案号（保司）
    @NameInMap("claim_notification_no")
    public String claimNotificationNo;

    // 赔付受理结果：01--受理、02--拒赔
    @NameInMap("accept_result")
    @Validation(required = true)
    public String acceptResult;

    // 受理结论
    @NameInMap("accept_note")
    public String acceptNote;

    // 支付信息
    @NameInMap("trade_info")
    public String tradeInfo;

    public static FinishClaimSettleRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishClaimSettleRequest self = new FinishClaimSettleRequest();
        return TeaModel.build(map, self);
    }

    public FinishClaimSettleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishClaimSettleRequest setClaimNotificationFormNoInner(String claimNotificationFormNoInner) {
        this.claimNotificationFormNoInner = claimNotificationFormNoInner;
        return this;
    }
    public String getClaimNotificationFormNoInner() {
        return this.claimNotificationFormNoInner;
    }

    public FinishClaimSettleRequest setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
        return this;
    }
    public String getClaimNotificationNo() {
        return this.claimNotificationNo;
    }

    public FinishClaimSettleRequest setAcceptResult(String acceptResult) {
        this.acceptResult = acceptResult;
        return this;
    }
    public String getAcceptResult() {
        return this.acceptResult;
    }

    public FinishClaimSettleRequest setAcceptNote(String acceptNote) {
        this.acceptNote = acceptNote;
        return this;
    }
    public String getAcceptNote() {
        return this.acceptNote;
    }

    public FinishClaimSettleRequest setTradeInfo(String tradeInfo) {
        this.tradeInfo = tradeInfo;
        return this;
    }
    public String getTradeInfo() {
        return this.tradeInfo;
    }

}
