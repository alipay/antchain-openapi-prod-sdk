// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudInvoiceIntlinvoicesApplyRequest extends TeaModel {
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

    public static QueryAntcloudInvoiceIntlinvoicesApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudInvoiceIntlinvoicesApplyRequest self = new QueryAntcloudInvoiceIntlinvoicesApplyRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudInvoiceIntlinvoicesApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudInvoiceIntlinvoicesApplyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntcloudInvoiceIntlinvoicesApplyRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public QueryAntcloudInvoiceIntlinvoicesApplyRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAntcloudInvoiceIntlinvoicesApplyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
