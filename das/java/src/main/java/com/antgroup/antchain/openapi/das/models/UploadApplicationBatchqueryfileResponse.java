// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class UploadApplicationBatchqueryfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 离线任务查询id，批量任务结束后可通过该字段查询结果
    // 
    @NameInMap("query_id")
    public String queryId;

    public static UploadApplicationBatchqueryfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadApplicationBatchqueryfileResponse self = new UploadApplicationBatchqueryfileResponse();
        return TeaModel.build(map, self);
    }

    public UploadApplicationBatchqueryfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadApplicationBatchqueryfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadApplicationBatchqueryfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadApplicationBatchqueryfileResponse setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
