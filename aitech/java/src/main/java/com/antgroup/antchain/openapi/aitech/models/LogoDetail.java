// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class LogoDetail extends TeaModel {
    // 位置，Top、Left、Width、Height
    @NameInMap("location")
    @Validation(required = true)
    public java.util.List<Long> location;

    // 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 置信度
    @NameInMap("probability")
    @Validation(required = true)
    public String probability;

    public static LogoDetail build(java.util.Map<String, ?> map) throws Exception {
        LogoDetail self = new LogoDetail();
        return TeaModel.build(map, self);
    }

    public LogoDetail setLocation(java.util.List<Long> location) {
        this.location = location;
        return this;
    }
    public java.util.List<Long> getLocation() {
        return this.location;
    }

    public LogoDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public LogoDetail setProbability(String probability) {
        this.probability = probability;
        return this;
    }
    public String getProbability() {
        return this.probability;
    }

}
