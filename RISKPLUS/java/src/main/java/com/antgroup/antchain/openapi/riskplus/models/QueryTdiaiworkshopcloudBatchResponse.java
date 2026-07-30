// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryTdiaiworkshopcloudBatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 样本回溯结果
    @NameInMap("sample_result")
    public java.util.List<ResultItem> sampleResult;

    public static QueryTdiaiworkshopcloudBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTdiaiworkshopcloudBatchResponse self = new QueryTdiaiworkshopcloudBatchResponse();
        return TeaModel.build(map, self);
    }

    public QueryTdiaiworkshopcloudBatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTdiaiworkshopcloudBatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTdiaiworkshopcloudBatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTdiaiworkshopcloudBatchResponse setSampleResult(java.util.List<ResultItem> sampleResult) {
        this.sampleResult = sampleResult;
        return this;
    }
    public java.util.List<ResultItem> getSampleResult() {
        return this.sampleResult;
    }

}
