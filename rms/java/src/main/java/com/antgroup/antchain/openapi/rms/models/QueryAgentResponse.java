// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAgentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // agent 实例列表
    @NameInMap("agent_instances")
    public java.util.List<AgentInstance> agentInstances;

    // agent 实例总数
    @NameInMap("total_count")
    public Long totalCount;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    public static QueryAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentResponse self = new QueryAgentResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAgentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAgentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAgentResponse setAgentInstances(java.util.List<AgentInstance> agentInstances) {
        this.agentInstances = agentInstances;
        return this;
    }
    public java.util.List<AgentInstance> getAgentInstances() {
        return this.agentInstances;
    }

    public QueryAgentResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAgentResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAgentResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
