// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class QueryPlatformInvestmentreportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预期收益
    @NameInMap("estimated_annualized")
    public Long estimatedAnnualized;

    // 实际收益率（Annual Yield）
    @NameInMap("actual_annualized_yield")
    public Long actualAnnualizedYield;

    // 预期收益率（Expect Yield）
    @NameInMap("estimated_annualized_yield")
    public Long estimatedAnnualizedYield;

    // 毛利吻合率（Gross Profit Conformity）
    @NameInMap("match_rate")
    public Long matchRate;

    // 投资金额（Investment Allocation）
    @NameInMap("investment_amount")
    public Long investmentAmount;

    // 实际收益
    @NameInMap("actual_annualized")
    public Long actualAnnualized;

    // 资产抵押率（Collateral Ratio）
    @NameInMap("collateral_rate")
    public Long collateralRate;

    // 数据日期
    @NameInMap("dt")
    public String dt;

    public static QueryPlatformInvestmentreportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPlatformInvestmentreportResponse self = new QueryPlatformInvestmentreportResponse();
        return TeaModel.build(map, self);
    }

    public QueryPlatformInvestmentreportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPlatformInvestmentreportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPlatformInvestmentreportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPlatformInvestmentreportResponse setEstimatedAnnualized(Long estimatedAnnualized) {
        this.estimatedAnnualized = estimatedAnnualized;
        return this;
    }
    public Long getEstimatedAnnualized() {
        return this.estimatedAnnualized;
    }

    public QueryPlatformInvestmentreportResponse setActualAnnualizedYield(Long actualAnnualizedYield) {
        this.actualAnnualizedYield = actualAnnualizedYield;
        return this;
    }
    public Long getActualAnnualizedYield() {
        return this.actualAnnualizedYield;
    }

    public QueryPlatformInvestmentreportResponse setEstimatedAnnualizedYield(Long estimatedAnnualizedYield) {
        this.estimatedAnnualizedYield = estimatedAnnualizedYield;
        return this;
    }
    public Long getEstimatedAnnualizedYield() {
        return this.estimatedAnnualizedYield;
    }

    public QueryPlatformInvestmentreportResponse setMatchRate(Long matchRate) {
        this.matchRate = matchRate;
        return this;
    }
    public Long getMatchRate() {
        return this.matchRate;
    }

    public QueryPlatformInvestmentreportResponse setInvestmentAmount(Long investmentAmount) {
        this.investmentAmount = investmentAmount;
        return this;
    }
    public Long getInvestmentAmount() {
        return this.investmentAmount;
    }

    public QueryPlatformInvestmentreportResponse setActualAnnualized(Long actualAnnualized) {
        this.actualAnnualized = actualAnnualized;
        return this;
    }
    public Long getActualAnnualized() {
        return this.actualAnnualized;
    }

    public QueryPlatformInvestmentreportResponse setCollateralRate(Long collateralRate) {
        this.collateralRate = collateralRate;
        return this;
    }
    public Long getCollateralRate() {
        return this.collateralRate;
    }

    public QueryPlatformInvestmentreportResponse setDt(String dt) {
        this.dt = dt;
        return this;
    }
    public String getDt() {
        return this.dt;
    }

}
