// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowElasticruleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 弹性规则列表
    @NameInMap("elastic_rules")
    public java.util.List<ElasticRuleView> elasticRules;

    // 总数
    @NameInMap("total")
    public Long total;

    // 当前页
    @NameInMap("page_no")
    public Long pageNo;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryFlowElasticruleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowElasticruleResponse self = new QueryFlowElasticruleResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowElasticruleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowElasticruleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowElasticruleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowElasticruleResponse setElasticRules(java.util.List<ElasticRuleView> elasticRules) {
        this.elasticRules = elasticRules;
        return this;
    }
    public java.util.List<ElasticRuleView> getElasticRules() {
        return this.elasticRules;
    }

    public QueryFlowElasticruleResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryFlowElasticruleResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryFlowElasticruleResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
