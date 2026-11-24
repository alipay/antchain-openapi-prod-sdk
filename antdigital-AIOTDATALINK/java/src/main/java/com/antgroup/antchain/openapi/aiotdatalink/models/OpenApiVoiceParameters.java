// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class OpenApiVoiceParameters extends TeaModel {
    // 未确证规范映射/默认为null，不把SDK rate默认当规范已生效
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("speed")
    @Validation(required = true)
    public Long speed;

    // 未确证为null；SDK pitchRate默认1不等于半音0
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("pitch")
    @Validation(required = true)
    public Long pitch;

    // Cosyvoice原应用默认100；其他未确证默认null
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("volume")
    @Validation(required = true)
    public Long volume;

    public static OpenApiVoiceParameters build(java.util.Map<String, ?> map) throws Exception {
        OpenApiVoiceParameters self = new OpenApiVoiceParameters();
        return TeaModel.build(map, self);
    }

    public OpenApiVoiceParameters setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public OpenApiVoiceParameters setPitch(Long pitch) {
        this.pitch = pitch;
        return this;
    }
    public Long getPitch() {
        return this.pitch;
    }

    public OpenApiVoiceParameters setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

}
