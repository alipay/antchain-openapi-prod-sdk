// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class SummaryBillVO extends TeaModel {
    // 账单唯一标识
    /**
     * <strong>example:</strong>
     * <p>2a7391874f5e7ac4c70586b53cca19740de2f93c62235d7fb5c959d10ab34884</p>
     */
    @NameInMap("summary_unique_id")
    @Validation(required = true)
    public String summaryUniqueId;

    // 合同ID
    /**
     * <strong>example:</strong>
     * <p>2088000232233636-ZNHYFM01222234</p>
     */
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 实例ID
    /**
     * <strong>example:</strong>
     * <p>A0ZNHYFM01222234WXPXDPIG1ZXEMO6MWG8</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 商品code, L5
    /**
     * <strong>example:</strong>
     * <p>ZNHYFM01222234</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 销售code
    /**
     * <strong>example:</strong>
     * <p>ZZIAFSZX501268292</p>
     */
    @NameInMap("sale_code")
    @Validation(required = true)
    public String saleCode;

    // 账期
    /**
     * <strong>example:</strong>
     * <p>202506</p>
     */
    @NameInMap("bill_month")
    @Validation(required = true)
    public String billMonth;

    // 账单应收日期
    /**
     * <strong>example:</strong>
     * <p>2025-06-11T10:10:00Z</p>
     */
    @NameInMap("gmt_receive")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtReceive;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>208812321321312</p>
     */
    @NameInMap("settle_user_id")
    @Validation(required = true)
    public String settleUserId;

    // 最终账单金额，单位分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("final_bill_amount")
    @Validation(required = true)
    public String finalBillAmount;

    // 账单金额，分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("bill_amount")
    @Validation(required = true)
    public String billAmount;

    // 调账金额，分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("adjust_amoumt")
    @Validation(required = true)
    public String adjustAmoumt;

    // 已收金额，分
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("received_amount")
    @Validation(required = true)
    public String receivedAmount;

    // 待付金额，分
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("payable_amount")
    @Validation(required = true)
    public String payableAmount;

    // 币种，840-美元  
    /**
     * <strong>example:</strong>
     * <p>840</p>
     */
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    // 核销状态
    // ● UN_WRITE_OFF - 未核销
    // ● PARTIAL_WRITE_OFF - 部分核销
    // ● ALL_WRITE_OFF - 全部核销
    /**
     * <strong>example:</strong>
     * <p>ALL_WRITE_OFF</p>
     */
    @NameInMap("write_off_status")
    @Validation(required = true)
    public String writeOffStatus;

    // 折扣金额
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("discount_amount")
    @Validation(required = true)
    public String discountAmount;

    // 优惠券抵扣金额
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("coupon_amount")
    @Validation(required = true)
    public String couponAmount;

    public static SummaryBillVO build(java.util.Map<String, ?> map) throws Exception {
        SummaryBillVO self = new SummaryBillVO();
        return TeaModel.build(map, self);
    }

    public SummaryBillVO setSummaryUniqueId(String summaryUniqueId) {
        this.summaryUniqueId = summaryUniqueId;
        return this;
    }
    public String getSummaryUniqueId() {
        return this.summaryUniqueId;
    }

    public SummaryBillVO setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public SummaryBillVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SummaryBillVO setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SummaryBillVO setSaleCode(String saleCode) {
        this.saleCode = saleCode;
        return this;
    }
    public String getSaleCode() {
        return this.saleCode;
    }

    public SummaryBillVO setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public SummaryBillVO setGmtReceive(String gmtReceive) {
        this.gmtReceive = gmtReceive;
        return this;
    }
    public String getGmtReceive() {
        return this.gmtReceive;
    }

    public SummaryBillVO setSettleUserId(String settleUserId) {
        this.settleUserId = settleUserId;
        return this;
    }
    public String getSettleUserId() {
        return this.settleUserId;
    }

    public SummaryBillVO setFinalBillAmount(String finalBillAmount) {
        this.finalBillAmount = finalBillAmount;
        return this;
    }
    public String getFinalBillAmount() {
        return this.finalBillAmount;
    }

    public SummaryBillVO setBillAmount(String billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public String getBillAmount() {
        return this.billAmount;
    }

    public SummaryBillVO setAdjustAmoumt(String adjustAmoumt) {
        this.adjustAmoumt = adjustAmoumt;
        return this;
    }
    public String getAdjustAmoumt() {
        return this.adjustAmoumt;
    }

    public SummaryBillVO setReceivedAmount(String receivedAmount) {
        this.receivedAmount = receivedAmount;
        return this;
    }
    public String getReceivedAmount() {
        return this.receivedAmount;
    }

    public SummaryBillVO setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
        return this;
    }
    public String getPayableAmount() {
        return this.payableAmount;
    }

    public SummaryBillVO setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public SummaryBillVO setWriteOffStatus(String writeOffStatus) {
        this.writeOffStatus = writeOffStatus;
        return this;
    }
    public String getWriteOffStatus() {
        return this.writeOffStatus;
    }

    public SummaryBillVO setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    public String getDiscountAmount() {
        return this.discountAmount;
    }

    public SummaryBillVO setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }
    public String getCouponAmount() {
        return this.couponAmount;
    }

}
