// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseQuotaResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // quotas
    @NameInMap("quotas")
    public java.util.List<QuotaKv> quotas;

    public static AllDatabaseQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseQuotaResponse self = new AllDatabaseQuotaResponse();
        return TeaModel.build(map, self);
    }

    public AllDatabaseQuotaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllDatabaseQuotaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllDatabaseQuotaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllDatabaseQuotaResponse setQuotas(java.util.List<QuotaKv> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<QuotaKv> getQuotas() {
        return this.quotas;
    }

}
