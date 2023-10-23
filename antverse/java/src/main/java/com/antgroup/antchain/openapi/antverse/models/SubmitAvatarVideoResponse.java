// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoResponse extends TeaModel {
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

    public static SubmitAvatarVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarVideoResponse self = new SubmitAvatarVideoResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarVideoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAvatarVideoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAvatarVideoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAvatarVideoResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
