// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicDeviceModelFixedAttributeFailInfo extends TeaModel {
    // 属性说明
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("attribute_name")
    @Validation(required = true)
    public String attributeName;

    // 属性名称
    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("attribute_value")
    @Validation(required = true)
    public String attributeValue;

    // 数据值类型 字符串：string 数字：long
    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // dataType为string时，表示数据长度最小值 dataType为long时，表示数据范围最小值
    @NameInMap("data_range_min")
    @Validation(required = true)
    public Long dataRangeMin;

    // dataType为string时，表示数据长度最大值 dataType为long时，表示数据范围最大值
    @NameInMap("data_range_max")
    @Validation(required = true)
    public Long dataRangeMax;

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

    public static IotbasicDeviceModelFixedAttributeFailInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicDeviceModelFixedAttributeFailInfo self = new IotbasicDeviceModelFixedAttributeFailInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicDeviceModelFixedAttributeFailInfo setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public IotbasicDeviceModelFixedAttributeFailInfo setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }
    public String getAttributeValue() {
        return this.attributeValue;
    }

    public IotbasicDeviceModelFixedAttributeFailInfo setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public IotbasicDeviceModelFixedAttributeFailInfo setDataRangeMin(Long dataRangeMin) {
        this.dataRangeMin = dataRangeMin;
        return this;
    }
    public Long getDataRangeMin() {
        return this.dataRangeMin;
    }

    public IotbasicDeviceModelFixedAttributeFailInfo setDataRangeMax(Long dataRangeMax) {
        this.dataRangeMax = dataRangeMax;
        return this;
    }
    public Long getDataRangeMax() {
        return this.dataRangeMax;
    }

    public IotbasicDeviceModelFixedAttributeFailInfo setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public IotbasicDeviceModelFixedAttributeFailInfo setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
