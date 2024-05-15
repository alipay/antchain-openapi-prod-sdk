// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PagequeryDataassetTypeRequest extends TeaModel {
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

    public static PagequeryDataassetTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDataassetTypeRequest self = new PagequeryDataassetTypeRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryDataassetTypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryDataassetTypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryDataassetTypeRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryDataassetTypeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
