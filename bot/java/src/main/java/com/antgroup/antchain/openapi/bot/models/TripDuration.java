// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TripDuration extends TeaModel {
    // 时间
    /**
     * <strong>example:</strong>
     * <p>&quot;1.2&quot;</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 时间单位
    /**
     * <strong>example:</strong>
     * <p>&quot;h&quot;</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static TripDuration build(java.util.Map<String, ?> map) throws Exception {
        TripDuration self = new TripDuration();
        return TeaModel.build(map, self);
    }

    public TripDuration setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public TripDuration setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
