// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RegisterIotbasicCorpjoinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 厂商value
    @NameInMap("corp_code")
    @Validation(required = true)
    public String corpCode;

    // 厂商名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 厂商签约产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static RegisterIotbasicCorpjoinRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterIotbasicCorpjoinRequest self = new RegisterIotbasicCorpjoinRequest();
        return TeaModel.build(map, self);
    }

    public RegisterIotbasicCorpjoinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterIotbasicCorpjoinRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterIotbasicCorpjoinRequest setCorpCode(String corpCode) {
        this.corpCode = corpCode;
        return this;
    }
    public String getCorpCode() {
        return this.corpCode;
    }

    public RegisterIotbasicCorpjoinRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public RegisterIotbasicCorpjoinRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
