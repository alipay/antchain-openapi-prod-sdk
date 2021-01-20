// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetTaskResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 
    //                             异步请求创建的时间和日期。采用UTC时间，按照[ISO8601](https://zh.wikipedia.org/wiki/ISO_8601)标准表示，格式为：`YYYY-MM-DDThh:mm:ssZ`
    //                         
    @NameInMap("creation_time")
    public String creationTime;

    // 异步请求中任务的执行结果，key为任务操作对象id比如某个资源的id，value为操作结果
    @NameInMap("execution_results")
    public java.util.List<TaskResult> executionResults;

    // 异步请求唯一标识
    @NameInMap("id")
    public String id;

    // 异步请求业务号
    @NameInMap("req_biz_id")
    public String reqBizId;

    // 异步请求状态，取值：
    //                             INIT：初始化中；
    //                             READY：待执行；
    //                             PROCESSING：执行中；
    //                             COMPLETED：执行完成
    //                         
    @NameInMap("status")
    public String status;

    public static GetTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponse self = new GetTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTaskResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetTaskResponse setExecutionResults(java.util.List<TaskResult> executionResults) {
        this.executionResults = executionResults;
        return this;
    }
    public java.util.List<TaskResult> getExecutionResults() {
        return this.executionResults;
    }

    public GetTaskResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetTaskResponse setReqBizId(String reqBizId) {
        this.reqBizId = reqBizId;
        return this;
    }
    public String getReqBizId() {
        return this.reqBizId;
    }

    public GetTaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
