// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ExportSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // api列表
    @NameInMap("apis")
    public java.util.List<ApiPair> apis;

    public static ExportSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSpecRequest self = new ExportSpecRequest();
        return TeaModel.build(map, self);
    }

    public ExportSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportSpecRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ExportSpecRequest setApis(java.util.List<ApiPair> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<ApiPair> getApis() {
        return this.apis;
    }

}
