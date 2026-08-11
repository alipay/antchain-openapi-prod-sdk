// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtafirmwarelastestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可信产品唯一标识
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // OTA 模块名称
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    public static QueryElectrocarOtafirmwarelastestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtafirmwarelastestRequest self = new QueryElectrocarOtafirmwarelastestRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtafirmwarelastestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarOtafirmwarelastestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarOtafirmwarelastestRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarOtafirmwarelastestRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
