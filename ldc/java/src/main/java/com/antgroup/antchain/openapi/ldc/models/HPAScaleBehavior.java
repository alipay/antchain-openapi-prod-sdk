// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HPAScaleBehavior extends TeaModel {
    // 扩容高级规则
    @NameInMap("scale_up")
    public HPAScaleRule scaleUp;

    // 缩容高级规则
    @NameInMap("scale_down")
    public HPAScaleRule scaleDown;

    public static HPAScaleBehavior build(java.util.Map<String, ?> map) throws Exception {
        HPAScaleBehavior self = new HPAScaleBehavior();
        return TeaModel.build(map, self);
    }

    public HPAScaleBehavior setScaleUp(HPAScaleRule scaleUp) {
        this.scaleUp = scaleUp;
        return this;
    }
    public HPAScaleRule getScaleUp() {
        return this.scaleUp;
    }

    public HPAScaleBehavior setScaleDown(HPAScaleRule scaleDown) {
        this.scaleDown = scaleDown;
        return this;
    }
    public HPAScaleRule getScaleDown() {
        return this.scaleDown;
    }

}
