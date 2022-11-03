// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRtMixedmarketingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果
    @NameInMap("query_results")
    public java.util.List<CustomerUmktInfosModel> queryResults;

    public static BatchqueryUmktRtMixedmarketingResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRtMixedmarketingResponse self = new BatchqueryUmktRtMixedmarketingResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRtMixedmarketingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryUmktRtMixedmarketingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryUmktRtMixedmarketingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryUmktRtMixedmarketingResponse setQueryResults(java.util.List<CustomerUmktInfosModel> queryResults) {
        this.queryResults = queryResults;
        return this;
    }
    public java.util.List<CustomerUmktInfosModel> getQueryResults() {
        return this.queryResults;
    }

}
