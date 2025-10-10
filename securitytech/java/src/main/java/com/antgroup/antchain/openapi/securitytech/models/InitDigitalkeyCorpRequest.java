// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class InitDigitalkeyCorpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户code
    @NameInMap("corp_code")
    @Validation(required = true)
    public String corpCode;

    // 客户名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 产品code
    @NameInMap("productc_ode")
    @Validation(required = true)
    public String productcOde;

    // 商户pid
    @NameInMap("pid")
    public String pid;

    public static InitDigitalkeyCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDigitalkeyCorpRequest self = new InitDigitalkeyCorpRequest();
        return TeaModel.build(map, self);
    }

    public InitDigitalkeyCorpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitDigitalkeyCorpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitDigitalkeyCorpRequest setCorpCode(String corpCode) {
        this.corpCode = corpCode;
        return this;
    }
    public String getCorpCode() {
        return this.corpCode;
    }

    public InitDigitalkeyCorpRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public InitDigitalkeyCorpRequest setProductcOde(String productcOde) {
        this.productcOde = productcOde;
        return this;
    }
    public String getProductcOde() {
        return this.productcOde;
    }

    public InitDigitalkeyCorpRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
