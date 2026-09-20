// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class LoanConfirmInfo extends TeaModel {
    // 借款本金
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("loan_prin")
    @Validation(required = true)
    public String loanPrin;

    // 还款方式
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    // 实际年化利率,单位：%，2
    // 位小数
    /**
     * <strong>example:</strong>
     * <p>15.00</p>
     */
    @NameInMap("actual_rate")
    @Validation(required = true)
    public String actualRate;

    // 优惠前年化利率,单位：%，2
    // 位小数
    /**
     * <strong>example:</strong>
     * <p>15.00</p>
     */
    @NameInMap("pre_disc_rate")
    public String preDiscRate;

    // 借款期数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("loan_term")
    @Validation(required = true)
    public String loanTerm;

    // 借款总利息,单位：元，
    // 2 位小数
    /**
     * <strong>example:</strong>
     * <p>213.00</p>
     */
    @NameInMap("total_int")
    public String totalInt;

    // 借款起始日,整笔借据的
    // 开始时间 格
    // 式：yyyy-
    // MM-dd
    /**
     * <strong>example:</strong>
     * <p>1999-01-01</p>
     */
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 借款到期日,格式：yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2000-01-01</p>
     */
    @NameInMap("expire_date")
    @Validation(required = true)
    public String expireDate;

    // 借款总天数，单位：天，不传expire_date时上送
    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("total_days")
    public String totalDays;

    // 还款计划列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("repay_plans")
    @Validation(required = true)
    public java.util.List<RepayPlan> repayPlans;

    // 客户姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("cust_name")
    @Validation(required = true)
    public String custName;

    // 身份证号
    /**
     * <strong>example:</strong>
     * <p>101101200101011234</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 联系电话
    /**
     * <strong>example:</strong>
     * <p>18612341234</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 居住地址
    /**
     * <strong>example:</strong>
     * <p>XX省XX市XX区</p>
     */
    @NameInMap("home_addr")
    @Validation(required = true)
    public String homeAddr;

    // 银行卡号
    /**
     * <strong>example:</strong>
     * <p>8888888888888888888</p>
     */
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 开户行
    /**
     * <strong>example:</strong>
     * <p>中国工商银行</p>
     */
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 银行编码
    /**
     * <strong>example:</strong>
     * <p>ICBC</p>
     */
    @NameInMap("bank_code")
    public String bankCode;

    // 户籍所在地
    /**
     * <strong>example:</strong>
     * <p>XX省XX市XX区</p>
     */
    @NameInMap("cert_addr")
    public String certAddr;

    // 常用地址
    /**
     * <strong>example:</strong>
     * <p>XX省XX市XX区</p>
     */
    @NameInMap("comm_addr")
    public String commAddr;

    // 优惠前还款计划，有优惠时必填
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("disc_plans")
    public java.util.List<RepayPlan> discPlans;

    // 优惠信息，优惠活动说明
    /**
     * <strong>example:</strong>
     * <p>首笔利率 8 折</p>
     */
    @NameInMap("disc_info")
    public String discInfo;

    // 逾期罚息利率，单位 %，2位小数
    /**
     * <strong>example:</strong>
     * <p>15.33</p>
     */
    @NameInMap("overdue_rate")
    public String overdueRate;

    // 挪用罚息利率，单位 %，2位小数
    /**
     * <strong>example:</strong>
     * <p>15.00</p>
     */
    @NameInMap("misuse_rate")
    public String misuseRate;

    // lpr利率，固定一年期,
    // 单位%
    /**
     * <strong>example:</strong>
     * <p>3.50</p>
     */
    @NameInMap("lpr")
    public String lpr;

    // lpr发布时间，格式：yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>1999-01-01</p>
     */
    @NameInMap("lpr_day")
    public String lprDay;

    // 上浮基点，100bp=1%
    /**
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("bp")
    public String bp;

    // 手续费利率，增信服务费年利率，单位 %
    /**
     * <strong>example:</strong>
     * <p>3.12</p>
     */
    @NameInMap("fee_rate")
    public String feeRate;

    // 固收利率，固守年利率，单位 %
    /**
     * <strong>example:</strong>
     * <p>3.12</p>
     */
    @NameInMap("fix_rate")
    public String fixRate;

    // 固收主体，默认：浙江宁银消费金融股份有限公司
    /**
     * <strong>example:</strong>
     * <p>浙江宁 银消费金融 股份有限公 司</p>
     */
    @NameInMap("fix_company")
    public String fixCompany;

    // 融担公司主体,若有多家融担公司，以逗号分隔
    /**
     * <strong>example:</strong>
     * <p>融担公司1，融担公司2</p>
     */
    @NameInMap("fee_company")
    public String feeCompany;

    public static LoanConfirmInfo build(java.util.Map<String, ?> map) throws Exception {
        LoanConfirmInfo self = new LoanConfirmInfo();
        return TeaModel.build(map, self);
    }

    public LoanConfirmInfo setLoanPrin(String loanPrin) {
        this.loanPrin = loanPrin;
        return this;
    }
    public String getLoanPrin() {
        return this.loanPrin;
    }

    public LoanConfirmInfo setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public LoanConfirmInfo setActualRate(String actualRate) {
        this.actualRate = actualRate;
        return this;
    }
    public String getActualRate() {
        return this.actualRate;
    }

    public LoanConfirmInfo setPreDiscRate(String preDiscRate) {
        this.preDiscRate = preDiscRate;
        return this;
    }
    public String getPreDiscRate() {
        return this.preDiscRate;
    }

    public LoanConfirmInfo setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
        return this;
    }
    public String getLoanTerm() {
        return this.loanTerm;
    }

    public LoanConfirmInfo setTotalInt(String totalInt) {
        this.totalInt = totalInt;
        return this;
    }
    public String getTotalInt() {
        return this.totalInt;
    }

    public LoanConfirmInfo setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public LoanConfirmInfo setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public LoanConfirmInfo setTotalDays(String totalDays) {
        this.totalDays = totalDays;
        return this;
    }
    public String getTotalDays() {
        return this.totalDays;
    }

    public LoanConfirmInfo setRepayPlans(java.util.List<RepayPlan> repayPlans) {
        this.repayPlans = repayPlans;
        return this;
    }
    public java.util.List<RepayPlan> getRepayPlans() {
        return this.repayPlans;
    }

    public LoanConfirmInfo setCustName(String custName) {
        this.custName = custName;
        return this;
    }
    public String getCustName() {
        return this.custName;
    }

    public LoanConfirmInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public LoanConfirmInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public LoanConfirmInfo setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
        return this;
    }
    public String getHomeAddr() {
        return this.homeAddr;
    }

    public LoanConfirmInfo setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public LoanConfirmInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public LoanConfirmInfo setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public LoanConfirmInfo setCertAddr(String certAddr) {
        this.certAddr = certAddr;
        return this;
    }
    public String getCertAddr() {
        return this.certAddr;
    }

    public LoanConfirmInfo setCommAddr(String commAddr) {
        this.commAddr = commAddr;
        return this;
    }
    public String getCommAddr() {
        return this.commAddr;
    }

    public LoanConfirmInfo setDiscPlans(java.util.List<RepayPlan> discPlans) {
        this.discPlans = discPlans;
        return this;
    }
    public java.util.List<RepayPlan> getDiscPlans() {
        return this.discPlans;
    }

    public LoanConfirmInfo setDiscInfo(String discInfo) {
        this.discInfo = discInfo;
        return this;
    }
    public String getDiscInfo() {
        return this.discInfo;
    }

    public LoanConfirmInfo setOverdueRate(String overdueRate) {
        this.overdueRate = overdueRate;
        return this;
    }
    public String getOverdueRate() {
        return this.overdueRate;
    }

    public LoanConfirmInfo setMisuseRate(String misuseRate) {
        this.misuseRate = misuseRate;
        return this;
    }
    public String getMisuseRate() {
        return this.misuseRate;
    }

    public LoanConfirmInfo setLpr(String lpr) {
        this.lpr = lpr;
        return this;
    }
    public String getLpr() {
        return this.lpr;
    }

    public LoanConfirmInfo setLprDay(String lprDay) {
        this.lprDay = lprDay;
        return this;
    }
    public String getLprDay() {
        return this.lprDay;
    }

    public LoanConfirmInfo setBp(String bp) {
        this.bp = bp;
        return this;
    }
    public String getBp() {
        return this.bp;
    }

    public LoanConfirmInfo setFeeRate(String feeRate) {
        this.feeRate = feeRate;
        return this;
    }
    public String getFeeRate() {
        return this.feeRate;
    }

    public LoanConfirmInfo setFixRate(String fixRate) {
        this.fixRate = fixRate;
        return this;
    }
    public String getFixRate() {
        return this.fixRate;
    }

    public LoanConfirmInfo setFixCompany(String fixCompany) {
        this.fixCompany = fixCompany;
        return this;
    }
    public String getFixCompany() {
        return this.fixCompany;
    }

    public LoanConfirmInfo setFeeCompany(String feeCompany) {
        this.feeCompany = feeCompany;
        return this;
    }
    public String getFeeCompany() {
        return this.feeCompany;
    }

}
