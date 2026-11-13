// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class QueryMaasVideoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 视频任务 ID
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

    // 更新时间，Unix 秒级时间戳
    @NameInMap("updated_at")
    public String updatedAt;

    // 视频 URL（成功时返回）
    @NameInMap("content")
    public VideoUrl content;

    // 视频时长（秒
    @NameInMap("duration")
    public String duration;

    // 宽高比
    @NameInMap("ratio")
    public String ratio;

    // 分辨率
    @NameInMap("resolution")
    public String resolution;

    // 是否生成音轨
    @NameInMap("generate_audio")
    public Boolean generateAudio;

    // 用量数组
    @NameInMap("usage")
    public java.util.List<VideoUsage> usage;

    // 非标准化补充信息，JSON 字符串
    @NameInMap("extra_info")
    public String extraInfo;

    // 失败时返回
    @NameInMap("error")
    public Error error;

    public static QueryMaasVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaasVideoResponse self = new QueryMaasVideoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaasVideoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMaasVideoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMaasVideoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMaasVideoResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryMaasVideoResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryMaasVideoResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public QueryMaasVideoResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryMaasVideoResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public QueryMaasVideoResponse setContent(VideoUrl content) {
        this.content = content;
        return this;
    }
    public VideoUrl getContent() {
        return this.content;
    }

    public QueryMaasVideoResponse setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public QueryMaasVideoResponse setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public QueryMaasVideoResponse setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public QueryMaasVideoResponse setGenerateAudio(Boolean generateAudio) {
        this.generateAudio = generateAudio;
        return this;
    }
    public Boolean getGenerateAudio() {
        return this.generateAudio;
    }

    public QueryMaasVideoResponse setUsage(java.util.List<VideoUsage> usage) {
        this.usage = usage;
        return this;
    }
    public java.util.List<VideoUsage> getUsage() {
        return this.usage;
    }

    public QueryMaasVideoResponse setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public QueryMaasVideoResponse setError(Error error) {
        this.error = error;
        return this;
    }
    public Error getError() {
        return this.error;
    }

}
