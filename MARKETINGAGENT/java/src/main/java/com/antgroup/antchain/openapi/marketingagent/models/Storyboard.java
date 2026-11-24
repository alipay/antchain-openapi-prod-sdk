// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class Storyboard extends TeaModel {
    // 分镜id集合
    /**
     * <strong>example:</strong>
     * <p>[&quot;shot-001&quot;]</p>
     */
    @NameInMap("shot_ids")
    @Validation(required = true)
    public java.util.List<String> shotIds;

    // 分镜集合
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("shots")
    @Validation(required = true)
    public java.util.List<Shot> shots;

    public static Storyboard build(java.util.Map<String, ?> map) throws Exception {
        Storyboard self = new Storyboard();
        return TeaModel.build(map, self);
    }

    public Storyboard setShotIds(java.util.List<String> shotIds) {
        this.shotIds = shotIds;
        return this;
    }
    public java.util.List<String> getShotIds() {
        return this.shotIds;
    }

    public Storyboard setShots(java.util.List<Shot> shots) {
        this.shots = shots;
        return this;
    }
    public java.util.List<Shot> getShots() {
        return this.shots;
    }

}
