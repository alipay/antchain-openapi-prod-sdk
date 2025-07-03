// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DubheFileInfo extends TeaModel {
    // 文件访问路径
    /**
     * <strong>example:</strong>
     * <p><a href="https://aa.bb.png?expiredtime=xx">https://aa.bb.png?expiredtime=xx</a></p>
     */
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    public static DubheFileInfo build(java.util.Map<String, ?> map) throws Exception {
        DubheFileInfo self = new DubheFileInfo();
        return TeaModel.build(map, self);
    }

    public DubheFileInfo setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
