// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class BillItemVO extends TeaModel {
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
     * <p>Alpha Capital LtdY</p>
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
     * <p>USD</p>
     */
    @NameInMap("bill_currency")
    @Validation(required = true)
    public String billCurrency;

    // Custody 费合计（法币金额字符串，保留18位小数）
    /**
     * <strong>example:</strong>
     * <p>4800.000000000000000000</p>
     */
    @NameInMap("custody_fee_total")
    @Validation(required = true)
    public String custodyFeeTotal;

    // Transaction 费合计（法币金额字符串，保留18位小数）
    /**
     * <strong>example:</strong>
     * <p>992.500000000000000000</p>
     */
    @NameInMap("transaction_fee_total")
    @Validation(required = true)
    public String transactionFeeTotal;

    // 参数名	参数类型	是否必有	说明
    // billNo	String	Y	账单号
    // cifId	String	Y	CIF ID
    // cifName	String	Y	机构名称
    // billMonth	String	Y	账期（YYYY-MM）
    // billCurrency	String	Y	结算币种，如 USD / HKD
    // custodyFeeTotal	String	Y	Custody 费合计（法币金额字符串，保留8位小数）
    // transactionFeeTotal	String	Y	Transaction 费合计（法币金额字符串，保留8位小数）
    // totalAmount	String	Y	总费用（法币金额字符串，保留18位小数）
    /**
     * <strong>example:</strong>
     * <p>5792.500000000000000000</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    public static BillItemVO build(java.util.Map<String, ?> map) throws Exception {
        BillItemVO self = new BillItemVO();
        return TeaModel.build(map, self);
    }

    public BillItemVO setBillNo(String billNo) {
        this.billNo = billNo;
        return this;
    }
    public String getBillNo() {
        return this.billNo;
    }

    public BillItemVO setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public BillItemVO setCifName(String cifName) {
        this.cifName = cifName;
        return this;
    }
    public String getCifName() {
        return this.cifName;
    }

    public BillItemVO setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public BillItemVO setBillCurrency(String billCurrency) {
        this.billCurrency = billCurrency;
        return this;
    }
    public String getBillCurrency() {
        return this.billCurrency;
    }

    public BillItemVO setCustodyFeeTotal(String custodyFeeTotal) {
        this.custodyFeeTotal = custodyFeeTotal;
        return this;
    }
    public String getCustodyFeeTotal() {
        return this.custodyFeeTotal;
    }

    public BillItemVO setTransactionFeeTotal(String transactionFeeTotal) {
        this.transactionFeeTotal = transactionFeeTotal;
        return this;
    }
    public String getTransactionFeeTotal() {
        return this.transactionFeeTotal;
    }

    public BillItemVO setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

}
