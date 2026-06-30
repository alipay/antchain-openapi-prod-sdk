// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRtTopnResponse extends TeaModel {
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
    public java.util.List<CustomerUmktInfoModel> queryResult;

    public static BatchqueryUmktRtTopnResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRtTopnResponse self = new BatchqueryUmktRtTopnResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRtTopnResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryUmktRtTopnResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryUmktRtTopnResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryUmktRtTopnResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchqueryUmktRtTopnResponse setQueryResult(java.util.List<CustomerUmktInfoModel> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<CustomerUmktInfoModel> getQueryResult() {
        return this.queryResult;
    }

}
