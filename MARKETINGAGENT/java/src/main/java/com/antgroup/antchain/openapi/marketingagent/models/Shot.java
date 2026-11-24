// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class Shot extends TeaModel {
    // 分镜编号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("shot_number")
    @Validation(required = true)
    public Long shotNumber;

    // 分镜时间
    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("shot_duration")
    @Validation(required = true)
    public Long shotDuration;

    // 分镜详情
    /**
     * <strong>example:</strong>
     * <p>镜头1 [0-2s] 深夜后厨</p>
     */
    @NameInMap("shot_detail")
    @Validation(required = true)
    public String shotDetail;

    public static Shot build(java.util.Map<String, ?> map) throws Exception {
        Shot self = new Shot();
        return TeaModel.build(map, self);
    }

    public Shot setShotNumber(Long shotNumber) {
        this.shotNumber = shotNumber;
        return this;
    }
    public Long getShotNumber() {
        return this.shotNumber;
    }

    public Shot setShotDuration(Long shotDuration) {
        this.shotDuration = shotDuration;
        return this;
    }
    public Long getShotDuration() {
        return this.shotDuration;
    }

    public Shot setShotDetail(String shotDetail) {
        this.shotDetail = shotDetail;
        return this;
    }
    public String getShotDetail() {
        return this.shotDetail;
    }

}
