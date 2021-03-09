// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseSpecResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<DatabaseSpec> data;

    public static QueryDatabaseSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseSpecResponse self = new QueryDatabaseSpecResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseSpecResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDatabaseSpecResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDatabaseSpecResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDatabaseSpecResponse setData(java.util.List<DatabaseSpec> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DatabaseSpec> getData() {
        return this.data;
    }

}
