// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseRepaymentInfo extends TeaModel {
    // 融资租赁还款流水
    /**
     * <strong>example:</strong>
     * <p>20211231123000123</p>
     */
    @NameInMap("repayment_unique_id")
    @Validation(required = true)
    public String repaymentUniqueId;

    // 还款批次
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("return_index")
    @Validation(required = true)
    public String returnIndex;

    // 还款日期
    /**
     * <strong>example:</strong>
     * <p>2019-07-31 12:00:00</p>
     */
    @NameInMap("return_time")
    @Validation(required = true)
    public String returnTime;

    // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("return_money")
    @Validation(required = true)
    public Long returnMoney;

    // 还款结果状态,1.成功 2.失败
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("return_status")
    @Validation(required = true)
    public Long returnStatus;

    // 还款结果简要描述,长度不超过256
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("return_description")
    @Validation(required = true)
    public String returnDescription;

    // 还款来源,1.共管账号，2.网商清分
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("source")
    @Validation(required = true)
    public Long source;

    // 剩余应还期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("remain_return_term")
    @Validation(required = true)
    public Long remainReturnTerm;

    // 本期剩余应还金额，精确到毫厘，即123400表示12.34元
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("remain_return_money")
    @Validation(required = true)
    public Long remainReturnMoney;

    // 逾期状态,0为未逾期，1表示逾期
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("overdue_status")
    @Validation(required = true)
    public Long overdueStatus;

    // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("overdue_rate")
    @Validation(required = true)
    public Long overdueRate;

    // 逾期天数,支用到期日开始计算
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("overdue_day")
    @Validation(required = true)
    public Long overdueDay;

    // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("overdue_money")
    @Validation(required = true)
    public Long overdueMoney;

    public static LeaseRepaymentInfo build(java.util.Map<String, ?> map) throws Exception {
        LeaseRepaymentInfo self = new LeaseRepaymentInfo();
        return TeaModel.build(map, self);
    }

    public LeaseRepaymentInfo setRepaymentUniqueId(String repaymentUniqueId) {
        this.repaymentUniqueId = repaymentUniqueId;
        return this;
    }
    public String getRepaymentUniqueId() {
        return this.repaymentUniqueId;
    }

    public LeaseRepaymentInfo setReturnIndex(String returnIndex) {
        this.returnIndex = returnIndex;
        return this;
    }
    public String getReturnIndex() {
        return this.returnIndex;
    }

    public LeaseRepaymentInfo setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public LeaseRepaymentInfo setReturnMoney(Long returnMoney) {
        this.returnMoney = returnMoney;
        return this;
    }
    public Long getReturnMoney() {
        return this.returnMoney;
    }

    public LeaseRepaymentInfo setReturnStatus(Long returnStatus) {
        this.returnStatus = returnStatus;
        return this;
    }
    public Long getReturnStatus() {
        return this.returnStatus;
    }

    public LeaseRepaymentInfo setReturnDescription(String returnDescription) {
        this.returnDescription = returnDescription;
        return this;
    }
    public String getReturnDescription() {
        return this.returnDescription;
    }

    public LeaseRepaymentInfo setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public LeaseRepaymentInfo setRemainReturnTerm(Long remainReturnTerm) {
        this.remainReturnTerm = remainReturnTerm;
        return this;
    }
    public Long getRemainReturnTerm() {
        return this.remainReturnTerm;
    }

    public LeaseRepaymentInfo setRemainReturnMoney(Long remainReturnMoney) {
        this.remainReturnMoney = remainReturnMoney;
        return this;
    }
    public Long getRemainReturnMoney() {
        return this.remainReturnMoney;
    }

    public LeaseRepaymentInfo setOverdueStatus(Long overdueStatus) {
        this.overdueStatus = overdueStatus;
        return this;
    }
    public Long getOverdueStatus() {
        return this.overdueStatus;
    }

    public LeaseRepaymentInfo setOverdueRate(Long overdueRate) {
        this.overdueRate = overdueRate;
        return this;
    }
    public Long getOverdueRate() {
        return this.overdueRate;
    }

    public LeaseRepaymentInfo setOverdueDay(Long overdueDay) {
        this.overdueDay = overdueDay;
        return this;
    }
    public Long getOverdueDay() {
        return this.overdueDay;
    }

    public LeaseRepaymentInfo setOverdueMoney(Long overdueMoney) {
        this.overdueMoney = overdueMoney;
        return this;
    }
    public Long getOverdueMoney() {
        return this.overdueMoney;
    }

}
