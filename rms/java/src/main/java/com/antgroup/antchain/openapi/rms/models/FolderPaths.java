// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class FolderPaths extends TeaModel {
    // paths
    @NameInMap("paths")
    @Validation(required = true)
    public java.util.List<FolderPath> paths;

    public static FolderPaths build(java.util.Map<String, ?> map) throws Exception {
        FolderPaths self = new FolderPaths();
        return TeaModel.build(map, self);
    }

    public FolderPaths setPaths(java.util.List<FolderPath> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<FolderPath> getPaths() {
        return this.paths;
    }

}
