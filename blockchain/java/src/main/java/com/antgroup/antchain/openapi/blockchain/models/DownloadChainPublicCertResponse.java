// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DownloadChainPublicCertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public ALiYunDownloadPath result;

    public static DownloadChainPublicCertResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadChainPublicCertResponse self = new DownloadChainPublicCertResponse();
        return TeaModel.build(map, self);
    }

    public DownloadChainPublicCertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DownloadChainPublicCertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DownloadChainPublicCertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DownloadChainPublicCertResponse setResult(ALiYunDownloadPath result) {
        this.result = result;
        return this;
    }
    public ALiYunDownloadPath getResult() {
        return this.result;
    }

}
