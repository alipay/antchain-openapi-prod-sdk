// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DataAssetUpdateFrequencyInfo extends TeaModel {
    // 频率值
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 
    //     DAY
    //     WEEK
    //     MONTH
    //     QUARTER
    //     YEAR
    //     OTHER
    /**
     * <strong>example:</strong>
     * <p>YEAR</p>
     */
    @NameInMap("unit_code")
    @Validation(required = true)
    public String unitCode;

    public static DataAssetUpdateFrequencyInfo build(java.util.Map<String, ?> map) throws Exception {
        DataAssetUpdateFrequencyInfo self = new DataAssetUpdateFrequencyInfo();
        return TeaModel.build(map, self);
    }

    public DataAssetUpdateFrequencyInfo setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public DataAssetUpdateFrequencyInfo setUnitCode(String unitCode) {
        this.unitCode = unitCode;
        return this;
    }
    public String getUnitCode() {
        return this.unitCode;
    }

}
