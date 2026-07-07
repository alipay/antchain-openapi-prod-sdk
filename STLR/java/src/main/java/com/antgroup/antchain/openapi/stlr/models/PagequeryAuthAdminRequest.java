// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PagequeryAuthAdminRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前查询页数
    @NameInMap("page_number")
    public Long pageNumber;

    // 每页记录条数，默认为20
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryAuthAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAuthAdminRequest self = new PagequeryAuthAdminRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryAuthAdminRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryAuthAdminRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryAuthAdminRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryAuthAdminRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
