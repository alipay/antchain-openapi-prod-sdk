// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Path extends TeaModel {
    // fixpath
    @NameInMap("fix_path")
    public FixPath fixPath;

    // shibai lujing
    @NameInMap("failed_path")
    public String failedPath;

    public static Path build(java.util.Map<String, ?> map) throws Exception {
        Path self = new Path();
        return TeaModel.build(map, self);
    }

    public Path setFixPath(FixPath fixPath) {
        this.fixPath = fixPath;
        return this;
    }
    public FixPath getFixPath() {
        return this.fixPath;
    }

    public Path setFailedPath(String failedPath) {
        this.failedPath = failedPath;
        return this;
    }
    public String getFailedPath() {
        return this.failedPath;
    }

}
