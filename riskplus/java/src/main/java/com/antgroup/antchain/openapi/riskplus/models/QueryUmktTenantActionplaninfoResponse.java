// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktTenantActionplaninfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户策略信息列表
    @NameInMap("query_result")
    public java.util.List<TenantActionPlanInfo> queryResult;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页容量
    @NameInMap("page_size")
    public Long pageSize;

    // 总量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryUmktTenantActionplaninfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktTenantActionplaninfoResponse self = new QueryUmktTenantActionplaninfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryUmktTenantActionplaninfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUmktTenantActionplaninfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUmktTenantActionplaninfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUmktTenantActionplaninfoResponse setQueryResult(java.util.List<TenantActionPlanInfo> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<TenantActionPlanInfo> getQueryResult() {
        return this.queryResult;
    }

    public QueryUmktTenantActionplaninfoResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryUmktTenantActionplaninfoResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUmktTenantActionplaninfoResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
