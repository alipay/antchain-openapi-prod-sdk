// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dsg.models;

import com.aliyun.tea.*;

public class QueryDocumentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 输出的敏感信息
    @NameInMap("result")
    public java.util.List<SensitiveEntity> result;

    public static QueryDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDocumentResponse self = new QueryDocumentResponse();
        return TeaModel.build(map, self);
    }

    public QueryDocumentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDocumentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDocumentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDocumentResponse setResult(java.util.List<SensitiveEntity> result) {
        this.result = result;
        return this;
    }
    public java.util.List<SensitiveEntity> getResult() {
        return this.result;
    }

}
