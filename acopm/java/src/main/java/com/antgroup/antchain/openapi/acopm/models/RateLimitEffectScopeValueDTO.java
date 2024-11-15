// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class RateLimitEffectScopeValueDTO extends TeaModel {
    // region
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // enabled
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    // limit
    @NameInMap("limit")
    @Validation(required = true)
    public Long limit;

    // timeDuration
    @NameInMap("time_duration")
    @Validation(required = true)
    public String timeDuration;

    public static RateLimitEffectScopeValueDTO build(java.util.Map<String, ?> map) throws Exception {
        RateLimitEffectScopeValueDTO self = new RateLimitEffectScopeValueDTO();
        return TeaModel.build(map, self);
    }

    public RateLimitEffectScopeValueDTO setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public RateLimitEffectScopeValueDTO setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public RateLimitEffectScopeValueDTO setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public RateLimitEffectScopeValueDTO setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
        return this;
    }
    public String getTimeDuration() {
        return this.timeDuration;
    }

}
