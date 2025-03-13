// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class QueryPlatformInvestmentreportbypackageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产抵押率（Collateral Ratio）
    @NameInMap("collateral_rate")
    public String collateralRate;

    // 实际收益率（Annual Yield）
    @NameInMap("actual_annualized_yield")
    public String actualAnnualizedYield;

    // 预期收益率（Expect Yield）
    @NameInMap("estimated_annualized_yield")
    public String estimatedAnnualizedYield;

    // 毛利吻合率（Gross Profit Conformity）
    @NameInMap("match_rate")
    public String matchRate;

    // 投资金额（Investment Allocation）
    @NameInMap("investment_amount")
    public MultiCurrencyMoney investmentAmount;

    // 实际收益
    @NameInMap("actual_annualized")
    public MultiCurrencyMoney actualAnnualized;

    // 预期收益
    @NameInMap("estimated_annualized")
    public MultiCurrencyMoney estimatedAnnualized;

    // 数据日期
    @NameInMap("dt")
    public String dt;

    public static QueryPlatformInvestmentreportbypackageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPlatformInvestmentreportbypackageResponse self = new QueryPlatformInvestmentreportbypackageResponse();
        return TeaModel.build(map, self);
    }

    public QueryPlatformInvestmentreportbypackageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPlatformInvestmentreportbypackageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPlatformInvestmentreportbypackageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPlatformInvestmentreportbypackageResponse setCollateralRate(String collateralRate) {
        this.collateralRate = collateralRate;
        return this;
    }
    public String getCollateralRate() {
        return this.collateralRate;
    }

    public QueryPlatformInvestmentreportbypackageResponse setActualAnnualizedYield(String actualAnnualizedYield) {
        this.actualAnnualizedYield = actualAnnualizedYield;
        return this;
    }
    public String getActualAnnualizedYield() {
        return this.actualAnnualizedYield;
    }

    public QueryPlatformInvestmentreportbypackageResponse setEstimatedAnnualizedYield(String estimatedAnnualizedYield) {
        this.estimatedAnnualizedYield = estimatedAnnualizedYield;
        return this;
    }
    public String getEstimatedAnnualizedYield() {
        return this.estimatedAnnualizedYield;
    }

    public QueryPlatformInvestmentreportbypackageResponse setMatchRate(String matchRate) {
        this.matchRate = matchRate;
        return this;
    }
    public String getMatchRate() {
        return this.matchRate;
    }

    public QueryPlatformInvestmentreportbypackageResponse setInvestmentAmount(MultiCurrencyMoney investmentAmount) {
        this.investmentAmount = investmentAmount;
        return this;
    }
    public MultiCurrencyMoney getInvestmentAmount() {
        return this.investmentAmount;
    }

    public QueryPlatformInvestmentreportbypackageResponse setActualAnnualized(MultiCurrencyMoney actualAnnualized) {
        this.actualAnnualized = actualAnnualized;
        return this;
    }
    public MultiCurrencyMoney getActualAnnualized() {
        return this.actualAnnualized;
    }

    public QueryPlatformInvestmentreportbypackageResponse setEstimatedAnnualized(MultiCurrencyMoney estimatedAnnualized) {
        this.estimatedAnnualized = estimatedAnnualized;
        return this;
    }
    public MultiCurrencyMoney getEstimatedAnnualized() {
        return this.estimatedAnnualized;
    }

    public QueryPlatformInvestmentreportbypackageResponse setDt(String dt) {
        this.dt = dt;
        return this;
    }
    public String getDt() {
        return this.dt;
    }

}
