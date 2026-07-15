// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseProductinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 供应商本版号
    @NameInMap("supplier_version")
    @Validation(required = true)
    public Long supplierVersion;

    // 合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 租赁方id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 资方id
    @NameInMap("credit_id")
    @Validation(required = true)
    public String creditId;

    public static QueryLeaseProductinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseProductinfoRequest self = new QueryLeaseProductinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseProductinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseProductinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseProductinfoRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryLeaseProductinfoRequest setSupplierVersion(Long supplierVersion) {
        this.supplierVersion = supplierVersion;
        return this;
    }
    public Long getSupplierVersion() {
        return this.supplierVersion;
    }

    public QueryLeaseProductinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryLeaseProductinfoRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public QueryLeaseProductinfoRequest setCreditId(String creditId) {
        this.creditId = creditId;
        return this;
    }
    public String getCreditId() {
        return this.creditId;
    }

}
