// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PayBillTariffParam extends TeaModel {
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * <strong>example:</strong>
     * <p>UPDATE、DELETE、INSERT</p>
     */
    @NameInMap("action")
    public String action;

    // 账单金额 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("bill_amount")
    public String billAmount;

    // 应付账单、应付资费项 多对多code
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("pay_bill_tariff_code")
    @Validation(required = true)
    public String payBillTariffCode;

    //  资费项金额 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("pay_tariff_amount")
    public String payTariffAmount;

    // 应付资费项编号 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("pay_tariff_code")
    public String payTariffCode;

    public static PayBillTariffParam build(java.util.Map<String, ?> map) throws Exception {
        PayBillTariffParam self = new PayBillTariffParam();
        return TeaModel.build(map, self);
    }

    public PayBillTariffParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public PayBillTariffParam setBillAmount(String billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public String getBillAmount() {
        return this.billAmount;
    }

    public PayBillTariffParam setPayBillTariffCode(String payBillTariffCode) {
        this.payBillTariffCode = payBillTariffCode;
        return this;
    }
    public String getPayBillTariffCode() {
        return this.payBillTariffCode;
    }

    public PayBillTariffParam setPayTariffAmount(String payTariffAmount) {
        this.payTariffAmount = payTariffAmount;
        return this;
    }
    public String getPayTariffAmount() {
        return this.payTariffAmount;
    }

    public PayBillTariffParam setPayTariffCode(String payTariffCode) {
        this.payTariffCode = payTariffCode;
        return this;
    }
    public String getPayTariffCode() {
        return this.payTariffCode;
    }

}
