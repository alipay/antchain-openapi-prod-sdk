// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryGuardianGuardianrulesResponse extends TeaModel {
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

    // 监控规则列表
    @NameInMap("guardian_rules")
    public java.util.List<GuardianRule> guardianRules;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryGuardianGuardianrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardianGuardianrulesResponse self = new QueryGuardianGuardianrulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuardianGuardianrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGuardianGuardianrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGuardianGuardianrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGuardianGuardianrulesResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryGuardianGuardianrulesResponse setGuardianRules(java.util.List<GuardianRule> guardianRules) {
        this.guardianRules = guardianRules;
        return this;
    }
    public java.util.List<GuardianRule> getGuardianRules() {
        return this.guardianRules;
    }

    public QueryGuardianGuardianrulesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryGuardianGuardianrulesResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryGuardianGuardianrulesResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
