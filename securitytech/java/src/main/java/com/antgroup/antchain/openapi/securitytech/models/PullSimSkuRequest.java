// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class PullSimSkuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求的页数
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 单页项数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PullSimSkuRequest build(java.util.Map<String, ?> map) throws Exception {
        PullSimSkuRequest self = new PullSimSkuRequest();
        return TeaModel.build(map, self);
    }

    public PullSimSkuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullSimSkuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PullSimSkuRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PullSimSkuRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
