// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListCloudconnectorConnectionResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // List<Connection>
    @NameInMap("data")
    public java.util.List<Connection> data;

    // startIndex
    @NameInMap("start_index")
    public Long startIndex;

    // pageSize
    @NameInMap("page_size")
    public Long pageSize;

    // totalSize
    @NameInMap("total_size")
    public Long totalSize;

    // currentPage
    @NameInMap("current_page")
    public Long currentPage;

    public static ListCloudconnectorConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudconnectorConnectionResponse self = new ListCloudconnectorConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudconnectorConnectionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCloudconnectorConnectionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCloudconnectorConnectionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCloudconnectorConnectionResponse setData(java.util.List<Connection> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Connection> getData() {
        return this.data;
    }

    public ListCloudconnectorConnectionResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListCloudconnectorConnectionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCloudconnectorConnectionResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListCloudconnectorConnectionResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
