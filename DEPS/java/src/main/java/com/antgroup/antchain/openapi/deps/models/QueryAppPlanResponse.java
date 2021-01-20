// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppPlanResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 查询到的发布单列表
    @NameInMap("data")
    public java.util.List<OpsPlan> data;

    // 当前分页，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 查询总数
    @NameInMap("total")
    public Long total;

    public static QueryAppPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppPlanResponse self = new QueryAppPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppPlanResponse setData(java.util.List<OpsPlan> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OpsPlan> getData() {
        return this.data;
    }

    public QueryAppPlanResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAppPlanResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppPlanResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
