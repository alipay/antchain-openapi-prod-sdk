// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDidPersonFacevrfminiappnewocpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询刷脸结果唯一标识
    @NameInMap("certify_id")
    public String certifyId;

    // 认证流程入口 URL。
    @NameInMap("certify_url")
    public String certifyUrl;

    public static CreateDidPersonFacevrfminiappnewocpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDidPersonFacevrfminiappnewocpResponse self = new CreateDidPersonFacevrfminiappnewocpResponse();
        return TeaModel.build(map, self);
    }

    public CreateDidPersonFacevrfminiappnewocpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDidPersonFacevrfminiappnewocpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDidPersonFacevrfminiappnewocpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDidPersonFacevrfminiappnewocpResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CreateDidPersonFacevrfminiappnewocpResponse setCertifyUrl(String certifyUrl) {
        this.certifyUrl = certifyUrl;
        return this;
    }
    public String getCertifyUrl() {
        return this.certifyUrl;
    }

}
