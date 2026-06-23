// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GrantDeviceEmpowerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权ID
    @NameInMap("auth_record_id")
    public String authRecordId;

    public static GrantDeviceEmpowerResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantDeviceEmpowerResponse self = new GrantDeviceEmpowerResponse();
        return TeaModel.build(map, self);
    }

    public GrantDeviceEmpowerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GrantDeviceEmpowerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GrantDeviceEmpowerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GrantDeviceEmpowerResponse setAuthRecordId(String authRecordId) {
        this.authRecordId = authRecordId;
        return this;
    }
    public String getAuthRecordId() {
        return this.authRecordId;
    }

}
