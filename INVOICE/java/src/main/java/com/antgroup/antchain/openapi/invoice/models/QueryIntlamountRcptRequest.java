// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryIntlamountRcptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 合同号或订单号
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 当前页码，默认1
    @NameInMap("current_page")
    public Long currentPage;

    // 每页条数，默认20
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryIntlamountRcptRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIntlamountRcptRequest self = new QueryIntlamountRcptRequest();
        return TeaModel.build(map, self);
    }

    public QueryIntlamountRcptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIntlamountRcptRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIntlamountRcptRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public QueryIntlamountRcptRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIntlamountRcptRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
