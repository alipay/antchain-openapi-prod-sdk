// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PersistentVolumeSource extends TeaModel {
    //     READWRITEONCE("ReadWriteOnce"),
    //     READONLYMANY("ReadOnlyMany"),
    //     READWRITEMANY("ReadWriteMany");
    @NameInMap("access_modes")
    @Validation(required = true)
    public java.util.List<String> accessModes;

    public static PersistentVolumeSource build(java.util.Map<String, ?> map) throws Exception {
        PersistentVolumeSource self = new PersistentVolumeSource();
        return TeaModel.build(map, self);
    }

    public PersistentVolumeSource setAccessModes(java.util.List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }
    public java.util.List<String> getAccessModes() {
        return this.accessModes;
    }

}
