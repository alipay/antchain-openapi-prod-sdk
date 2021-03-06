// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class GetCpfCertuseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原始文件pdf
    @NameInMap("deposit_cert")
    public String depositCert;

    public static GetCpfCertuseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCpfCertuseResponse self = new GetCpfCertuseResponse();
        return TeaModel.build(map, self);
    }

    public GetCpfCertuseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCpfCertuseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCpfCertuseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCpfCertuseResponse setDepositCert(String depositCert) {
        this.depositCert = depositCert;
        return this;
    }
    public String getDepositCert() {
        return this.depositCert;
    }

}
