// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class CreateRealtytradePersonalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 个人在数字房产平台的唯一ID
    @NameInMap("personal_id")
    public String personalId;

    public static CreateRealtytradePersonalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtytradePersonalResponse self = new CreateRealtytradePersonalResponse();
        return TeaModel.build(map, self);
    }

    public CreateRealtytradePersonalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateRealtytradePersonalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateRealtytradePersonalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateRealtytradePersonalResponse setPersonalId(String personalId) {
        this.personalId = personalId;
        return this;
    }
    public String getPersonalId() {
        return this.personalId;
    }

}
