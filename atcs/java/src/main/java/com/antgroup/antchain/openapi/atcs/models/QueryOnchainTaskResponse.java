// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.atcs.models;

import com.aliyun.tea.*;

public class QueryOnchainTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务处理结果列表
    @NameInMap("task_result_list")
    public java.util.List<TaskResult> taskResultList;

    // 分布式身份唯一标识
    @NameInMap("did")
    public String did;

    public static QueryOnchainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOnchainTaskResponse self = new QueryOnchainTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryOnchainTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOnchainTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOnchainTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOnchainTaskResponse setTaskResultList(java.util.List<TaskResult> taskResultList) {
        this.taskResultList = taskResultList;
        return this;
    }
    public java.util.List<TaskResult> getTaskResultList() {
        return this.taskResultList;
    }

    public QueryOnchainTaskResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
