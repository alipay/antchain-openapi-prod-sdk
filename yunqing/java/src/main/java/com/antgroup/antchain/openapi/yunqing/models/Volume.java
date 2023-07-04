// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Volume extends TeaModel {
    // 数据卷名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    //  可挂载的配置
    @NameInMap("volume_source")
    @Validation(required = true)
    public VolumeSource volumeSource;

    // 数据卷配置
    @NameInMap("mount_options")
    @Validation(required = true)
    public MountOptions mountOptions;

    public static Volume build(java.util.Map<String, ?> map) throws Exception {
        Volume self = new Volume();
        return TeaModel.build(map, self);
    }

    public Volume setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Volume setVolumeSource(VolumeSource volumeSource) {
        this.volumeSource = volumeSource;
        return this;
    }
    public VolumeSource getVolumeSource() {
        return this.volumeSource;
    }

    public Volume setMountOptions(MountOptions mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }
    public MountOptions getMountOptions() {
        return this.mountOptions;
    }

}
