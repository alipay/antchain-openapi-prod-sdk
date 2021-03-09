// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseSchemaResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<DbSchema> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryDatabaseSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseSchemaResponse self = new QueryDatabaseSchemaResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseSchemaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDatabaseSchemaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDatabaseSchemaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDatabaseSchemaResponse setData(java.util.List<DbSchema> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DbSchema> getData() {
        return this.data;
    }

    public QueryDatabaseSchemaResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
