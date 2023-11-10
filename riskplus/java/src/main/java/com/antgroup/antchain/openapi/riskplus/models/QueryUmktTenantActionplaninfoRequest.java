// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktTenantActionplaninfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页容量
    @NameInMap("page_size")
    public Long pageSize;

    // 渠道code
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    public static QueryUmktTenantActionplaninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktTenantActionplaninfoRequest self = new QueryUmktTenantActionplaninfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktTenantActionplaninfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktTenantActionplaninfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktTenantActionplaninfoRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryUmktTenantActionplaninfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUmktTenantActionplaninfoRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

}
