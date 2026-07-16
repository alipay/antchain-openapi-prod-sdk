// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class ExecApiDataprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 租户code
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 请求参数
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static ExecApiDataprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecApiDataprocessRequest self = new ExecApiDataprocessRequest();
        return TeaModel.build(map, self);
    }

    public ExecApiDataprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecApiDataprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecApiDataprocessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ExecApiDataprocessRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public ExecApiDataprocessRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
