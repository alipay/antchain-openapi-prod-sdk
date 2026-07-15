// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class RegisterLeasePetrecognitionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用于追踪业务调用流程
    @NameInMap("trace_id")
    public String traceId;

    // 注册结果：_0_注册不成功，_1_注册成功
    @NameInMap("is_register_success")
    public String isRegisterSuccess;

    // 注册成功宠物档案ID
    @NameInMap("pet_id")
    public String petId;

    public static RegisterLeasePetrecognitionResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterLeasePetrecognitionResponse self = new RegisterLeasePetrecognitionResponse();
        return TeaModel.build(map, self);
    }

    public RegisterLeasePetrecognitionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterLeasePetrecognitionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterLeasePetrecognitionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterLeasePetrecognitionResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public RegisterLeasePetrecognitionResponse setIsRegisterSuccess(String isRegisterSuccess) {
        this.isRegisterSuccess = isRegisterSuccess;
        return this;
    }
    public String getIsRegisterSuccess() {
        return this.isRegisterSuccess;
    }

    public RegisterLeasePetrecognitionResponse setPetId(String petId) {
        this.petId = petId;
        return this;
    }
    public String getPetId() {
        return this.petId;
    }

}
