// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListComputerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // computer infos
    @NameInMap("data")
    public java.util.List<Computer> data;

    // total count
    @NameInMap("total_count")
    public Long totalCount;

    // page size
    @NameInMap("page_size")
    public Long pageSize;

    // current page
    @NameInMap("current_page")
    public Long currentPage;

    public static ListComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputerResponse self = new ListComputerResponse();
        return TeaModel.build(map, self);
    }

    public ListComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListComputerResponse setData(java.util.List<Computer> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Computer> getData() {
        return this.data;
    }

    public ListComputerResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListComputerResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListComputerResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
