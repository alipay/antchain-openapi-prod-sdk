// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class PushMaasImageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 图片任务 ID
    @NameInMap("task_id")
    public String taskId;

    // 任务状态
    @NameInMap("status")
    public String status;

    // 实际使用的模型
    @NameInMap("model")
    public String model;

    // 图片 URL 列表
    @NameInMap("content")
    public ImageUrlsList content;

    // 用量数组
    @NameInMap("usage")
    public java.util.List<ImageUsage> usage;

    // 失败时返回
    @NameInMap("error")
    public Error error;

    // 非标准化补充信息，JSON 字符串
    @NameInMap("extra_info")
    public String extraInfo;

    public static PushMaasImageResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMaasImageResponse self = new PushMaasImageResponse();
        return TeaModel.build(map, self);
    }

    public PushMaasImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushMaasImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushMaasImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushMaasImageResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public PushMaasImageResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PushMaasImageResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PushMaasImageResponse setContent(ImageUrlsList content) {
        this.content = content;
        return this;
    }
    public ImageUrlsList getContent() {
        return this.content;
    }

    public PushMaasImageResponse setUsage(java.util.List<ImageUsage> usage) {
        this.usage = usage;
        return this;
    }
    public java.util.List<ImageUsage> getUsage() {
        return this.usage;
    }

    public PushMaasImageResponse setError(Error error) {
        this.error = error;
        return this;
    }
    public Error getError() {
        return this.error;
    }

    public PushMaasImageResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
