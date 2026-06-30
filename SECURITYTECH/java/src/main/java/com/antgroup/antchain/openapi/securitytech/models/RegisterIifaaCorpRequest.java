// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RegisterIifaaCorpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产商code
    @NameInMap("corp_code")
    @Validation(required = true)
    public String corpCode;

    // 产商名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 产商签约code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static RegisterIifaaCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterIifaaCorpRequest self = new RegisterIifaaCorpRequest();
        return TeaModel.build(map, self);
    }

    public RegisterIifaaCorpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterIifaaCorpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterIifaaCorpRequest setCorpCode(String corpCode) {
        this.corpCode = corpCode;
        return this;
    }
    public String getCorpCode() {
        return this.corpCode;
    }

    public RegisterIifaaCorpRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public RegisterIifaaCorpRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
