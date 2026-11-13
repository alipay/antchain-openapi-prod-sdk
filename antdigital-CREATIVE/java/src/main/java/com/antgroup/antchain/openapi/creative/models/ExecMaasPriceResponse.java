// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ExecMaasPriceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 至少一个输出单元命中
    @NameInMap("matched")
    public Boolean matched;

    // 首个输出单元是否命中兜底规则
    @NameInMap("fallback")
    public Boolean fallback;

    // 命中规则编码
    @NameInMap("price_rule_code")
    public String priceRuleCode;

    // 规则版本
    @NameInMap("matched_rule_version")
    public Long matchedRuleVersion;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 规则优先级
    @NameInMap("priority")
    public Long priority;

    // 只计一次的请求级费用明细
    @NameInMap("request_items")
    public java.util.List<RequestItems> requestItems;

    // 各输出单元的试算明细
    @NameInMap("unit_estimates")
    public java.util.List<UnitEstimates> unitEstimates;

    // 试算总金额
    @NameInMap("total_amount")
    public String totalAmount;

    // 币种
    @NameInMap("currency")
    public String currency;

    // 未命中或部分命中时的提示
    @NameInMap("message")
    public String message;

    public static ExecMaasPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecMaasPriceResponse self = new ExecMaasPriceResponse();
        return TeaModel.build(map, self);
    }

    public ExecMaasPriceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecMaasPriceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecMaasPriceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecMaasPriceResponse setMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    public Boolean getMatched() {
        return this.matched;
    }

    public ExecMaasPriceResponse setFallback(Boolean fallback) {
        this.fallback = fallback;
        return this;
    }
    public Boolean getFallback() {
        return this.fallback;
    }

    public ExecMaasPriceResponse setPriceRuleCode(String priceRuleCode) {
        this.priceRuleCode = priceRuleCode;
        return this;
    }
    public String getPriceRuleCode() {
        return this.priceRuleCode;
    }

    public ExecMaasPriceResponse setMatchedRuleVersion(Long matchedRuleVersion) {
        this.matchedRuleVersion = matchedRuleVersion;
        return this;
    }
    public Long getMatchedRuleVersion() {
        return this.matchedRuleVersion;
    }

    public ExecMaasPriceResponse setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ExecMaasPriceResponse setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public ExecMaasPriceResponse setRequestItems(java.util.List<RequestItems> requestItems) {
        this.requestItems = requestItems;
        return this;
    }
    public java.util.List<RequestItems> getRequestItems() {
        return this.requestItems;
    }

    public ExecMaasPriceResponse setUnitEstimates(java.util.List<UnitEstimates> unitEstimates) {
        this.unitEstimates = unitEstimates;
        return this;
    }
    public java.util.List<UnitEstimates> getUnitEstimates() {
        return this.unitEstimates;
    }

    public ExecMaasPriceResponse setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public ExecMaasPriceResponse setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ExecMaasPriceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
