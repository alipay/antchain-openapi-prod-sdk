// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class UpdateScopeValue extends TeaModel {
    // CN-HANGZHOU-FINANCE
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 限流值
    @NameInMap("limit")
    @Validation(required = true)
    public Long limit;

    // 生效与否
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    // 时间单位
    @NameInMap("time_duration")
    @Validation(required = true)
    public String timeDuration;

    public static UpdateScopeValue build(java.util.Map<String, ?> map) throws Exception {
        UpdateScopeValue self = new UpdateScopeValue();
        return TeaModel.build(map, self);
    }

    public UpdateScopeValue setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateScopeValue setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public UpdateScopeValue setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateScopeValue setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
        return this;
    }
    public String getTimeDuration() {
        return this.timeDuration;
    }

}
