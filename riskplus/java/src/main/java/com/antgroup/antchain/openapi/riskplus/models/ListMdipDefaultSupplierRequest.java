// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ListMdipDefaultSupplierRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ANTCLOUD
    @NameInMap("default_tenant")
    public String defaultTenant;

    public static ListMdipDefaultSupplierRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMdipDefaultSupplierRequest self = new ListMdipDefaultSupplierRequest();
        return TeaModel.build(map, self);
    }

    public ListMdipDefaultSupplierRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListMdipDefaultSupplierRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListMdipDefaultSupplierRequest setDefaultTenant(String defaultTenant) {
        this.defaultTenant = defaultTenant;
        return this;
    }
    public String getDefaultTenant() {
        return this.defaultTenant;
    }

}
