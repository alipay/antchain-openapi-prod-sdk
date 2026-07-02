// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicDeviceModelFixedAttributeInfo extends TeaModel {
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

    // 数据值类型
    // 字符串：string
    // 数字：long
    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // dataType为string时，表示数据长度最小值
    // dataType为long时，表示数据范围最小值
    @NameInMap("data_range_min")
    @Validation(required = true)
    public Long dataRangeMin;

    // dataType为string时，表示数据长度最大值
    // dataType为long时，表示数据范围最大值
    @NameInMap("data_range_max")
    @Validation(required = true)
    public Long dataRangeMax;

    public static IotbasicDeviceModelFixedAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicDeviceModelFixedAttributeInfo self = new IotbasicDeviceModelFixedAttributeInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicDeviceModelFixedAttributeInfo setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public IotbasicDeviceModelFixedAttributeInfo setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }
    public String getAttributeValue() {
        return this.attributeValue;
    }

    public IotbasicDeviceModelFixedAttributeInfo setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public IotbasicDeviceModelFixedAttributeInfo setDataRangeMin(Long dataRangeMin) {
        this.dataRangeMin = dataRangeMin;
        return this;
    }
    public Long getDataRangeMin() {
        return this.dataRangeMin;
    }

    public IotbasicDeviceModelFixedAttributeInfo setDataRangeMax(Long dataRangeMax) {
        this.dataRangeMax = dataRangeMax;
        return this;
    }
    public Long getDataRangeMax() {
        return this.dataRangeMax;
    }

}
