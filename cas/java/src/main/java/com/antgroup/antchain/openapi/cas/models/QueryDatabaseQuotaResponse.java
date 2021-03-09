// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseQuotaResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<QuotaKv> data;

    public static QueryDatabaseQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseQuotaResponse self = new QueryDatabaseQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseQuotaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDatabaseQuotaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDatabaseQuotaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDatabaseQuotaResponse setData(java.util.List<QuotaKv> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuotaKv> getData() {
        return this.data;
    }

}
