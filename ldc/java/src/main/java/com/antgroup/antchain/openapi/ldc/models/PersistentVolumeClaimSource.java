// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PersistentVolumeClaimSource extends TeaModel {
    // 引用的PVC名称。
    @NameInMap("pvc_name")
    @Validation(required = true)
    public String pvcName;

    public static PersistentVolumeClaimSource build(java.util.Map<String, ?> map) throws Exception {
        PersistentVolumeClaimSource self = new PersistentVolumeClaimSource();
        return TeaModel.build(map, self);
    }

    public PersistentVolumeClaimSource setPvcName(String pvcName) {
        this.pvcName = pvcName;
        return this;
    }
    public String getPvcName() {
        return this.pvcName;
    }

}
