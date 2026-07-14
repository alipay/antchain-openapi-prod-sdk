// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class IntlRcptDetailItem extends TeaModel {
    // 可开票单据号
    /**
     * <strong>example:</strong>
     * <p>33345454</p>
     */
    @NameInMap("receipt_no")
    @Validation(required = true)
    public String receiptNo;

    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>20882838383</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 合同号或订单号
    /**
     * <strong>example:</strong>
     * <p>3333</p>
     */
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 计费类型
    /**
     * <strong>example:</strong>
     * <p>PREPAY/AFTER_PAY</p>
     */
    @NameInMap("charge_type")
    @Validation(required = true)
    public String chargeType;

    // 合同商品总金额
    /**
     * <strong>example:</strong>
     * <p>34.99</p>
     */
    @NameInMap("rcpt_contract_amt")
    @Validation(required = true)
    public String rcptContractAmt;

    // 合同商品已开票金额
    /**
     * <strong>example:</strong>
     * <p>22.12</p>
     */
    @NameInMap("rept_inved_amt")
    @Validation(required = true)
    public String reptInvedAmt;

    // 合同商品剩余可开票金额
    /**
     * <strong>example:</strong>
     * <p>23.21</p>
     */
    @NameInMap("rcpt_contract_remain_amt")
    @Validation(required = true)
    public String rcptContractRemainAmt;

    // 商品CODE
    /**
     * <strong>example:</strong>
     * <p>abd</p>
     */
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>测试商品</p>
     */
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // ou
    /**
     * <strong>example:</strong>
     * <p>Z37</p>
     */
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>840</p>
     */
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    public static IntlRcptDetailItem build(java.util.Map<String, ?> map) throws Exception {
        IntlRcptDetailItem self = new IntlRcptDetailItem();
        return TeaModel.build(map, self);
    }

    public IntlRcptDetailItem setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

    public IntlRcptDetailItem setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public IntlRcptDetailItem setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public IntlRcptDetailItem setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public IntlRcptDetailItem setRcptContractAmt(String rcptContractAmt) {
        this.rcptContractAmt = rcptContractAmt;
        return this;
    }
    public String getRcptContractAmt() {
        return this.rcptContractAmt;
    }

    public IntlRcptDetailItem setReptInvedAmt(String reptInvedAmt) {
        this.reptInvedAmt = reptInvedAmt;
        return this;
    }
    public String getReptInvedAmt() {
        return this.reptInvedAmt;
    }

    public IntlRcptDetailItem setRcptContractRemainAmt(String rcptContractRemainAmt) {
        this.rcptContractRemainAmt = rcptContractRemainAmt;
        return this;
    }
    public String getRcptContractRemainAmt() {
        return this.rcptContractRemainAmt;
    }

    public IntlRcptDetailItem setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public IntlRcptDetailItem setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public IntlRcptDetailItem setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public IntlRcptDetailItem setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

}
