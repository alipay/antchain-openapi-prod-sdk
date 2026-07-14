// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryIntlinvoicesApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 合同或订单号
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 当前页码，默认1
    @NameInMap("current_page")
    public Long currentPage;

    // 每页条数，默认20
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryIntlinvoicesApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIntlinvoicesApplyRequest self = new QueryIntlinvoicesApplyRequest();
        return TeaModel.build(map, self);
    }

    public QueryIntlinvoicesApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIntlinvoicesApplyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIntlinvoicesApplyRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public QueryIntlinvoicesApplyRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIntlinvoicesApplyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
