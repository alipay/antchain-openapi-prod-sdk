// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryRiskTasksResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险任务列表
    @NameInMap("risk_tasks")
    public java.util.List<RiskTask> riskTasks;

    // 总条目数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryRiskTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskTasksResponse self = new QueryRiskTasksResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskTasksResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskTasksResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskTasksResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskTasksResponse setRiskTasks(java.util.List<RiskTask> riskTasks) {
        this.riskTasks = riskTasks;
        return this;
    }
    public java.util.List<RiskTask> getRiskTasks() {
        return this.riskTasks;
    }

    public QueryRiskTasksResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
