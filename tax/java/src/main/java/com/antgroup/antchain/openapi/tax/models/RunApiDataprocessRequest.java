// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class RunApiDataprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数json
    @NameInMap("biz_param")
    @Validation(required = true)
    public String bizParam;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 调用的方法
    @NameInMap("method_code")
    @Validation(required = true)
    public String methodCode;

    // 租户编码
    @NameInMap("inst_code")
    public String instCode;

    public static RunApiDataprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        RunApiDataprocessRequest self = new RunApiDataprocessRequest();
        return TeaModel.build(map, self);
    }

    public RunApiDataprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunApiDataprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunApiDataprocessRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

    public RunApiDataprocessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RunApiDataprocessRequest setMethodCode(String methodCode) {
        this.methodCode = methodCode;
        return this;
    }
    public String getMethodCode() {
        return this.methodCode;
    }

    public RunApiDataprocessRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

}
