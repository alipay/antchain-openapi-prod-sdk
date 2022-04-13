// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LocalDiskVolumeSource extends TeaModel {
    // 主机路径。
    @NameInMap("host_directory_path")
    @Validation(required = true)
    public String hostDirectoryPath;

    // 是否允许创建。
    @NameInMap("create_if_not_present")
    @Validation(required = true)
    public Boolean createIfNotPresent;

    public static LocalDiskVolumeSource build(java.util.Map<String, ?> map) throws Exception {
        LocalDiskVolumeSource self = new LocalDiskVolumeSource();
        return TeaModel.build(map, self);
    }

    public LocalDiskVolumeSource setHostDirectoryPath(String hostDirectoryPath) {
        this.hostDirectoryPath = hostDirectoryPath;
        return this;
    }
    public String getHostDirectoryPath() {
        return this.hostDirectoryPath;
    }

    public LocalDiskVolumeSource setCreateIfNotPresent(Boolean createIfNotPresent) {
        this.createIfNotPresent = createIfNotPresent;
        return this;
    }
    public Boolean getCreateIfNotPresent() {
        return this.createIfNotPresent;
    }

}
