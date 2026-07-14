// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class RcptDetailVO extends TeaModel {
    // 合同号
    /**
     * <strong>example:</strong>
     * <p>2088720671581149-ZNHYFM01222234</p>
     */
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // OU
    /**
     * <strong>example:</strong>
     * <p>ZL6</p>
     */
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 客户名称
    /**
     * <strong>example:</strong>
     * <p>测试客户</p>
     */
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 单据唯一号
    /**
     * <strong>example:</strong>
     * <p>20230928107305000028710015937380</p>
     */
    @NameInMap("receipt_no")
    @Validation(required = true)
    public String receiptNo;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>156</p>
     */
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    // 税率
    /**
     * <strong>example:</strong>
     * <p>0.06</p>
     */
    @NameInMap("tax")
    public String tax;

    // 商品CODE
    /**
     * <strong>example:</strong>
     * <p>SQBRFSZL601262688</p>
     */
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 开票模式，01：先款后票、02：先票后款
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    // 单据可开票总金额
    /**
     * <strong>example:</strong>
     * <p>13.45</p>
     */
    @NameInMap("total_amt")
    @Validation(required = true)
    public String totalAmt;

    // 已开票金额
    /**
     * <strong>example:</strong>
     * <p>2.23</p>
     */
    @NameInMap("inved_amt")
    @Validation(required = true)
    public String invedAmt;

    // 剩余可开票金额
    /**
     * <strong>example:</strong>
     * <p>234.99</p>
     */
    @NameInMap("remain_amt")
    @Validation(required = true)
    public String remainAmt;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>商品名称</p>
     */
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    public static RcptDetailVO build(java.util.Map<String, ?> map) throws Exception {
        RcptDetailVO self = new RcptDetailVO();
        return TeaModel.build(map, self);
    }

    public RcptDetailVO setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public RcptDetailVO setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public RcptDetailVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RcptDetailVO setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public RcptDetailVO setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

    public RcptDetailVO setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public RcptDetailVO setTax(String tax) {
        this.tax = tax;
        return this;
    }
    public String getTax() {
        return this.tax;
    }

    public RcptDetailVO setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public RcptDetailVO setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public RcptDetailVO setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
        return this;
    }
    public String getTotalAmt() {
        return this.totalAmt;
    }

    public RcptDetailVO setInvedAmt(String invedAmt) {
        this.invedAmt = invedAmt;
        return this;
    }
    public String getInvedAmt() {
        return this.invedAmt;
    }

    public RcptDetailVO setRemainAmt(String remainAmt) {
        this.remainAmt = remainAmt;
        return this;
    }
    public String getRemainAmt() {
        return this.remainAmt;
    }

    public RcptDetailVO setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

}
