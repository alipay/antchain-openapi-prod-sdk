// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HPAScalePolicy extends TeaModel {
    // 枚举型：
    // - pods：按pod个数扩缩容；
    // - percent：基于当前副本数的百分比扩缩容。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 当type为percent时，value值为增长副本数的百分比，900%表示在原先副本数的基础上增加9倍（单位：%）；当type为pods时，value值为增加的副本数目（单位：个）。
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 每次扩缩容动作间隔时间：600表示每10分钟操作一次
    @NameInMap("period_seconds")
    public Long periodSeconds;

    public static HPAScalePolicy build(java.util.Map<String, ?> map) throws Exception {
        HPAScalePolicy self = new HPAScalePolicy();
        return TeaModel.build(map, self);
    }

    public HPAScalePolicy setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public HPAScalePolicy setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public HPAScalePolicy setPeriodSeconds(Long periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Long getPeriodSeconds() {
        return this.periodSeconds;
    }

}
