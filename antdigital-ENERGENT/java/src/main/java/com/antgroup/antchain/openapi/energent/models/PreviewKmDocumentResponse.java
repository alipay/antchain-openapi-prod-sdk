// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class PreviewKmDocumentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文档ID
    @NameInMap("document_id")
    public String documentId;

    // 文档名
    @NameInMap("document_name")
    public String documentName;

    // 文件类型
    @NameInMap("file_type")
    public String fileType;

    // 文档Markdown正文
    @NameInMap("content")
    public String content;

    // OSS预览地址
    @NameInMap("oss_preview_url")
    public String ossPreviewUrl;

    public static PreviewKmDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewKmDocumentResponse self = new PreviewKmDocumentResponse();
        return TeaModel.build(map, self);
    }

    public PreviewKmDocumentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PreviewKmDocumentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PreviewKmDocumentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PreviewKmDocumentResponse setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public PreviewKmDocumentResponse setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public PreviewKmDocumentResponse setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public PreviewKmDocumentResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PreviewKmDocumentResponse setOssPreviewUrl(String ossPreviewUrl) {
        this.ossPreviewUrl = ossPreviewUrl;
        return this;
    }
    public String getOssPreviewUrl() {
        return this.ossPreviewUrl;
    }

}
