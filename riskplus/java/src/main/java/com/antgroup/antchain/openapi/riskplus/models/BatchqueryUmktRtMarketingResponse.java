// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRtMarketingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 处理是否成功
    @NameInMap("success")
    public Boolean success;

    // 实时营销单条结果
    @NameInMap("query_result")
    public java.util.List<BaseCustomerUmktInfoModel> queryResult;

    public static BatchqueryUmktRtMarketingResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRtMarketingResponse self = new BatchqueryUmktRtMarketingResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRtMarketingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryUmktRtMarketingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryUmktRtMarketingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryUmktRtMarketingResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchqueryUmktRtMarketingResponse setQueryResult(java.util.List<BaseCustomerUmktInfoModel> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<BaseCustomerUmktInfoModel> getQueryResult() {
        return this.queryResult;
    }

}
