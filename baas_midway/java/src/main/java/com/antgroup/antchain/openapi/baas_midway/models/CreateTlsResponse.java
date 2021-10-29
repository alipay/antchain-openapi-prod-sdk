// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baas_midway.models;

import com.aliyun.tea.*;

public class CreateTlsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客户端TLS证书
    @NameInMap("client_cert")
    public String clientCert;

    // 客户端TLS密钥
    @NameInMap("client_key")
    public String clientKey;

    public static CreateTlsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTlsResponse self = new CreateTlsResponse();
        return TeaModel.build(map, self);
    }

    public CreateTlsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateTlsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateTlsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateTlsResponse setClientCert(String clientCert) {
        this.clientCert = clientCert;
        return this;
    }
    public String getClientCert() {
        return this.clientCert;
    }

    public CreateTlsResponse setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public String getClientKey() {
        return this.clientKey;
    }

}
