// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ReplicaCount extends TeaModel {
    // 副本数量是部署单元维度还是集群维度。目前只支持Cell
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 部署单元名称或集群名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 对应副本数量。
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // （针对huanyu场景），original_count该单元当前的副本个数（count对应期望的副本个数）
    @NameInMap("original_count")
    public Long originalCount;

    public static ReplicaCount build(java.util.Map<String, ?> map) throws Exception {
        ReplicaCount self = new ReplicaCount();
        return TeaModel.build(map, self);
    }

    public ReplicaCount setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ReplicaCount setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ReplicaCount setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ReplicaCount setOriginalCount(Long originalCount) {
        this.originalCount = originalCount;
        return this;
    }
    public Long getOriginalCount() {
        return this.originalCount;
    }

}
