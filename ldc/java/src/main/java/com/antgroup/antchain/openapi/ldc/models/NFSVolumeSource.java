// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NFSVolumeSource extends TeaModel {
    // 挂载路径
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // NFS 服务端地址
    @NameInMap("server")
    @Validation(required = true)
    public String server;

    public static NFSVolumeSource build(java.util.Map<String, ?> map) throws Exception {
        NFSVolumeSource self = new NFSVolumeSource();
        return TeaModel.build(map, self);
    }

    public NFSVolumeSource setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public NFSVolumeSource setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

}
