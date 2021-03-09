// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ComputerTypeFamily extends TeaModel {
    // computer type family id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 实例规格族所属代数。
    @NameInMap("generation")
    @Validation(required = true)
    public String generation;

    public static ComputerTypeFamily build(java.util.Map<String, ?> map) throws Exception {
        ComputerTypeFamily self = new ComputerTypeFamily();
        return TeaModel.build(map, self);
    }

    public ComputerTypeFamily setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ComputerTypeFamily setGeneration(String generation) {
        this.generation = generation;
        return this;
    }
    public String getGeneration() {
        return this.generation;
    }

}
