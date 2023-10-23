// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class QueryAvatarVideoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 视频任务id
    @NameInMap("task_id")
    public String taskId;

    // 视频合成任务状态（EXPORTING：导出中，NORMAL：成功，FAILED：失败）
    @NameInMap("video_status")
    public String videoStatus;

    // 视频url
    @NameInMap("video_url")
    public String videoUrl;

    // 提示消息
    @NameInMap("message")
    public String message;

    public static QueryAvatarVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarVideoResponse self = new QueryAvatarVideoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvatarVideoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAvatarVideoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAvatarVideoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAvatarVideoResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryAvatarVideoResponse setVideoStatus(String videoStatus) {
        this.videoStatus = videoStatus;
        return this;
    }
    public String getVideoStatus() {
        return this.videoStatus;
    }

    public QueryAvatarVideoResponse setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public QueryAvatarVideoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
