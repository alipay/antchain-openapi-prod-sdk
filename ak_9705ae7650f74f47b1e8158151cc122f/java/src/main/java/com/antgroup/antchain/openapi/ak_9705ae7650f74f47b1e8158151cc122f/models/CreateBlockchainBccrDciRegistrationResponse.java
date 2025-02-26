// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class CreateBlockchainBccrDciRegistrationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数登申请id
    @NameInMap("digital_register_id")
    public String digitalRegisterId;

    // 错误信息
    @NameInMap("error_msg")
    public String errorMsg;

    public static CreateBlockchainBccrDciRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainBccrDciRegistrationResponse self = new CreateBlockchainBccrDciRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainBccrDciRegistrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBlockchainBccrDciRegistrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBlockchainBccrDciRegistrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBlockchainBccrDciRegistrationResponse setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public CreateBlockchainBccrDciRegistrationResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
