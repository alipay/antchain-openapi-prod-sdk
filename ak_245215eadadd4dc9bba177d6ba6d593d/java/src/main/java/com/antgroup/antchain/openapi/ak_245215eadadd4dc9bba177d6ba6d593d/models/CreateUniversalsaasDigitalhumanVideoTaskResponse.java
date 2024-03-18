// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CreateUniversalsaasDigitalhumanVideoTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果状态
    @NameInMap("status")
    public Boolean status;

    // taskId
    @NameInMap("data")
    public String data;

    public static CreateUniversalsaasDigitalhumanVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUniversalsaasDigitalhumanVideoTaskResponse self = new CreateUniversalsaasDigitalhumanVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateUniversalsaasDigitalhumanVideoTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
