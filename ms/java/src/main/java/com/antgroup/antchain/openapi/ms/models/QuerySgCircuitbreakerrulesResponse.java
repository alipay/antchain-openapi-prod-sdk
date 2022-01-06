// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgCircuitbreakerrulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 结果信息
    @NameInMap("rule_models")
    public java.util.List<CircuitBreakerRuleModel> ruleModels;

    // 开始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总服务资源数
    @NameInMap("total_size")
    public Long totalSize;

    public static QuerySgCircuitbreakerrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgCircuitbreakerrulesResponse self = new QuerySgCircuitbreakerrulesResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgCircuitbreakerrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgCircuitbreakerrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgCircuitbreakerrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgCircuitbreakerrulesResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySgCircuitbreakerrulesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySgCircuitbreakerrulesResponse setRuleModels(java.util.List<CircuitBreakerRuleModel> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<CircuitBreakerRuleModel> getRuleModels() {
        return this.ruleModels;
    }

    public QuerySgCircuitbreakerrulesResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QuerySgCircuitbreakerrulesResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
