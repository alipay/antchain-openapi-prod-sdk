// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class VolumeSource extends TeaModel {
    // 宿主机模式配置
    @NameInMap("host_path")
    public HostPathVolumeSource hostPath;

    // 和Host二选一
    @NameInMap("persistent_volume")
    public PersistentVolumeSource persistentVolume;

    public static VolumeSource build(java.util.Map<String, ?> map) throws Exception {
        VolumeSource self = new VolumeSource();
        return TeaModel.build(map, self);
    }

    public VolumeSource setHostPath(HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
        return this;
    }
    public HostPathVolumeSource getHostPath() {
        return this.hostPath;
    }

    public VolumeSource setPersistentVolume(PersistentVolumeSource persistentVolume) {
        this.persistentVolume = persistentVolume;
        return this;
    }
    public PersistentVolumeSource getPersistentVolume() {
        return this.persistentVolume;
    }

}
