// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktTenantActionplaninfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道类型
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static BatchqueryUmktTenantActionplaninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktTenantActionplaninfoRequest self = new BatchqueryUmktTenantActionplaninfoRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktTenantActionplaninfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryUmktTenantActionplaninfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryUmktTenantActionplaninfoRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public BatchqueryUmktTenantActionplaninfoRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchqueryUmktTenantActionplaninfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
