// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicDeviceModelAttributeInfo extends TeaModel {
    // 型号
    /**
     * <strong>example:</strong>
     * <p>A2</p>
     */
    @NameInMap("model_value")
    @Validation(required = true)
    public String modelValue;

    // 规格列表
    // 为空表示使用标准规格
    @NameInMap("specs_list")
    public java.util.List<String> specsList;

    public static IotbasicDeviceModelAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicDeviceModelAttributeInfo self = new IotbasicDeviceModelAttributeInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicDeviceModelAttributeInfo setModelValue(String modelValue) {
        this.modelValue = modelValue;
        return this;
    }
    public String getModelValue() {
        return this.modelValue;
    }

    public IotbasicDeviceModelAttributeInfo setSpecsList(java.util.List<String> specsList) {
        this.specsList = specsList;
        return this;
    }
    public java.util.List<String> getSpecsList() {
        return this.specsList;
    }

}
