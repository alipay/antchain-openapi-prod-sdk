// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ScreenCancelInfo extends TeaModel {
    // 允许放弃时长（分钟）
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("cancel_in_min")
    @Validation(required = true)
    public Long cancelInMin;

    // 可用放弃次数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cancel_attempt_left")
    @Validation(required = true)
    public Long cancelAttemptLeft;

    public static ScreenCancelInfo build(java.util.Map<String, ?> map) throws Exception {
        ScreenCancelInfo self = new ScreenCancelInfo();
        return TeaModel.build(map, self);
    }

    public ScreenCancelInfo setCancelInMin(Long cancelInMin) {
        this.cancelInMin = cancelInMin;
        return this;
    }
    public Long getCancelInMin() {
        return this.cancelInMin;
    }

    public ScreenCancelInfo setCancelAttemptLeft(Long cancelAttemptLeft) {
        this.cancelAttemptLeft = cancelAttemptLeft;
        return this;
    }
    public Long getCancelAttemptLeft() {
        return this.cancelAttemptLeft;
    }

}
