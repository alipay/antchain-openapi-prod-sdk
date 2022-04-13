// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CellReplicasMap extends TeaModel {
    // cell name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 副本数
    @NameInMap("replicas")
    @Validation(required = true)
    public Long replicas;

    public static CellReplicasMap build(java.util.Map<String, ?> map) throws Exception {
        CellReplicasMap self = new CellReplicasMap();
        return TeaModel.build(map, self);
    }

    public CellReplicasMap setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellReplicasMap setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

}
