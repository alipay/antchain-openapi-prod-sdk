// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreatePrivatecontractUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 注册是否成功
    @NameInMap("success")
    public Boolean success;

    // 返回code,200成功，其他均为失败
    @NameInMap("code")
    public String code;

    // 返回信息，成功返回success，错误时会返回详细信息。
    @NameInMap("message")
    public String message;

    // 用户的CA证书办法机构
    @NameInMap("cert_auth_org")
    public String certAuthOrg;

    // 用户的CA证书序列号
    @NameInMap("cert_serial_number")
    public String certSerialNumber;

    // 用户证书过期时间
    @NameInMap("cert_end_time")
    public Long certEndTime;

    public static CreatePrivatecontractUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivatecontractUserResponse self = new CreatePrivatecontractUserResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrivatecontractUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreatePrivatecontractUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatePrivatecontractUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreatePrivatecontractUserResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreatePrivatecontractUserResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePrivatecontractUserResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePrivatecontractUserResponse setCertAuthOrg(String certAuthOrg) {
        this.certAuthOrg = certAuthOrg;
        return this;
    }
    public String getCertAuthOrg() {
        return this.certAuthOrg;
    }

    public CreatePrivatecontractUserResponse setCertSerialNumber(String certSerialNumber) {
        this.certSerialNumber = certSerialNumber;
        return this;
    }
    public String getCertSerialNumber() {
        return this.certSerialNumber;
    }

    public CreatePrivatecontractUserResponse setCertEndTime(Long certEndTime) {
        this.certEndTime = certEndTime;
        return this;
    }
    public Long getCertEndTime() {
        return this.certEndTime;
    }

}
