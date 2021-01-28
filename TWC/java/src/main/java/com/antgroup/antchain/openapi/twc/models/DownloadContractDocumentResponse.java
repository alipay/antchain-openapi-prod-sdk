// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DownloadContractDocumentResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 文档下载地址信息列表
    @NameInMap("docs")
    public java.util.List<ContractDocAddress> docs;

    // 业务码信息
    @NameInMap("message")
    public String message;

    public static DownloadContractDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadContractDocumentResponse self = new DownloadContractDocumentResponse();
        return TeaModel.build(map, self);
    }

    public DownloadContractDocumentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DownloadContractDocumentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DownloadContractDocumentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DownloadContractDocumentResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DownloadContractDocumentResponse setDocs(java.util.List<ContractDocAddress> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<ContractDocAddress> getDocs() {
        return this.docs;
    }

    public DownloadContractDocumentResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
