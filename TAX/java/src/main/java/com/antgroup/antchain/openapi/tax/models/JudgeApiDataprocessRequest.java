// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class JudgeApiDataprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 租户code
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 业务参数
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static JudgeApiDataprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeApiDataprocessRequest self = new JudgeApiDataprocessRequest();
        return TeaModel.build(map, self);
    }

    public JudgeApiDataprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeApiDataprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public JudgeApiDataprocessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public JudgeApiDataprocessRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public JudgeApiDataprocessRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
