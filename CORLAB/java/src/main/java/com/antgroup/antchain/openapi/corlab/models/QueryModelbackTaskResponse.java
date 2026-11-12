// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class QueryModelbackTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务唯一id
    @NameInMap("biz_code")
    public String bizCode;

    // 任务状态
    @NameInMap("status")
    public String status;

    // 任务对应产品结果信息
    @NameInMap("result_contexts")
    public java.util.List<ResultContext> resultContexts;

    // 任务完成时间
    @NameInMap("finish_time")
    public String finishTime;

    // 异步任务失败后，响应客户任务失败原因错误码，任务正常值为空
    @NameInMap("error_code")
    public String errorCode;

    // 异步任务失败后，响应客户错误失败原因，任务正常值为空
    @NameInMap("error_msg")
    public String errorMsg;

    public static QueryModelbackTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModelbackTaskResponse self = new QueryModelbackTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryModelbackTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryModelbackTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryModelbackTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryModelbackTaskResponse setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryModelbackTaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryModelbackTaskResponse setResultContexts(java.util.List<ResultContext> resultContexts) {
        this.resultContexts = resultContexts;
        return this;
    }
    public java.util.List<ResultContext> getResultContexts() {
        return this.resultContexts;
    }

    public QueryModelbackTaskResponse setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public QueryModelbackTaskResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryModelbackTaskResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
