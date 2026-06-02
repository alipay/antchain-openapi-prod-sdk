// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class PushVideoCreatetaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务 ID，后续查询结果通过此参数获取
    @NameInMap("task_id")
    public String taskId;

    // 任务状态：pending（等待中）、processing（处理中）、succeeded（已成功）、failed（已失败）
    @NameInMap("status")
    public String status;

    // 模型名称
    @NameInMap("model")
    public String model;

    // 扩展JSON
    @NameInMap("ext")
    public String ext;

    public static PushVideoCreatetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PushVideoCreatetaskResponse self = new PushVideoCreatetaskResponse();
        return TeaModel.build(map, self);
    }

    public PushVideoCreatetaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushVideoCreatetaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushVideoCreatetaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushVideoCreatetaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public PushVideoCreatetaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PushVideoCreatetaskResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PushVideoCreatetaskResponse setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
