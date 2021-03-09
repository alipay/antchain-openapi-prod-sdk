// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseAccountResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<DatabaseAccount> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseAccountResponse self = new QueryDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDatabaseAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDatabaseAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDatabaseAccountResponse setData(java.util.List<DatabaseAccount> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DatabaseAccount> getData() {
        return this.data;
    }

    public QueryDatabaseAccountResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
