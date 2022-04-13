// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UidShard extends TeaModel {
    // UID 起始值
    @NameInMap("min_uid")
    @Validation(required = true)
    public Long minUid;

    // UID 终止值
    @NameInMap("max_uid")
    @Validation(required = true)
    public Long maxUid;

    public static UidShard build(java.util.Map<String, ?> map) throws Exception {
        UidShard self = new UidShard();
        return TeaModel.build(map, self);
    }

    public UidShard setMinUid(Long minUid) {
        this.minUid = minUid;
        return this;
    }
    public Long getMinUid() {
        return this.minUid;
    }

    public UidShard setMaxUid(Long maxUid) {
        this.maxUid = maxUid;
        return this;
    }
    public Long getMaxUid() {
        return this.maxUid;
    }

}
