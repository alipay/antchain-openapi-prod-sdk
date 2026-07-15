// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryRefinanceOrderidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产包id
    @NameInMap("package_id")
    @Validation(required = true)
    public String packageId;

    // 从第0页开始
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 每次max最多查询的个数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryRefinanceOrderidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRefinanceOrderidRequest self = new QueryRefinanceOrderidRequest();
        return TeaModel.build(map, self);
    }

    public QueryRefinanceOrderidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRefinanceOrderidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRefinanceOrderidRequest setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

    public QueryRefinanceOrderidRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryRefinanceOrderidRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
