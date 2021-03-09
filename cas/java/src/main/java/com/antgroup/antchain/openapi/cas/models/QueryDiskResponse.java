// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDiskResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // disk detail infos
    @NameInMap("data")
    public java.util.List<Disk> data;

    // total count
    @NameInMap("total_count")
    public Long totalCount;

    // page size
    @NameInMap("page_size")
    public Long pageSize;

    // current page
    @NameInMap("current_page")
    public Long currentPage;

    public static QueryDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDiskResponse self = new QueryDiskResponse();
        return TeaModel.build(map, self);
    }

    public QueryDiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDiskResponse setData(java.util.List<Disk> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Disk> getData() {
        return this.data;
    }

    public QueryDiskResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryDiskResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDiskResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
