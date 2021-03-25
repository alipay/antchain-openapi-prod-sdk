// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryConfigGlobalResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 符合条件的全局参数列表
    @NameInMap("data")
    public java.util.List<GlobalParam> data;

    // 当前页
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 记录总数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryConfigGlobalResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigGlobalResponse self = new QueryConfigGlobalResponse();
        return TeaModel.build(map, self);
    }

    public QueryConfigGlobalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConfigGlobalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConfigGlobalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConfigGlobalResponse setData(java.util.List<GlobalParam> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GlobalParam> getData() {
        return this.data;
    }

    public QueryConfigGlobalResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryConfigGlobalResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryConfigGlobalResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
