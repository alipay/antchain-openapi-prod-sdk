// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class QueryAcrespackagecoreInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 产品名
    @NameInMap("product_name")
    public String productName;

    // 资源包实例id
    @NameInMap("resource_package_instance_id")
    public String resourcePackageInstanceId;

    // 开始时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // pageSize
    @NameInMap("page_size")
    public Long pageSize;

    // currentPage
    @NameInMap("current_page")
    public Long currentPage;

    public static QueryAcrespackagecoreInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAcrespackagecoreInstanceRequest self = new QueryAcrespackagecoreInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAcrespackagecoreInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAcrespackagecoreInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAcrespackagecoreInstanceRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryAcrespackagecoreInstanceRequest setResourcePackageInstanceId(String resourcePackageInstanceId) {
        this.resourcePackageInstanceId = resourcePackageInstanceId;
        return this;
    }
    public String getResourcePackageInstanceId() {
        return this.resourcePackageInstanceId;
    }

    public QueryAcrespackagecoreInstanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAcrespackagecoreInstanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryAcrespackagecoreInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAcrespackagecoreInstanceRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
