// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseSchemeResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<DbSchema> data;

    public static QueryDatabaseSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseSchemeResponse self = new QueryDatabaseSchemeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseSchemeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDatabaseSchemeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDatabaseSchemeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDatabaseSchemeResponse setData(java.util.List<DbSchema> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DbSchema> getData() {
        return this.data;
    }

}
