// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class StartProductAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 空间id
    @NameInMap("source_space_id")
    @Validation(required = true)
    public String sourceSpaceId;

    // 企业代码
    @NameInMap("enterprise_code")
    @Validation(required = true)
    public String enterpriseCode;

    // 国标产品标识码
    @NameInMap("product_identity_id")
    @Validation(required = true)
    public String productIdentityId;

    public static StartProductAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartProductAuthRequest self = new StartProductAuthRequest();
        return TeaModel.build(map, self);
    }

    public StartProductAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartProductAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartProductAuthRequest setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
    }

    public StartProductAuthRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public StartProductAuthRequest setProductIdentityId(String productIdentityId) {
        this.productIdentityId = productIdentityId;
        return this;
    }
    public String getProductIdentityId() {
        return this.productIdentityId;
    }

}
