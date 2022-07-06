// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPBill extends TeaModel {
    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 账单ID
    @NameInMap("ip_bill_id")
    @Validation(required = true)
    public String ipBillId;

    // 上传销售数据时的bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 收款方
    @NameInMap("seller_id")
    @Validation(required = true)
    public String sellerId;

    // 付款方
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 账单状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 账单创建时间，时间戳（毫秒）
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 交易类型：0套餐交易，1定向授权
    @NameInMap("trade_type")
    @Validation(required = true)
    public Long tradeType;

    // 支付链接
    @NameInMap("pay_url")
    @Validation(required = true)
    public String payUrl;

    // 账单金额，支付金额
    @NameInMap("bill_pay_amount")
    @Validation(required = true)
    public String billPayAmount;

    // 销售金额
    @NameInMap("bill_sales")
    @Validation(required = true)
    public String billSales;

    // 账单周期开始时间，时间戳（毫秒）
    @NameInMap("cycle_start_time")
    @Validation(required = true)
    public Long cycleStartTime;

    // 账单周期结束时间，时间戳（毫秒）
    @NameInMap("cycle_end_time")
    @Validation(required = true)
    public Long cycleEndTime;

    // 账单支付时间戳
    @NameInMap("pay_time")
    public Long payTime;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    public static IPBill build(java.util.Map<String, ?> map) throws Exception {
        IPBill self = new IPBill();
        return TeaModel.build(map, self);
    }

    public IPBill setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public IPBill setIpBillId(String ipBillId) {
        this.ipBillId = ipBillId;
        return this;
    }
    public String getIpBillId() {
        return this.ipBillId;
    }

    public IPBill setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public IPBill setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public IPBill setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public IPBill setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IPBill setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public IPBill setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public IPBill setTradeType(Long tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public Long getTradeType() {
        return this.tradeType;
    }

    public IPBill setPayUrl(String payUrl) {
        this.payUrl = payUrl;
        return this;
    }
    public String getPayUrl() {
        return this.payUrl;
    }

    public IPBill setBillPayAmount(String billPayAmount) {
        this.billPayAmount = billPayAmount;
        return this;
    }
    public String getBillPayAmount() {
        return this.billPayAmount;
    }

    public IPBill setBillSales(String billSales) {
        this.billSales = billSales;
        return this;
    }
    public String getBillSales() {
        return this.billSales;
    }

    public IPBill setCycleStartTime(Long cycleStartTime) {
        this.cycleStartTime = cycleStartTime;
        return this;
    }
    public Long getCycleStartTime() {
        return this.cycleStartTime;
    }

    public IPBill setCycleEndTime(Long cycleEndTime) {
        this.cycleEndTime = cycleEndTime;
        return this;
    }
    public Long getCycleEndTime() {
        return this.cycleEndTime;
    }

    public IPBill setPayTime(Long payTime) {
        this.payTime = payTime;
        return this;
    }
    public Long getPayTime() {
        return this.payTime;
    }

    public IPBill setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
