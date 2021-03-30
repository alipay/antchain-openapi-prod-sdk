// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class GetDocumentFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文档Id
    @NameInMap("document_id")
    public String documentId;

    // 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
    @NameInMap("file_type")
    public String fileType;

    // 文档名
    @NameInMap("name")
    public String name;

    // 存证哈希
    @NameInMap("tx_hash")
    public String txHash;

    // 存证时间
    @NameInMap("tx_time")
    public Long txTime;

    // 文件Url
    @NameInMap("url")
    public String url;

    public static GetDocumentFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentFileResponse self = new GetDocumentFileResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDocumentFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDocumentFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDocumentFileResponse setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public GetDocumentFileResponse setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public GetDocumentFileResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDocumentFileResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public GetDocumentFileResponse setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

    public GetDocumentFileResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
