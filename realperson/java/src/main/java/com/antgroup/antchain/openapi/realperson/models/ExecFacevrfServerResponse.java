// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ExecFacevrfServerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证ID
    @NameInMap("certify_id")
    public String certifyId;

    // 是否通过，通过为T，不通过为F
    @NameInMap("passed")
    public String passed;

    // 业务失败原因
    @NameInMap("reason")
    public String reason;

    // 认证主体附件信息，包含共计类型等
    @NameInMap("material_info")
    public String materialInfo;

    public static ExecFacevrfServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecFacevrfServerResponse self = new ExecFacevrfServerResponse();
        return TeaModel.build(map, self);
    }

    public ExecFacevrfServerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecFacevrfServerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecFacevrfServerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecFacevrfServerResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public ExecFacevrfServerResponse setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public ExecFacevrfServerResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ExecFacevrfServerResponse setMaterialInfo(String materialInfo) {
        this.materialInfo = materialInfo;
        return this;
    }
    public String getMaterialInfo() {
        return this.materialInfo;
    }

}
