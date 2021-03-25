// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationDatabaseResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 资源列表
    @NameInMap("databases")
    @Validation(required = true)
    public java.util.List<DepsDatabase> databases;

    // 当前页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 应用总数
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    public static QueryApplicationDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationDatabaseResponse self = new QueryApplicationDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationDatabaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationDatabaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationDatabaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationDatabaseResponse setDatabases(java.util.List<DepsDatabase> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<DepsDatabase> getDatabases() {
        return this.databases;
    }

    public QueryApplicationDatabaseResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationDatabaseResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationDatabaseResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
