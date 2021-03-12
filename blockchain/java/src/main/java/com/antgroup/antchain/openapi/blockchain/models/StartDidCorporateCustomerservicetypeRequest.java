// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidCorporateCustomerservicetypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 自定义的扩展服务类型
    @NameInMap("service_types")
    @Validation(required = true)
    public java.util.List<DidServiceType> serviceTypes;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidCorporateCustomerservicetypeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidCorporateCustomerservicetypeRequest self = new StartDidCorporateCustomerservicetypeRequest();
        return TeaModel.build(map, self);
    }

    public StartDidCorporateCustomerservicetypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidCorporateCustomerservicetypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidCorporateCustomerservicetypeRequest setServiceTypes(java.util.List<DidServiceType> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }
    public java.util.List<DidServiceType> getServiceTypes() {
        return this.serviceTypes;
    }

    public StartDidCorporateCustomerservicetypeRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
