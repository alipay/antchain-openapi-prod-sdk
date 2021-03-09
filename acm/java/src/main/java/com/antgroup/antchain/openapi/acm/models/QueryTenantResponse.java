// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryTenantResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 传入的页码, 如果没有传入, 则取默认值1
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 传入的页大小, 如果没有传入, 则取默认值10
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 租户列表
    @NameInMap("tenants")
    @Validation(required = true)
    public java.util.List<Tenant> tenants;

    // 查询结果的总条目数量
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    public static QueryTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantResponse self = new QueryTenantResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTenantResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTenantResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTenantResponse setTenants(java.util.List<Tenant> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<Tenant> getTenants() {
        return this.tenants;
    }

    public QueryTenantResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
