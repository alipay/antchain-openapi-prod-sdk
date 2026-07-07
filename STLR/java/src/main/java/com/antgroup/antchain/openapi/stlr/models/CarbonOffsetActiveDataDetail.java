// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CarbonOffsetActiveDataDetail extends TeaModel {
    // 活动数据编号
    /**
     * <strong>example:</strong>
     * <p>AD1</p>
     */
    @NameInMap("active_data_no")
    @Validation(required = true)
    public String activeDataNo;

    // 活动数据名称
    /**
     * <strong>example:</strong>
     * <p>行走里程数</p>
     */
    @NameInMap("active_data_name")
    public String activeDataName;

    // 活动数据单位
    /**
     * <strong>example:</strong>
     * <p>km</p>
     */
    @NameInMap("active_data_unit")
    public String activeDataUnit;

    // 活动数据描述文案
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    // 活动数据值
    /**
     * <strong>example:</strong>
     * <p>22.22</p>
     */
    @NameInMap("active_data_value")
    @Validation(required = true)
    public String activeDataValue;

    public static CarbonOffsetActiveDataDetail build(java.util.Map<String, ?> map) throws Exception {
        CarbonOffsetActiveDataDetail self = new CarbonOffsetActiveDataDetail();
        return TeaModel.build(map, self);
    }

    public CarbonOffsetActiveDataDetail setActiveDataNo(String activeDataNo) {
        this.activeDataNo = activeDataNo;
        return this;
    }
    public String getActiveDataNo() {
        return this.activeDataNo;
    }

    public CarbonOffsetActiveDataDetail setActiveDataName(String activeDataName) {
        this.activeDataName = activeDataName;
        return this;
    }
    public String getActiveDataName() {
        return this.activeDataName;
    }

    public CarbonOffsetActiveDataDetail setActiveDataUnit(String activeDataUnit) {
        this.activeDataUnit = activeDataUnit;
        return this;
    }
    public String getActiveDataUnit() {
        return this.activeDataUnit;
    }

    public CarbonOffsetActiveDataDetail setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CarbonOffsetActiveDataDetail setActiveDataValue(String activeDataValue) {
        this.activeDataValue = activeDataValue;
        return this;
    }
    public String getActiveDataValue() {
        return this.activeDataValue;
    }

}
