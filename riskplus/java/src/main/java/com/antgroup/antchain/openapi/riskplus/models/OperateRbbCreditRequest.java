// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class OperateRbbCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务code
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // 服务参数
    @NameInMap("service_params")
    @Validation(required = true)
    public String serviceParams;

    public static OperateRbbCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateRbbCreditRequest self = new OperateRbbCreditRequest();
        return TeaModel.build(map, self);
    }

    public OperateRbbCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateRbbCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateRbbCreditRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public OperateRbbCreditRequest setServiceParams(String serviceParams) {
        this.serviceParams = serviceParams;
        return this;
    }
    public String getServiceParams() {
        return this.serviceParams;
    }

}
