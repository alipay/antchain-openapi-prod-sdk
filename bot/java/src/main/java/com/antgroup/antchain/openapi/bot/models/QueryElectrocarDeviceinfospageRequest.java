// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDeviceinfospageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // trust_product_key
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // tuid
    @NameInMap("tuid")
    public String tuid;

    // page_num
    @NameInMap("page_num")
    public Long pageNum;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryElectrocarDeviceinfospageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDeviceinfospageRequest self = new QueryElectrocarDeviceinfospageRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDeviceinfospageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarDeviceinfospageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarDeviceinfospageRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarDeviceinfospageRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarDeviceinfospageRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarDeviceinfospageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
