// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CarInfo extends TeaModel {
    // 是否高频使用，格式：YES/NO
    /**
     * <strong>example:</strong>
     * <p>YES</p>
     */
    @NameInMap("high_frequency")
    public String highFrequency;

    // 车辆价值区间，格式：1，2，3...
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("value")
    public String value;

    // 车辆类型，格式：1，2，3
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public String type;

    public static CarInfo build(java.util.Map<String, ?> map) throws Exception {
        CarInfo self = new CarInfo();
        return TeaModel.build(map, self);
    }

    public CarInfo setHighFrequency(String highFrequency) {
        this.highFrequency = highFrequency;
        return this;
    }
    public String getHighFrequency() {
        return this.highFrequency;
    }

    public CarInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CarInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
