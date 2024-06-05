// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class DeleteBlockchainBotDevicecorpThingmodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要删除的属性标识符列表
    @NameInMap("property_identifier")
    public java.util.List<String> propertyIdentifier;

    // 需要删除的服务标识符列表
    @NameInMap("service_identifier")
    public java.util.List<String> serviceIdentifier;

    // 需要删除的事件标识符列表
    @NameInMap("event_identifier")
    public java.util.List<String> eventIdentifier;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    public static DeleteBlockchainBotDevicecorpThingmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlockchainBotDevicecorpThingmodelRequest self = new DeleteBlockchainBotDevicecorpThingmodelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlockchainBotDevicecorpThingmodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteBlockchainBotDevicecorpThingmodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteBlockchainBotDevicecorpThingmodelRequest setPropertyIdentifier(java.util.List<String> propertyIdentifier) {
        this.propertyIdentifier = propertyIdentifier;
        return this;
    }
    public java.util.List<String> getPropertyIdentifier() {
        return this.propertyIdentifier;
    }

    public DeleteBlockchainBotDevicecorpThingmodelRequest setServiceIdentifier(java.util.List<String> serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
        return this;
    }
    public java.util.List<String> getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    public DeleteBlockchainBotDevicecorpThingmodelRequest setEventIdentifier(java.util.List<String> eventIdentifier) {
        this.eventIdentifier = eventIdentifier;
        return this;
    }
    public java.util.List<String> getEventIdentifier() {
        return this.eventIdentifier;
    }

    public DeleteBlockchainBotDevicecorpThingmodelRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

}
