// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiclaim.models;

import com.aliyun.tea.*;

public class QueryImageExtractionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务号
    @NameInMap("batch_no")
    public String batchNo;

    // 参考Document参数
    @NameInMap("documents")
    public java.util.List<Document> documents;

    public static QueryImageExtractionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageExtractionResponse self = new QueryImageExtractionResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageExtractionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryImageExtractionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryImageExtractionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryImageExtractionResponse setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public QueryImageExtractionResponse setDocuments(java.util.List<Document> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<Document> getDocuments() {
        return this.documents;
    }

}
