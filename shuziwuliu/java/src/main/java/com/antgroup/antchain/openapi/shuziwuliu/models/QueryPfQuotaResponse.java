// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfQuotaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信额度信息
    @NameInMap("quota_info")
    public java.util.List<PfCreditQuotaInfo> quotaInfo;

    public static QueryPfQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPfQuotaResponse self = new QueryPfQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryPfQuotaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPfQuotaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPfQuotaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPfQuotaResponse setQuotaInfo(java.util.List<PfCreditQuotaInfo> quotaInfo) {
        this.quotaInfo = quotaInfo;
        return this;
    }
    public java.util.List<PfCreditQuotaInfo> getQuotaInfo() {
        return this.quotaInfo;
    }

}
