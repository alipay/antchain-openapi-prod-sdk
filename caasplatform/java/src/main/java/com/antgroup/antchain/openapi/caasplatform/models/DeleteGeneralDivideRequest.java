// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class DeleteGeneralDivideRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 分账方Id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static DeleteGeneralDivideRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGeneralDivideRequest self = new DeleteGeneralDivideRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGeneralDivideRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteGeneralDivideRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteGeneralDivideRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DeleteGeneralDivideRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
