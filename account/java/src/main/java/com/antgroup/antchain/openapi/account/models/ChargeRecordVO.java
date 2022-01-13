// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class ChargeRecordVO extends TeaModel {
    // 充值凭证号
    @NameInMap("voucher_no")
    @Validation(required = true)
    public String voucherNo;

    // 外部单据号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 充值时间
    @NameInMap("recharge_time")
    @Validation(required = true)
    public String rechargeTime;

    // 支付状态（INIT-创建订单/SUCCESS-充值成功/FAIL-充值失败）
    @NameInMap("recharge_status")
    @Validation(required = true)
    public String rechargeStatus;

    // 金额
    @NameInMap("multi_currency_money_open_api")
    @Validation(required = true)
    public MultiCurrencyMoneyOpenApi multiCurrencyMoneyOpenApi;

    public static ChargeRecordVO build(java.util.Map<String, ?> map) throws Exception {
        ChargeRecordVO self = new ChargeRecordVO();
        return TeaModel.build(map, self);
    }

    public ChargeRecordVO setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
        return this;
    }
    public String getVoucherNo() {
        return this.voucherNo;
    }

    public ChargeRecordVO setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public ChargeRecordVO setRechargeTime(String rechargeTime) {
        this.rechargeTime = rechargeTime;
        return this;
    }
    public String getRechargeTime() {
        return this.rechargeTime;
    }

    public ChargeRecordVO setRechargeStatus(String rechargeStatus) {
        this.rechargeStatus = rechargeStatus;
        return this;
    }
    public String getRechargeStatus() {
        return this.rechargeStatus;
    }

    public ChargeRecordVO setMultiCurrencyMoneyOpenApi(MultiCurrencyMoneyOpenApi multiCurrencyMoneyOpenApi) {
        this.multiCurrencyMoneyOpenApi = multiCurrencyMoneyOpenApi;
        return this;
    }
    public MultiCurrencyMoneyOpenApi getMultiCurrencyMoneyOpenApi() {
        return this.multiCurrencyMoneyOpenApi;
    }

}
