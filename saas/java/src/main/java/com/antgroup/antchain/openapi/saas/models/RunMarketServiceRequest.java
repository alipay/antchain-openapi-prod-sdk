// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class RunMarketServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务方传入，幂等用。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // saas产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 服务code
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // 子服务code
    @NameInMap("sub_service_code")
    public String subServiceCode;

    // 服务版本
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    // 业务参数，map格式
    @NameInMap("params")
    public java.util.List<KeyValuePair> params;

    public static RunMarketServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMarketServiceRequest self = new RunMarketServiceRequest();
        return TeaModel.build(map, self);
    }

    public RunMarketServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunMarketServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunMarketServiceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RunMarketServiceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RunMarketServiceRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public RunMarketServiceRequest setSubServiceCode(String subServiceCode) {
        this.subServiceCode = subServiceCode;
        return this;
    }
    public String getSubServiceCode() {
        return this.subServiceCode;
    }

    public RunMarketServiceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public RunMarketServiceRequest setParams(java.util.List<KeyValuePair> params) {
        this.params = params;
        return this;
    }
    public java.util.List<KeyValuePair> getParams() {
        return this.params;
    }

}
