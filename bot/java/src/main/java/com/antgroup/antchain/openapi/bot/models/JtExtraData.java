// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class JtExtraData extends TeaModel {
    // 查询的时间范围内的行驶总里程
    /**
     * <strong>example:</strong>
     * <p>312</p>
     */
    @NameInMap("delta_mileage")
    @Validation(required = true)
    public Long deltaMileage;

    // 最大车速
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("max_speed")
    @Validation(required = true)
    public Long maxSpeed;

    // 平均车速
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("avg_speed")
    @Validation(required = true)
    public Long avgSpeed;

    public static JtExtraData build(java.util.Map<String, ?> map) throws Exception {
        JtExtraData self = new JtExtraData();
        return TeaModel.build(map, self);
    }

    public JtExtraData setDeltaMileage(Long deltaMileage) {
        this.deltaMileage = deltaMileage;
        return this;
    }
    public Long getDeltaMileage() {
        return this.deltaMileage;
    }

    public JtExtraData setMaxSpeed(Long maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    public Long getMaxSpeed() {
        return this.maxSpeed;
    }

    public JtExtraData setAvgSpeed(Long avgSpeed) {
        this.avgSpeed = avgSpeed;
        return this;
    }
    public Long getAvgSpeed() {
        return this.avgSpeed;
    }

}
