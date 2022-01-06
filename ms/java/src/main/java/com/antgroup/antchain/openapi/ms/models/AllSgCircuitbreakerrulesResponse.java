// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AllSgCircuitbreakerrulesResponse extends TeaModel {
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

    // 应用名及规则数
    @NameInMap("rule_models")
    public java.util.List<CircuitBreakerRuleAppNamesModel> ruleModels;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总appName个数
    @NameInMap("total_size")
    public Long totalSize;

    public static AllSgCircuitbreakerrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AllSgCircuitbreakerrulesResponse self = new AllSgCircuitbreakerrulesResponse();
        return TeaModel.build(map, self);
    }

    public AllSgCircuitbreakerrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllSgCircuitbreakerrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllSgCircuitbreakerrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllSgCircuitbreakerrulesResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public AllSgCircuitbreakerrulesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AllSgCircuitbreakerrulesResponse setRuleModels(java.util.List<CircuitBreakerRuleAppNamesModel> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<CircuitBreakerRuleAppNamesModel> getRuleModels() {
        return this.ruleModels;
    }

    public AllSgCircuitbreakerrulesResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public AllSgCircuitbreakerrulesResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
