// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class CreateItagAntitagTaskJsonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("code")
    public String code;

    // 消息体
    @NameInMap("msg")
    public String msg;

    // 请求ID
    @NameInMap("requestid")
    public String requestid;

    // 成功标识
    @NameInMap("succ")
    public String succ;

    // 任务ID
    @NameInMap("taskid")
    public String taskid;

    public static CreateItagAntitagTaskJsonResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateItagAntitagTaskJsonResponse self = new CreateItagAntitagTaskJsonResponse();
        return TeaModel.build(map, self);
    }

    public CreateItagAntitagTaskJsonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateItagAntitagTaskJsonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateItagAntitagTaskJsonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateItagAntitagTaskJsonResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateItagAntitagTaskJsonResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateItagAntitagTaskJsonResponse setRequestid(String requestid) {
        this.requestid = requestid;
        return this;
    }
    public String getRequestid() {
        return this.requestid;
    }

    public CreateItagAntitagTaskJsonResponse setSucc(String succ) {
        this.succ = succ;
        return this;
    }
    public String getSucc() {
        return this.succ;
    }

    public CreateItagAntitagTaskJsonResponse setTaskid(String taskid) {
        this.taskid = taskid;
        return this;
    }
    public String getTaskid() {
        return this.taskid;
    }

}
