// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicDeviceModelAttributeFailInfo extends TeaModel {
    // 型号
    /**
     * <strong>example:</strong>
     * <p>A2</p>
     */
    @NameInMap("model_value")
    @Validation(required = true)
    public String modelValue;

    // 规格列表 为空表示使用标准规格
    @NameInMap("specs_list")
    public java.util.List<String> specsList;

    // 失败code
    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 失败消息
    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static IotbasicDeviceModelAttributeFailInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicDeviceModelAttributeFailInfo self = new IotbasicDeviceModelAttributeFailInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicDeviceModelAttributeFailInfo setModelValue(String modelValue) {
        this.modelValue = modelValue;
        return this;
    }
    public String getModelValue() {
        return this.modelValue;
    }

    public IotbasicDeviceModelAttributeFailInfo setSpecsList(java.util.List<String> specsList) {
        this.specsList = specsList;
        return this;
    }
    public java.util.List<String> getSpecsList() {
        return this.specsList;
    }

    public IotbasicDeviceModelAttributeFailInfo setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public IotbasicDeviceModelAttributeFailInfo setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
