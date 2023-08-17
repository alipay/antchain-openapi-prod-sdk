// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class CreateItagAntitagTaskRequestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // taskId
    @NameInMap("taskid")
    public String taskid;

    // flowrunid
    @NameInMap("flowrunid")
    public String flowrunid;

    // msgid
    @NameInMap("msgid")
    public String msgid;

    // slavemsgid
    @NameInMap("slavemsgid")
    public String slavemsgid;

    // reftaskid
    @NameInMap("reftaskid")
    public String reftaskid;

    public static CreateItagAntitagTaskRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateItagAntitagTaskRequestResponse self = new CreateItagAntitagTaskRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateItagAntitagTaskRequestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateItagAntitagTaskRequestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateItagAntitagTaskRequestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateItagAntitagTaskRequestResponse setTaskid(String taskid) {
        this.taskid = taskid;
        return this;
    }
    public String getTaskid() {
        return this.taskid;
    }

    public CreateItagAntitagTaskRequestResponse setFlowrunid(String flowrunid) {
        this.flowrunid = flowrunid;
        return this;
    }
    public String getFlowrunid() {
        return this.flowrunid;
    }

    public CreateItagAntitagTaskRequestResponse setMsgid(String msgid) {
        this.msgid = msgid;
        return this;
    }
    public String getMsgid() {
        return this.msgid;
    }

    public CreateItagAntitagTaskRequestResponse setSlavemsgid(String slavemsgid) {
        this.slavemsgid = slavemsgid;
        return this;
    }
    public String getSlavemsgid() {
        return this.slavemsgid;
    }

    public CreateItagAntitagTaskRequestResponse setReftaskid(String reftaskid) {
        this.reftaskid = reftaskid;
        return this;
    }
    public String getReftaskid() {
        return this.reftaskid;
    }

}
