// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class FundAssertReport extends TeaModel {
    // 投放月份 (整月)
    /**
     * <strong>example:</strong>
     * <p>2024-12</p>
     */
    @NameInMap("delivery_month")
    @Validation(required = true)
    public String deliveryMonth;

    // 账单金额
    /**
     * <strong>example:</strong>
     * <p>1000（单位分）</p>
     */
    @NameInMap("total_bill_amount")
    @Validation(required = true)
    public Long totalBillAmount;

    // 平均期限
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("average_term")
    @Validation(required = true)
    public String averageTerm;

    // 状态为取消的账单金额
    /**
     * <strong>example:</strong>
     * <p>1000（单位分）</p>
     */
    @NameInMap("cancelled_bill_amount")
    @Validation(required = true)
    public Long cancelledBillAmount;

    // Y期的订单的账单金额
    /**
     * <strong>example:</strong>
     * <p>1000（单位分）</p>
     */
    @NameInMap("total_bill_amount_y_period")
    @Validation(required = true)
    public Long totalBillAmountYPeriod;

    // 已到Y期订单中Y期平均期限(y期订单的平均期限)
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("average_term_y_period")
    @Validation(required = true)
    public String averageTermYPeriod;

    // Y期的订单中状态为取消的账单金额
    /**
     * <strong>example:</strong>
     * <p>1000（单位分）</p>
     */
    @NameInMap("cancelled_bill_amount_y_period")
    @Validation(required = true)
    public Long cancelledBillAmountYPeriod;

    // 状态为逾期1天及以上的账单金额
    /**
     * <strong>example:</strong>
     * <p>1000(单位分)</p>
     */
    @NameInMap("bill_amount_overdue_by1day_or_more")
    @Validation(required = true)
    public String billAmountOverdueBy1dayOrMore;

    // Y期的订单中状态为逾期1天及以上的账单金额
    /**
     * <strong>example:</strong>
     * <p>1000(单位分)</p>
     */
    @NameInMap("bill_amount_overdue_by1day_or_more_y_period")
    @Validation(required = true)
    public String billAmountOverdueBy1dayOrMoreYPeriod;

    // 状态为逾期30天及以上的账单金额
    /**
     * <strong>example:</strong>
     * <p>1000(单位分)</p>
     */
    @NameInMap("bill_amount_overdue_by30_days_or_more")
    @Validation(required = true)
    public String billAmountOverdueBy30DaysOrMore;

    // Y期的订单中状态为逾期30天及以上的账单金额
    /**
     * <strong>example:</strong>
     * <p>1000(单位分)</p>
     */
    @NameInMap("bill_amount_overdue_by30_days_or_more_y_period")
    @Validation(required = true)
    public String billAmountOverdueBy30DaysOrMoreYPeriod;

    public static FundAssertReport build(java.util.Map<String, ?> map) throws Exception {
        FundAssertReport self = new FundAssertReport();
        return TeaModel.build(map, self);
    }

    public FundAssertReport setDeliveryMonth(String deliveryMonth) {
        this.deliveryMonth = deliveryMonth;
        return this;
    }
    public String getDeliveryMonth() {
        return this.deliveryMonth;
    }

    public FundAssertReport setTotalBillAmount(Long totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
        return this;
    }
    public Long getTotalBillAmount() {
        return this.totalBillAmount;
    }

    public FundAssertReport setAverageTerm(String averageTerm) {
        this.averageTerm = averageTerm;
        return this;
    }
    public String getAverageTerm() {
        return this.averageTerm;
    }

    public FundAssertReport setCancelledBillAmount(Long cancelledBillAmount) {
        this.cancelledBillAmount = cancelledBillAmount;
        return this;
    }
    public Long getCancelledBillAmount() {
        return this.cancelledBillAmount;
    }

    public FundAssertReport setTotalBillAmountYPeriod(Long totalBillAmountYPeriod) {
        this.totalBillAmountYPeriod = totalBillAmountYPeriod;
        return this;
    }
    public Long getTotalBillAmountYPeriod() {
        return this.totalBillAmountYPeriod;
    }

    public FundAssertReport setAverageTermYPeriod(String averageTermYPeriod) {
        this.averageTermYPeriod = averageTermYPeriod;
        return this;
    }
    public String getAverageTermYPeriod() {
        return this.averageTermYPeriod;
    }

    public FundAssertReport setCancelledBillAmountYPeriod(Long cancelledBillAmountYPeriod) {
        this.cancelledBillAmountYPeriod = cancelledBillAmountYPeriod;
        return this;
    }
    public Long getCancelledBillAmountYPeriod() {
        return this.cancelledBillAmountYPeriod;
    }

    public FundAssertReport setBillAmountOverdueBy1dayOrMore(String billAmountOverdueBy1dayOrMore) {
        this.billAmountOverdueBy1dayOrMore = billAmountOverdueBy1dayOrMore;
        return this;
    }
    public String getBillAmountOverdueBy1dayOrMore() {
        return this.billAmountOverdueBy1dayOrMore;
    }

    public FundAssertReport setBillAmountOverdueBy1dayOrMoreYPeriod(String billAmountOverdueBy1dayOrMoreYPeriod) {
        this.billAmountOverdueBy1dayOrMoreYPeriod = billAmountOverdueBy1dayOrMoreYPeriod;
        return this;
    }
    public String getBillAmountOverdueBy1dayOrMoreYPeriod() {
        return this.billAmountOverdueBy1dayOrMoreYPeriod;
    }

    public FundAssertReport setBillAmountOverdueBy30DaysOrMore(String billAmountOverdueBy30DaysOrMore) {
        this.billAmountOverdueBy30DaysOrMore = billAmountOverdueBy30DaysOrMore;
        return this;
    }
    public String getBillAmountOverdueBy30DaysOrMore() {
        return this.billAmountOverdueBy30DaysOrMore;
    }

    public FundAssertReport setBillAmountOverdueBy30DaysOrMoreYPeriod(String billAmountOverdueBy30DaysOrMoreYPeriod) {
        this.billAmountOverdueBy30DaysOrMoreYPeriod = billAmountOverdueBy30DaysOrMoreYPeriod;
        return this;
    }
    public String getBillAmountOverdueBy30DaysOrMoreYPeriod() {
        return this.billAmountOverdueBy30DaysOrMoreYPeriod;
    }

}
