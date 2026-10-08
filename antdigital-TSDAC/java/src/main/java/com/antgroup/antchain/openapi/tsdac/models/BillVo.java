// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class BillVo extends TeaModel {
    // 账单号
    /**
     * <strong>example:</strong>
     * <p>BILL-CIF001-202604</p>
     */
    @NameInMap("bill_no")
    @Validation(required = true)
    public String billNo;

    // CIF ID
    /**
     * <strong>example:</strong>
     * <p>CIF001</p>
     */
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 机构名称
    /**
     * <strong>example:</strong>
     * <p>Alpha Capital Ltd</p>
     */
    @NameInMap("cif_name")
    @Validation(required = true)
    public String cifName;

    // 账期（YYYY-MM）
    /**
     * <strong>example:</strong>
     * <p>2026-04</p>
     */
    @NameInMap("bill_month")
    @Validation(required = true)
    public String billMonth;

    // 结算币种，如 USD / HKD
    /**
     * <strong>example:</strong>
     * <p>HKD</p>
     */
    @NameInMap("bill_currency")
    @Validation(required = true)
    public String billCurrency;

    // Custody 费合计（法币金额字符串，保留8位小数）
    /**
     * <strong>example:</strong>
     * <p>4800.00000000</p>
     */
    @NameInMap("custody_fee_total")
    @Validation(required = true)
    public String custodyFeeTotal;

    // Transaction 费合计（法币金额字符串，保留8位小数）
    /**
     * <strong>example:</strong>
     * <p>992.50000000</p>
     */
    @NameInMap("transaction_fee_total")
    @Validation(required = true)
    public String transactionFeeTotal;

    // 总费用（法币金额字符串，保留8位小数）
    /**
     * <strong>example:</strong>
     * <p>5792.50000000</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    public static BillVo build(java.util.Map<String, ?> map) throws Exception {
        BillVo self = new BillVo();
        return TeaModel.build(map, self);
    }

    public BillVo setBillNo(String billNo) {
        this.billNo = billNo;
        return this;
    }
    public String getBillNo() {
        return this.billNo;
    }

    public BillVo setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public BillVo setCifName(String cifName) {
        this.cifName = cifName;
        return this;
    }
    public String getCifName() {
        return this.cifName;
    }

    public BillVo setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public BillVo setBillCurrency(String billCurrency) {
        this.billCurrency = billCurrency;
        return this;
    }
    public String getBillCurrency() {
        return this.billCurrency;
    }

    public BillVo setCustodyFeeTotal(String custodyFeeTotal) {
        this.custodyFeeTotal = custodyFeeTotal;
        return this;
    }
    public String getCustodyFeeTotal() {
        return this.custodyFeeTotal;
    }

    public BillVo setTransactionFeeTotal(String transactionFeeTotal) {
        this.transactionFeeTotal = transactionFeeTotal;
        return this;
    }
    public String getTransactionFeeTotal() {
        return this.transactionFeeTotal;
    }

    public BillVo setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

}
