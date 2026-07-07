// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class UploadEcarPlaformfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文档名称
    @NameInMap("document_name")
    public String documentName;

    // 文档地址信息
    @NameInMap("document_address")
    public String documentAddress;

    public static UploadEcarPlaformfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadEcarPlaformfileResponse self = new UploadEcarPlaformfileResponse();
        return TeaModel.build(map, self);
    }

    public UploadEcarPlaformfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadEcarPlaformfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadEcarPlaformfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadEcarPlaformfileResponse setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public UploadEcarPlaformfileResponse setDocumentAddress(String documentAddress) {
        this.documentAddress = documentAddress;
        return this;
    }
    public String getDocumentAddress() {
        return this.documentAddress;
    }

}
