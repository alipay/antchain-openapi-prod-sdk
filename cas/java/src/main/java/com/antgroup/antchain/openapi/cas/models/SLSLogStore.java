// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SLSLogStore extends TeaModel {
    // 日志库名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // Shard个数，单位为个，范围为1~100。
    @NameInMap("shard_count")
    @Validation(required = true)
    public Long shardCount;

    // 数据的保存时间，单位为天，范围1~3600。
    @NameInMap("ttl")
    @Validation(required = true)
    public Long ttl;

    public static SLSLogStore build(java.util.Map<String, ?> map) throws Exception {
        SLSLogStore self = new SLSLogStore();
        return TeaModel.build(map, self);
    }

    public SLSLogStore setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SLSLogStore setShardCount(Long shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Long getShardCount() {
        return this.shardCount;
    }

    public SLSLogStore setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

}
