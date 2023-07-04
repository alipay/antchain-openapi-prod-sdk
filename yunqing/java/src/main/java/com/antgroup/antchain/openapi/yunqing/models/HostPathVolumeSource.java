// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class HostPathVolumeSource extends TeaModel {
    // 宿主机挂载的路径
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    //   挂载的类型：  FILE("File"),
    //     DIRECTORY("Directory");
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static HostPathVolumeSource build(java.util.Map<String, ?> map) throws Exception {
        HostPathVolumeSource self = new HostPathVolumeSource();
        return TeaModel.build(map, self);
    }

    public HostPathVolumeSource setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public HostPathVolumeSource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
