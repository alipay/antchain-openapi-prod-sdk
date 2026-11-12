// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class CreateModelbackTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务唯一标识
    @NameInMap("biz_code")
    public String bizCode;

    // 任务状态：SUCCESS/RUNNING/FAIL
    @NameInMap("status")
    public String status;

    public static CreateModelbackTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelbackTaskResponse self = new CreateModelbackTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelbackTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateModelbackTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateModelbackTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateModelbackTaskResponse setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateModelbackTaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
