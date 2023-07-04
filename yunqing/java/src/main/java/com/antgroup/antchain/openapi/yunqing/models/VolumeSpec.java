// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class VolumeSpec extends TeaModel {
    // 数据卷名称
    @NameInMap("volume_name")
    @Validation(required = true)
    public String volumeName;

    // 数据卷容量，单位为G
    @NameInMap("capacity")
    @Validation(required = true)
    public String capacity;

    public static VolumeSpec build(java.util.Map<String, ?> map) throws Exception {
        VolumeSpec self = new VolumeSpec();
        return TeaModel.build(map, self);
    }

    public VolumeSpec setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

    public VolumeSpec setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

}
