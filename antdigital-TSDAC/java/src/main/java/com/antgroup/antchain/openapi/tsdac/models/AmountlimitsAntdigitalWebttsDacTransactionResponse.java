// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class AmountlimitsAntdigitalWebttsDacTransactionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 入金最大金额
    @NameInMap("deposit_max_quota")
    public String depositMaxQuota;

    // 入金最小金额
    @NameInMap("deposit_min_quota")
    public String depositMinQuota;

    // 出金最大金额
    @NameInMap("withdraw_max_quota")
    public String withdrawMaxQuota;

    // 出金最小金额
    @NameInMap("withdraw_min_quota")
    public String withdrawMinQuota;

    public static AmountlimitsAntdigitalWebttsDacTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        AmountlimitsAntdigitalWebttsDacTransactionResponse self = new AmountlimitsAntdigitalWebttsDacTransactionResponse();
        return TeaModel.build(map, self);
    }

    public AmountlimitsAntdigitalWebttsDacTransactionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionResponse setDepositMaxQuota(String depositMaxQuota) {
        this.depositMaxQuota = depositMaxQuota;
        return this;
    }
    public String getDepositMaxQuota() {
        return this.depositMaxQuota;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionResponse setDepositMinQuota(String depositMinQuota) {
        this.depositMinQuota = depositMinQuota;
        return this;
    }
    public String getDepositMinQuota() {
        return this.depositMinQuota;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionResponse setWithdrawMaxQuota(String withdrawMaxQuota) {
        this.withdrawMaxQuota = withdrawMaxQuota;
        return this;
    }
    public String getWithdrawMaxQuota() {
        return this.withdrawMaxQuota;
    }

    public AmountlimitsAntdigitalWebttsDacTransactionResponse setWithdrawMinQuota(String withdrawMinQuota) {
        this.withdrawMinQuota = withdrawMinQuota;
        return this;
    }
    public String getWithdrawMinQuota() {
        return this.withdrawMinQuota;
    }

}
