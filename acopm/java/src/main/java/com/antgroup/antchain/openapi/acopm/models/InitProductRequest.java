// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class InitProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 品牌名
    @NameInMap("first_name")
    @Validation(required = true)
    public String firstName;

    // 产品标识
    @NameInMap("second_name")
    @Validation(required = true)
    public String secondName;

    // api类型，tr或http(不区分大小写)
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static InitProductRequest build(java.util.Map<String, ?> map) throws Exception {
        InitProductRequest self = new InitProductRequest();
        return TeaModel.build(map, self);
    }

    public InitProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitProductRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public InitProductRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public InitProductRequest setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }
    public String getSecondName() {
        return this.secondName;
    }

    public InitProductRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
