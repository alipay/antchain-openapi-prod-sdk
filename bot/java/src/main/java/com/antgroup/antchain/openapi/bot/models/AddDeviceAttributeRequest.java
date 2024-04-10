// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddDeviceAttributeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 型号名称
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 型号值
    @NameInMap("model_value")
    @Validation(required = true)
    public String modelValue;

    // 规格列表，列表json字符串
    // 没值默认使用标准规格
    @NameInMap("specs")
    public String specs;

    public static AddDeviceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceAttributeRequest self = new AddDeviceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceAttributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDeviceAttributeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDeviceAttributeRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public AddDeviceAttributeRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AddDeviceAttributeRequest setModelValue(String modelValue) {
        this.modelValue = modelValue;
        return this;
    }
    public String getModelValue() {
        return this.modelValue;
    }

    public AddDeviceAttributeRequest setSpecs(String specs) {
        this.specs = specs;
        return this;
    }
    public String getSpecs() {
        return this.specs;
    }

}
