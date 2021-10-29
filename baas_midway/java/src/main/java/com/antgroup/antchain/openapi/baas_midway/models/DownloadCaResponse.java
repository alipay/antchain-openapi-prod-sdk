// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baas_midway.models;

import com.aliyun.tea.*;

public class DownloadCaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 根CA证书内容
    @NameInMap("trust_ca_content")
    public String trustCaContent;

    // CA证书格式，目前只有X509
    @NameInMap("ca_format")
    public String caFormat;

    public static DownloadCaResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadCaResponse self = new DownloadCaResponse();
        return TeaModel.build(map, self);
    }

    public DownloadCaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DownloadCaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DownloadCaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DownloadCaResponse setTrustCaContent(String trustCaContent) {
        this.trustCaContent = trustCaContent;
        return this;
    }
    public String getTrustCaContent() {
        return this.trustCaContent;
    }

    public DownloadCaResponse setCaFormat(String caFormat) {
        this.caFormat = caFormat;
        return this;
    }
    public String getCaFormat() {
        return this.caFormat;
    }

}
