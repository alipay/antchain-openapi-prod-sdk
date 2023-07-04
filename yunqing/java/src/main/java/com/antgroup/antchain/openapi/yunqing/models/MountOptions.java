// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class MountOptions extends TeaModel {
    // 容器内挂载路径
    @NameInMap("mount_path")
    @Validation(required = true)
    public String mountPath;

    // 是否只读，默认false
    @NameInMap("read_only")
    @Validation(required = true)
    public String readOnly;

    // 挂载传递策略：    NONE("None"),
    //     HOSTTOCONTAINER("HostToContainer"),
    //     BIDIRECTIONAL("Bidirectional");
    // 
    @NameInMap("mount_propagation")
    @Validation(required = true)
    public String mountPropagation;

    public static MountOptions build(java.util.Map<String, ?> map) throws Exception {
        MountOptions self = new MountOptions();
        return TeaModel.build(map, self);
    }

    public MountOptions setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public MountOptions setReadOnly(String readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public String getReadOnly() {
        return this.readOnly;
    }

    public MountOptions setMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
        return this;
    }
    public String getMountPropagation() {
        return this.mountPropagation;
    }

}
