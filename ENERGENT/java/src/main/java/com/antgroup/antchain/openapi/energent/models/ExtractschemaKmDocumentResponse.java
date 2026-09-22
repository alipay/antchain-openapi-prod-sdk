// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class ExtractschemaKmDocumentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 生成的本体Schema JSON
    @NameInMap("schema_json")
    public String schemaJson;

    // 文件内容摘要
    @NameInMap("file_content")
    public String fileContent;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 失败原因
    @NameInMap("error_msg")
    public String errorMsg;

    public static ExtractschemaKmDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractschemaKmDocumentResponse self = new ExtractschemaKmDocumentResponse();
        return TeaModel.build(map, self);
    }

    public ExtractschemaKmDocumentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExtractschemaKmDocumentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExtractschemaKmDocumentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExtractschemaKmDocumentResponse setSchemaJson(String schemaJson) {
        this.schemaJson = schemaJson;
        return this;
    }
    public String getSchemaJson() {
        return this.schemaJson;
    }

    public ExtractschemaKmDocumentResponse setFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }
    public String getFileContent() {
        return this.fileContent;
    }

    public ExtractschemaKmDocumentResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExtractschemaKmDocumentResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
