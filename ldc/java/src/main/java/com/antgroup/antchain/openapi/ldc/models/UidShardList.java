// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UidShardList extends TeaModel {
    // the uid shard list.
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<UidShard> data;

    public static UidShardList build(java.util.Map<String, ?> map) throws Exception {
        UidShardList self = new UidShardList();
        return TeaModel.build(map, self);
    }

    public UidShardList setData(java.util.List<UidShard> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UidShard> getData() {
        return this.data;
    }

}
