// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDeviceModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品类类型
    // 标准品类：standard
    // 自定义品类：custom
    @NameInMap("category_type")
    @Validation(required = true)
    public String categoryType;

    // 品类编码
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 属性列表，与固定属性列表不能同时为空
    @NameInMap("attribute_info_list")
    public java.util.List<IotbasicDeviceModelAttributeInfo> attributeInfoList;

    // 固定属性列表，与属性列表不能同时为空
    @NameInMap("fixed_attribute_info_list")
    public java.util.List<IotbasicDeviceModelFixedAttributeInfo> fixedAttributeInfoList;

    public static CreateDeviceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceModelRequest self = new CreateDeviceModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDeviceModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDeviceModelRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public CreateDeviceModelRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public CreateDeviceModelRequest setAttributeInfoList(java.util.List<IotbasicDeviceModelAttributeInfo> attributeInfoList) {
        this.attributeInfoList = attributeInfoList;
        return this;
    }
    public java.util.List<IotbasicDeviceModelAttributeInfo> getAttributeInfoList() {
        return this.attributeInfoList;
    }

    public CreateDeviceModelRequest setFixedAttributeInfoList(java.util.List<IotbasicDeviceModelFixedAttributeInfo> fixedAttributeInfoList) {
        this.fixedAttributeInfoList = fixedAttributeInfoList;
        return this;
    }
    public java.util.List<IotbasicDeviceModelFixedAttributeInfo> getFixedAttributeInfoList() {
        return this.fixedAttributeInfoList;
    }

}
