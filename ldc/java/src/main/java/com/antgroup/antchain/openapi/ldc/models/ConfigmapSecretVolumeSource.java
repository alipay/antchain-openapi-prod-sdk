// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ConfigmapSecretVolumeSource extends TeaModel {
    // 引用volume名称。
    @NameInMap("volume_ref_name")
    @Validation(required = true)
    public String volumeRefName;

    public static ConfigmapSecretVolumeSource build(java.util.Map<String, ?> map) throws Exception {
        ConfigmapSecretVolumeSource self = new ConfigmapSecretVolumeSource();
        return TeaModel.build(map, self);
    }

    public ConfigmapSecretVolumeSource setVolumeRefName(String volumeRefName) {
        this.volumeRefName = volumeRefName;
        return this;
    }
    public String getVolumeRefName() {
        return this.volumeRefName;
    }

}
