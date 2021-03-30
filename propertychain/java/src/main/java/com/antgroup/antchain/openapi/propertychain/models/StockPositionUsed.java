// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class StockPositionUsed extends TeaModel {
    // 库位ID
    @NameInMap("position_id")
    @Validation(required = true)
    public String positionId;

    // 已用容量，百分比的数值，如50%，则为50
    @NameInMap("used_capacity")
    @Validation(required = true)
    public Long usedCapacity;

    public static StockPositionUsed build(java.util.Map<String, ?> map) throws Exception {
        StockPositionUsed self = new StockPositionUsed();
        return TeaModel.build(map, self);
    }

    public StockPositionUsed setPositionId(String positionId) {
        this.positionId = positionId;
        return this;
    }
    public String getPositionId() {
        return this.positionId;
    }

    public StockPositionUsed setUsedCapacity(Long usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }
    public Long getUsedCapacity() {
        return this.usedCapacity;
    }

}
