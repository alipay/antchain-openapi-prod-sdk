// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a4468d3c1cef4a6899d161ba86de1afb.models;

import com.aliyun.tea.*;

public class CreateDiRealpersonFacevrfServerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实人认证唯一标识
    @NameInMap("certify_id")
    public String certifyId;

    // 认证地址。只在特定场景返回。
    @NameInMap("certify_url")
    public String certifyUrl;

    public static CreateDiRealpersonFacevrfServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiRealpersonFacevrfServerResponse self = new CreateDiRealpersonFacevrfServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiRealpersonFacevrfServerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDiRealpersonFacevrfServerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDiRealpersonFacevrfServerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDiRealpersonFacevrfServerResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CreateDiRealpersonFacevrfServerResponse setCertifyUrl(String certifyUrl) {
        this.certifyUrl = certifyUrl;
        return this;
    }
    public String getCertifyUrl() {
        return this.certifyUrl;
    }

}
