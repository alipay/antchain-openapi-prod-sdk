// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class DownloadChaininsightContractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // base64编码的合约信息
    @NameInMap("result")
    public String result;

    public static DownloadChaininsightContractResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadChaininsightContractResponse self = new DownloadChaininsightContractResponse();
        return TeaModel.build(map, self);
    }

    public DownloadChaininsightContractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DownloadChaininsightContractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DownloadChaininsightContractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DownloadChaininsightContractResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
