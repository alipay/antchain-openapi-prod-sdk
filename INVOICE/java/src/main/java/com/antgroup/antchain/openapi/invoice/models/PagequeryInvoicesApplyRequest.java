// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class PagequeryInvoicesApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 合同号
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 系统来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static PagequeryInvoicesApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInvoicesApplyRequest self = new PagequeryInvoicesApplyRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInvoicesApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInvoicesApplyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInvoicesApplyRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public PagequeryInvoicesApplyRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryInvoicesApplyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryInvoicesApplyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
