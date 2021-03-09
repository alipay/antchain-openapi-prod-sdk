// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListApplicationResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用列表
    @NameInMap("data")
    public java.util.List<AppView> data;

    // 总数量
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页码
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    public static ListApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationResponse self = new ListApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListApplicationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListApplicationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListApplicationResponse setData(java.util.List<AppView> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppView> getData() {
        return this.data;
    }

    public ListApplicationResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListApplicationResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListApplicationResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
