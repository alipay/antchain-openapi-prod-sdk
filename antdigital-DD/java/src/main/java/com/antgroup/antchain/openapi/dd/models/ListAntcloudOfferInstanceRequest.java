// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ListAntcloudOfferInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 渠道产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 实例状态过滤；默认 ["STARTED","CREATING"]
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // 游标（keyset）。首页请求不传或留空；后续请求传上一页响应返回的 nextCursor
    @NameInMap("cursor")
    public String cursor;

    // 每页条数，默认 20，上限 100
    @NameInMap("page_size")
    public Long pageSize;

    public static ListAntcloudOfferInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntcloudOfferInstanceRequest self = new ListAntcloudOfferInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListAntcloudOfferInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntcloudOfferInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListAntcloudOfferInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListAntcloudOfferInstanceRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListAntcloudOfferInstanceRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListAntcloudOfferInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
