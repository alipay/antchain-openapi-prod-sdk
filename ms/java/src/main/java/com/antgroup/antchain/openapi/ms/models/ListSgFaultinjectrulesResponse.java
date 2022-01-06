// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgFaultinjectrulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 故障注入二级列表
    @NameInMap("rule_models")
    public java.util.List<FaultInjectRuleVO> ruleModels;

    // 开始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 100
    @NameInMap("total_size")
    public Long totalSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    public static ListSgFaultinjectrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgFaultinjectrulesResponse self = new ListSgFaultinjectrulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSgFaultinjectrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgFaultinjectrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgFaultinjectrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgFaultinjectrulesResponse setRuleModels(java.util.List<FaultInjectRuleVO> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<FaultInjectRuleVO> getRuleModels() {
        return this.ruleModels;
    }

    public ListSgFaultinjectrulesResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListSgFaultinjectrulesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgFaultinjectrulesResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListSgFaultinjectrulesResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
