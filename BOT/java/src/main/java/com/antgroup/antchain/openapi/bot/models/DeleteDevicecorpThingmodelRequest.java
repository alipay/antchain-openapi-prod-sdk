// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteDevicecorpThingmodelRequest extends TeaModel {
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

    public static DeleteDevicecorpThingmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicecorpThingmodelRequest self = new DeleteDevicecorpThingmodelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevicecorpThingmodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDevicecorpThingmodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDevicecorpThingmodelRequest setPropertyIdentifier(java.util.List<String> propertyIdentifier) {
        this.propertyIdentifier = propertyIdentifier;
        return this;
    }
    public java.util.List<String> getPropertyIdentifier() {
        return this.propertyIdentifier;
    }

    public DeleteDevicecorpThingmodelRequest setServiceIdentifier(java.util.List<String> serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
        return this;
    }
    public java.util.List<String> getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    public DeleteDevicecorpThingmodelRequest setEventIdentifier(java.util.List<String> eventIdentifier) {
        this.eventIdentifier = eventIdentifier;
        return this;
    }
    public java.util.List<String> getEventIdentifier() {
        return this.eventIdentifier;
    }

    public DeleteDevicecorpThingmodelRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

}
