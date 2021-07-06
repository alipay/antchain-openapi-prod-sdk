// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBaicorpInternalmonitorasyncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据
    @NameInMap("data")
    public java.util.List<AntiPiracyResultObject> data;

    // 如果字段status == "failed"，该字段保存相关错误信息
    @NameInMap("err_msg")
    public String errMsg;

    // success 数据入库成功，后续处于被检测状态；
    // continue 数据处于被检测状态，data 字段包含监测结果
    // failed 任务失败
    @NameInMap("status")
    public String status;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    public static QueryBaicorpInternalmonitorasyncResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaicorpInternalmonitorasyncResponse self = new QueryBaicorpInternalmonitorasyncResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaicorpInternalmonitorasyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaicorpInternalmonitorasyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaicorpInternalmonitorasyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaicorpInternalmonitorasyncResponse setData(java.util.List<AntiPiracyResultObject> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AntiPiracyResultObject> getData() {
        return this.data;
    }

    public QueryBaicorpInternalmonitorasyncResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public QueryBaicorpInternalmonitorasyncResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryBaicorpInternalmonitorasyncResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
