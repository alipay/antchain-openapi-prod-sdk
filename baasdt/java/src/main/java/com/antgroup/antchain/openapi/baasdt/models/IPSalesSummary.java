// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPSalesSummary extends TeaModel {
    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 销售数据ID
    @NameInMap("sales_biz_id")
    @Validation(required = true)
    public String salesBizId;

    // 总销售量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 数量校正
    @NameInMap("correct_amount")
    @Validation(required = true)
    public Long correctAmount;

    // 实际总销售量
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 总销售额
    @NameInMap("sales")
    @Validation(required = true)
    public String sales;

    // 金额校正
    @NameInMap("correct_sales")
    @Validation(required = true)
    public String correctSales;

    // 实际总销售金额
    @NameInMap("total_sales")
    @Validation(required = true)
    public String totalSales;

    // 最后操作时间
    @NameInMap("operator_time")
    @Validation(required = true)
    public Long operatorTime;

    // 销售数据状态：1初始化，2商户确认，3版权方确认，4账单生成，5商户已校正，6版权方拒绝
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 销售数据最终是否需要生成支付账单
    @NameInMap("need_to_pay")
    @Validation(required = true)
    public Boolean needToPay;

    // 备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 统计周期开始时间（毫秒时间戳）
    @NameInMap("settlement_begin_time")
    @Validation(required = true)
    public Long settlementBeginTime;

    // 统计周期结束时间（毫秒时间戳）
    @NameInMap("settlement_end_time")
    @Validation(required = true)
    public Long settlementEndTime;

    public static IPSalesSummary build(java.util.Map<String, ?> map) throws Exception {
        IPSalesSummary self = new IPSalesSummary();
        return TeaModel.build(map, self);
    }

    public IPSalesSummary setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public IPSalesSummary setSalesBizId(String salesBizId) {
        this.salesBizId = salesBizId;
        return this;
    }
    public String getSalesBizId() {
        return this.salesBizId;
    }

    public IPSalesSummary setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public IPSalesSummary setCorrectAmount(Long correctAmount) {
        this.correctAmount = correctAmount;
        return this;
    }
    public Long getCorrectAmount() {
        return this.correctAmount;
    }

    public IPSalesSummary setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public IPSalesSummary setSales(String sales) {
        this.sales = sales;
        return this;
    }
    public String getSales() {
        return this.sales;
    }

    public IPSalesSummary setCorrectSales(String correctSales) {
        this.correctSales = correctSales;
        return this;
    }
    public String getCorrectSales() {
        return this.correctSales;
    }

    public IPSalesSummary setTotalSales(String totalSales) {
        this.totalSales = totalSales;
        return this;
    }
    public String getTotalSales() {
        return this.totalSales;
    }

    public IPSalesSummary setOperatorTime(Long operatorTime) {
        this.operatorTime = operatorTime;
        return this;
    }
    public Long getOperatorTime() {
        return this.operatorTime;
    }

    public IPSalesSummary setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IPSalesSummary setNeedToPay(Boolean needToPay) {
        this.needToPay = needToPay;
        return this;
    }
    public Boolean getNeedToPay() {
        return this.needToPay;
    }

    public IPSalesSummary setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public IPSalesSummary setSettlementBeginTime(Long settlementBeginTime) {
        this.settlementBeginTime = settlementBeginTime;
        return this;
    }
    public Long getSettlementBeginTime() {
        return this.settlementBeginTime;
    }

    public IPSalesSummary setSettlementEndTime(Long settlementEndTime) {
        this.settlementEndTime = settlementEndTime;
        return this;
    }
    public Long getSettlementEndTime() {
        return this.settlementEndTime;
    }

}
