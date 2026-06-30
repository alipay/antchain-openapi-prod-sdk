// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GetTradeUsageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务实体ID，例如DCI
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static GetTradeUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTradeUsageRequest self = new GetTradeUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetTradeUsageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTradeUsageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTradeUsageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetTradeUsageRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetTradeUsageRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
