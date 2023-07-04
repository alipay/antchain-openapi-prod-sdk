// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GrayRelease extends TeaModel {
    // 需要更新到的副本数，比如：应用A有10个副本，本次更新updated_replicas=5，则会更新前5个
    @NameInMap("updated_replicas")
    public Long updatedReplicas;

    //     发布策略：TWO_GROUP("TWO_GROUP", "分两组"),
    //     ALL_ONE("ALL_ONE", "共分一组"),
    //     EACH_ONE("EACH_ONE", "每台一组"),
    //     SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐"),
    //     CUSTOMIZE("CUSTOMIZE", "自定义分组")
    @NameInMap("release_strategy")
    @Validation(required = true)
    public String releaseStrategy;

    public static GrayRelease build(java.util.Map<String, ?> map) throws Exception {
        GrayRelease self = new GrayRelease();
        return TeaModel.build(map, self);
    }

    public GrayRelease setUpdatedReplicas(Long updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
        return this;
    }
    public Long getUpdatedReplicas() {
        return this.updatedReplicas;
    }

    public GrayRelease setReleaseStrategy(String releaseStrategy) {
        this.releaseStrategy = releaseStrategy;
        return this;
    }
    public String getReleaseStrategy() {
        return this.releaseStrategy;
    }

}
