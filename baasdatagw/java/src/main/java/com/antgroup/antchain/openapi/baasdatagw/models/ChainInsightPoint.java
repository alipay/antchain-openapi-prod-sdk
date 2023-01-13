// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightPoint extends TeaModel {
    // x坐标，4位定点小数， 10000 表示 1
    @NameInMap("x")
    @Validation(required = true)
    public Long x;

    // y坐标，4位定点小数， 10000 表示 1
    @NameInMap("y")
    @Validation(required = true)
    public Long y;

    public static ChainInsightPoint build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightPoint self = new ChainInsightPoint();
        return TeaModel.build(map, self);
    }

    public ChainInsightPoint setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public ChainInsightPoint setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

}
