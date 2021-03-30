// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UpdateDocumentFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件信息
    @NameInMap("document_info")
    public DocumentInfo documentInfo;

    public static UpdateDocumentFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocumentFileResponse self = new UpdateDocumentFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDocumentFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDocumentFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDocumentFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDocumentFileResponse setDocumentInfo(DocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
        return this;
    }
    public DocumentInfo getDocumentInfo() {
        return this.documentInfo;
    }

}
