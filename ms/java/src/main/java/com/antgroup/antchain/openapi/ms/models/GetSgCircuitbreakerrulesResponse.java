// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetSgCircuitbreakerrulesResponse extends TeaModel {
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

    // 熔断规则
    @NameInMap("rule_models")
    public java.util.List<CircuitBreakerRuleModel> ruleModels;

    // 开始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 规则总数
    @NameInMap("total_size")
    public Long totalSize;

    public static GetSgCircuitbreakerrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSgCircuitbreakerrulesResponse self = new GetSgCircuitbreakerrulesResponse();
        return TeaModel.build(map, self);
    }

    public GetSgCircuitbreakerrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSgCircuitbreakerrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSgCircuitbreakerrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSgCircuitbreakerrulesResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetSgCircuitbreakerrulesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetSgCircuitbreakerrulesResponse setRuleModels(java.util.List<CircuitBreakerRuleModel> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<CircuitBreakerRuleModel> getRuleModels() {
        return this.ruleModels;
    }

    public GetSgCircuitbreakerrulesResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public GetSgCircuitbreakerrulesResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
