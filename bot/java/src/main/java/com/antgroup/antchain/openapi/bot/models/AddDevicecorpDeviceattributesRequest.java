// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddDevicecorpDeviceattributesRequest extends TeaModel {
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

    public static AddDevicecorpDeviceattributesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDevicecorpDeviceattributesRequest self = new AddDevicecorpDeviceattributesRequest();
        return TeaModel.build(map, self);
    }

    public AddDevicecorpDeviceattributesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDevicecorpDeviceattributesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDevicecorpDeviceattributesRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public AddDevicecorpDeviceattributesRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AddDevicecorpDeviceattributesRequest setModelValue(String modelValue) {
        this.modelValue = modelValue;
        return this;
    }
    public String getModelValue() {
        return this.modelValue;
    }

    public AddDevicecorpDeviceattributesRequest setSpecs(String specs) {
        this.specs = specs;
        return this;
    }
    public String getSpecs() {
        return this.specs;
    }

}
