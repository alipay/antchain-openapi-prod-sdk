// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DraftPosition extends TeaModel {
    // x 浮点类型
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("x")
    @Validation(required = true)
    public String x;

    // y 浮点类型
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("y")
    @Validation(required = true)
    public String y;

    public static DraftPosition build(java.util.Map<String, ?> map) throws Exception {
        DraftPosition self = new DraftPosition();
        return TeaModel.build(map, self);
    }

    public DraftPosition setX(String x) {
        this.x = x;
        return this;
    }
    public String getX() {
        return this.x;
    }

    public DraftPosition setY(String y) {
        this.y = y;
        return this;
    }
    public String getY() {
        return this.y;
    }

}
