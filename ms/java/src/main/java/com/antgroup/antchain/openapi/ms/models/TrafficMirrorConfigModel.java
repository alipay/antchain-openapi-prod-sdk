// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TrafficMirrorConfigModel extends TeaModel {
    // 百分比
    @NameInMap("percent")
    public Long percent;

    // 放大倍数
    @NameInMap("amplification")
    public Long amplification;

    public static TrafficMirrorConfigModel build(java.util.Map<String, ?> map) throws Exception {
        TrafficMirrorConfigModel self = new TrafficMirrorConfigModel();
        return TeaModel.build(map, self);
    }

    public TrafficMirrorConfigModel setPercent(Long percent) {
        this.percent = percent;
        return this;
    }
    public Long getPercent() {
        return this.percent;
    }

    public TrafficMirrorConfigModel setAmplification(Long amplification) {
        this.amplification = amplification;
        return this;
    }
    public Long getAmplification() {
        return this.amplification;
    }

}
