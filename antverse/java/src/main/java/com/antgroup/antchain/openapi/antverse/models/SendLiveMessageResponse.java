// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class SendLiveMessageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 直播间实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 直播间项目id
    @NameInMap("project_id")
    public String projectId;

    // 问答导出任务id
    @NameInMap("task_id")
    public String taskId;

    // 问答完成状态
    @NameInMap("status")
    public String status;

    // 标记
    @NameInMap("mark")
    public String mark;

    // 发送时间
    @NameInMap("send_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String sendTime;

    public static SendLiveMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendLiveMessageResponse self = new SendLiveMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendLiveMessageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendLiveMessageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendLiveMessageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendLiveMessageResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendLiveMessageResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SendLiveMessageResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendLiveMessageResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SendLiveMessageResponse setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public SendLiveMessageResponse setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

}
