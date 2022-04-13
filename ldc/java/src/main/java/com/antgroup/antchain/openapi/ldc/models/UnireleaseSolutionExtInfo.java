// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnireleaseSolutionExtInfo extends TeaModel {
    // Linke配置信息
    @NameInMap("linke_info")
    @Validation(required = true)
    public UnireleaseSolutionExtInfoLinkeInfo linkeInfo;

    public static UnireleaseSolutionExtInfo build(java.util.Map<String, ?> map) throws Exception {
        UnireleaseSolutionExtInfo self = new UnireleaseSolutionExtInfo();
        return TeaModel.build(map, self);
    }

    public UnireleaseSolutionExtInfo setLinkeInfo(UnireleaseSolutionExtInfoLinkeInfo linkeInfo) {
        this.linkeInfo = linkeInfo;
        return this;
    }
    public UnireleaseSolutionExtInfoLinkeInfo getLinkeInfo() {
        return this.linkeInfo;
    }

}
