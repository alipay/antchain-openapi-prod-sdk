// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryMeteringRuleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 技术产品码
    @NameInMap("product_code")
    public String productCode;

    // 商业产品码
    @NameInMap("business_code")
    public String businessCode;

    // 计量规则
    @NameInMap("metering_rules")
    public java.util.List<MethodMatchingRule> meteringRules;

    public static QueryMeteringRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeteringRuleResponse self = new QueryMeteringRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeteringRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMeteringRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMeteringRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMeteringRuleResponse setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryMeteringRuleResponse setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryMeteringRuleResponse setMeteringRules(java.util.List<MethodMatchingRule> meteringRules) {
        this.meteringRules = meteringRules;
        return this;
    }
    public java.util.List<MethodMatchingRule> getMeteringRules() {
        return this.meteringRules;
    }

}
