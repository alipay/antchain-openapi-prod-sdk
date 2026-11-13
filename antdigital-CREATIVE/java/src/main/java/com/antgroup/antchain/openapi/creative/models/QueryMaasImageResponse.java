// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class QueryMaasImageResponse extends TeaModel {
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

    // 创建时间，Unix 秒级时间戳
    @NameInMap("created_at")
    public String createdAt;

    // 图片 URL 列表（成功时返回）
    @NameInMap("content")
    public ImageUrlsList content;

    // 用量数组
    @NameInMap("usage")
    public java.util.List<ImageUsage> usage;

    // 非标准化补充信息，JSON 字符串
    @NameInMap("extra_info")
    public String extraInfo;

    // 失败时返回
    @NameInMap("error")
    public Error error;

    public static QueryMaasImageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaasImageResponse self = new QueryMaasImageResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaasImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMaasImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMaasImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMaasImageResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryMaasImageResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryMaasImageResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public QueryMaasImageResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryMaasImageResponse setContent(ImageUrlsList content) {
        this.content = content;
        return this;
    }
    public ImageUrlsList getContent() {
        return this.content;
    }

    public QueryMaasImageResponse setUsage(java.util.List<ImageUsage> usage) {
        this.usage = usage;
        return this;
    }
    public java.util.List<ImageUsage> getUsage() {
        return this.usage;
    }

    public QueryMaasImageResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public QueryMaasImageResponse setError(Error error) {
        this.error = error;
        return this;
    }
    public Error getError() {
        return this.error;
    }

}
