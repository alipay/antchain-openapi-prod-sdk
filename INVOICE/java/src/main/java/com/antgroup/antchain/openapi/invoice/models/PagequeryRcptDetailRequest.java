// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class PagequeryRcptDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 合同号
    @NameInMap("ar_no")
    public String arNo;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 当前页码，不传默认为1
    @NameInMap("current_page")
    public Long currentPage;

    // 分页条数，不传默认20条
    @NameInMap("page_size")
    public Long pageSize;

    // 系统来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static PagequeryRcptDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryRcptDetailRequest self = new PagequeryRcptDetailRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryRcptDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryRcptDetailRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public PagequeryRcptDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryRcptDetailRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryRcptDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryRcptDetailRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
