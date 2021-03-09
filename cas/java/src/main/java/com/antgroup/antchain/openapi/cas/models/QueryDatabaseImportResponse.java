// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseImportResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<DatabaseImportVO> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryDatabaseImportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseImportResponse self = new QueryDatabaseImportResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseImportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDatabaseImportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDatabaseImportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDatabaseImportResponse setData(java.util.List<DatabaseImportVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DatabaseImportVO> getData() {
        return this.data;
    }

    public QueryDatabaseImportResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
