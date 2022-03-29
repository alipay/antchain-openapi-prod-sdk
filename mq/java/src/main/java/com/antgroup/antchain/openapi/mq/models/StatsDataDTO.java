// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class StatsDataDTO extends TeaModel {
    // 横轴，毫秒时间戳
    @NameInMap("x")
    @Validation(required = true)
    public Long x;

    // 纵轴，数据（TPS 或者总量）
    @NameInMap("y")
    @Validation(required = true)
    public String y;

    public static StatsDataDTO build(java.util.Map<String, ?> map) throws Exception {
        StatsDataDTO self = new StatsDataDTO();
        return TeaModel.build(map, self);
    }

    public StatsDataDTO setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public StatsDataDTO setY(String y) {
        this.y = y;
        return this;
    }
    public String getY() {
        return this.y;
    }

}
