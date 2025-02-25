// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务id
    @NameInMap("task_id")
    public String taskId;

    // 返回结果状态
    @NameInMap("status")
    public Boolean status;

    public static RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse self = new RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
