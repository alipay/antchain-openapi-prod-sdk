// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6efc6591476e4813ac8f7c9b6359c0b7.models;

import com.aliyun.tea.*;

public class RunAntchainSaasMarketServiceRequest extends TeaModel {
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

    public static RunAntchainSaasMarketServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAntchainSaasMarketServiceRequest self = new RunAntchainSaasMarketServiceRequest();
        return TeaModel.build(map, self);
    }

    public RunAntchainSaasMarketServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunAntchainSaasMarketServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunAntchainSaasMarketServiceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RunAntchainSaasMarketServiceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RunAntchainSaasMarketServiceRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public RunAntchainSaasMarketServiceRequest setSubServiceCode(String subServiceCode) {
        this.subServiceCode = subServiceCode;
        return this;
    }
    public String getSubServiceCode() {
        return this.subServiceCode;
    }

    public RunAntchainSaasMarketServiceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public RunAntchainSaasMarketServiceRequest setParams(java.util.List<KeyValuePair> params) {
        this.params = params;
        return this;
    }
    public java.util.List<KeyValuePair> getParams() {
        return this.params;
    }

}
