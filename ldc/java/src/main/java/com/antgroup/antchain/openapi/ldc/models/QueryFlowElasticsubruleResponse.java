// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowElasticsubruleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 子规则列表
    @NameInMap("sub_rules")
    public java.util.List<ElasticSubRuleView> subRules;

    public static QueryFlowElasticsubruleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowElasticsubruleResponse self = new QueryFlowElasticsubruleResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowElasticsubruleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowElasticsubruleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowElasticsubruleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowElasticsubruleResponse setSubRules(java.util.List<ElasticSubRuleView> subRules) {
        this.subRules = subRules;
        return this;
    }
    public java.util.List<ElasticSubRuleView> getSubRules() {
        return this.subRules;
    }

}
