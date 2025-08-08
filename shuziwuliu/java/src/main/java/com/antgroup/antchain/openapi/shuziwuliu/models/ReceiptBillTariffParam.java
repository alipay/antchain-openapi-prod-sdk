// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ReceiptBillTariffParam extends TeaModel {
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * <strong>example:</strong>
     * <p>UPDATE、DELETE、INSERT</p>
     */
    @NameInMap("action")
    public String action;

    //  账单金额 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("bill_amount")
    public String billAmount;

    // 应收账单 、应收资费项 多对多关联code 
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_bill_tariff_code")
    @Validation(required = true)
    public String receiptBillTariffCode;

    // 资费项金额 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_tariff_amount")
    public String receiptTariffAmount;

    // 应收资费项编号 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_tariff_code")
    public String receiptTariffCode;

    public static ReceiptBillTariffParam build(java.util.Map<String, ?> map) throws Exception {
        ReceiptBillTariffParam self = new ReceiptBillTariffParam();
        return TeaModel.build(map, self);
    }

    public ReceiptBillTariffParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ReceiptBillTariffParam setBillAmount(String billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public String getBillAmount() {
        return this.billAmount;
    }

    public ReceiptBillTariffParam setReceiptBillTariffCode(String receiptBillTariffCode) {
        this.receiptBillTariffCode = receiptBillTariffCode;
        return this;
    }
    public String getReceiptBillTariffCode() {
        return this.receiptBillTariffCode;
    }

    public ReceiptBillTariffParam setReceiptTariffAmount(String receiptTariffAmount) {
        this.receiptTariffAmount = receiptTariffAmount;
        return this;
    }
    public String getReceiptTariffAmount() {
        return this.receiptTariffAmount;
    }

    public ReceiptBillTariffParam setReceiptTariffCode(String receiptTariffCode) {
        this.receiptTariffCode = receiptTariffCode;
        return this;
    }
    public String getReceiptTariffCode() {
        return this.receiptTariffCode;
    }

}
