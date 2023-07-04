// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PersistentVolumeConfig extends TeaModel {
    // 挂载名称
    @NameInMap("volume_name")
    @Validation(required = true)
    public String volumeName;

    //     挂载的获取名称，默认：ReadWriteOnce。READWRITEONCE("ReadWriteOnce"),
    //     READONLYMANY("ReadOnlyMany"),
    //     READWRITEMANY("ReadWriteMany");
    @NameInMap("access_modes")
    public java.util.List<String> accessModes;

    // 存储类
    @NameInMap("storage_class")
    public String storageClass;

    // 是否使用匿名卷，，默认false
    @NameInMap("use_empty_dir")
    @Validation(required = true)
    public Boolean useEmptyDir;

    public static PersistentVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
        PersistentVolumeConfig self = new PersistentVolumeConfig();
        return TeaModel.build(map, self);
    }

    public PersistentVolumeConfig setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

    public PersistentVolumeConfig setAccessModes(java.util.List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }
    public java.util.List<String> getAccessModes() {
        return this.accessModes;
    }

    public PersistentVolumeConfig setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public PersistentVolumeConfig setUseEmptyDir(Boolean useEmptyDir) {
        this.useEmptyDir = useEmptyDir;
        return this;
    }
    public Boolean getUseEmptyDir() {
        return this.useEmptyDir;
    }

}
