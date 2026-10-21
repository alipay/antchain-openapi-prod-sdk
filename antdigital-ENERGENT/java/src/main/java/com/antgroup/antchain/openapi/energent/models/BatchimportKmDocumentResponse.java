// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class BatchimportKmDocumentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功数量
    @NameInMap("success_count")
    public Long successCount;

    // 失败数量
    @NameInMap("failed_count")
    public Long failedCount;

    // 跳过数量(MD5重复)
    @NameInMap("skip_count")
    public Long skipCount;

    // 入库成功文档JSON数组(KbDocumentDTO字段定义见文档)
    @NameInMap("documents")
    public String documents;

    public static BatchimportKmDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchimportKmDocumentResponse self = new BatchimportKmDocumentResponse();
        return TeaModel.build(map, self);
    }

    public BatchimportKmDocumentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchimportKmDocumentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchimportKmDocumentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchimportKmDocumentResponse setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public BatchimportKmDocumentResponse setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public BatchimportKmDocumentResponse setSkipCount(Long skipCount) {
        this.skipCount = skipCount;
        return this;
    }
    public Long getSkipCount() {
        return this.skipCount;
    }

    public BatchimportKmDocumentResponse setDocuments(String documents) {
        this.documents = documents;
        return this;
    }
    public String getDocuments() {
        return this.documents;
    }

}
