// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class PushVideogenerationResponse extends TeaModel {
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

    public static PushVideogenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        PushVideogenerationResponse self = new PushVideogenerationResponse();
        return TeaModel.build(map, self);
    }

    public PushVideogenerationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushVideogenerationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushVideogenerationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushVideogenerationResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public PushVideogenerationResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PushVideogenerationResponse setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PushVideogenerationResponse setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
