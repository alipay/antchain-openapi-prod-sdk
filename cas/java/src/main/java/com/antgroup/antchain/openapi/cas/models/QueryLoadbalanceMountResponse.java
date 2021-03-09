// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceMountResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // data
    @NameInMap("data")
    public java.util.List<MountComputer> data;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryLoadbalanceMountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceMountResponse self = new QueryLoadbalanceMountResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceMountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLoadbalanceMountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLoadbalanceMountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLoadbalanceMountResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLoadbalanceMountResponse setData(java.util.List<MountComputer> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MountComputer> getData() {
        return this.data;
    }

    public QueryLoadbalanceMountResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLoadbalanceMountResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
