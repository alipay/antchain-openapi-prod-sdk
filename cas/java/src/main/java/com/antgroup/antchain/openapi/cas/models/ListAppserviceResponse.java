// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppserviceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页面
    @NameInMap("current_page")
    public Long currentPage;

    // PaginationResult<AppServiceViewModel>
    @NameInMap("data")
    public java.util.List<AppServiceViewModel> data;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListAppserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppserviceResponse self = new ListAppserviceResponse();
        return TeaModel.build(map, self);
    }

    public ListAppserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppserviceResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListAppserviceResponse setData(java.util.List<AppServiceViewModel> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppServiceViewModel> getData() {
        return this.data;
    }

    public ListAppserviceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppserviceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
