// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ResolveAntchainDasKyaDidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 标准DidDocumentMetadata
    @NameInMap("did_document_metadata")
    public DidDocumentMetadata didDocumentMetadata;

    // 解析过程元数据
    @NameInMap("did_resolution_metadata")
    public DidResolutionMetadata didResolutionMetadata;

    // 标准did doc格式
    @NameInMap("did_document")
    public String didDocument;

    public static ResolveAntchainDasKyaDidResponse build(java.util.Map<String, ?> map) throws Exception {
        ResolveAntchainDasKyaDidResponse self = new ResolveAntchainDasKyaDidResponse();
        return TeaModel.build(map, self);
    }

    public ResolveAntchainDasKyaDidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ResolveAntchainDasKyaDidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ResolveAntchainDasKyaDidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ResolveAntchainDasKyaDidResponse setDidDocumentMetadata(DidDocumentMetadata didDocumentMetadata) {
        this.didDocumentMetadata = didDocumentMetadata;
        return this;
    }
    public DidDocumentMetadata getDidDocumentMetadata() {
        return this.didDocumentMetadata;
    }

    public ResolveAntchainDasKyaDidResponse setDidResolutionMetadata(DidResolutionMetadata didResolutionMetadata) {
        this.didResolutionMetadata = didResolutionMetadata;
        return this;
    }
    public DidResolutionMetadata getDidResolutionMetadata() {
        return this.didResolutionMetadata;
    }

    public ResolveAntchainDasKyaDidResponse setDidDocument(String didDocument) {
        this.didDocument = didDocument;
        return this;
    }
    public String getDidDocument() {
        return this.didDocument;
    }

}
