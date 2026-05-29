// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class QueryVideoQuerytaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    // 任务状态
    @NameInMap("status")
    public String status;

    // 模型名称
    @NameInMap("model")
    public String model;

    // 视频输出URL
    @NameInMap("video_url")
    public String videoUrl;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息
    @NameInMap("error_message")
    public String errorMessage;

    // 扩展信息
    @NameInMap("ext")
    public String ext;

    public static QueryVideoQuerytaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoQuerytaskResponse self = new QueryVideoQuerytaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideoQuerytaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryVideoQuerytaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryVideoQuerytaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryVideoQuerytaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryVideoQuerytaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryVideoQuerytaskResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public QueryVideoQuerytaskResponse setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public QueryVideoQuerytaskResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryVideoQuerytaskResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryVideoQuerytaskResponse setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
