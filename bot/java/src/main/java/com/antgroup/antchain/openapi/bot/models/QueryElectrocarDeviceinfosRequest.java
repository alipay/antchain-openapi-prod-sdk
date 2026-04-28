// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDeviceinfosRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // trust_product_key
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页数
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryElectrocarDeviceinfosRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDeviceinfosRequest self = new QueryElectrocarDeviceinfosRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDeviceinfosRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarDeviceinfosRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarDeviceinfosRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarDeviceinfosRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarDeviceinfosRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
