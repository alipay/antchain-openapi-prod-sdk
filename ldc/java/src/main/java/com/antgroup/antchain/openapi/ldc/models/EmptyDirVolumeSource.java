// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class EmptyDirVolumeSource extends TeaModel {
    // 存储介质。
    @NameInMap("medium")
    @Validation(required = true)
    public String medium;

    // volume name。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 存储大小。
    @NameInMap("size_limit")
    @Validation(required = true)
    public String sizeLimit;

    public static EmptyDirVolumeSource build(java.util.Map<String, ?> map) throws Exception {
        EmptyDirVolumeSource self = new EmptyDirVolumeSource();
        return TeaModel.build(map, self);
    }

    public EmptyDirVolumeSource setMedium(String medium) {
        this.medium = medium;
        return this;
    }
    public String getMedium() {
        return this.medium;
    }

    public EmptyDirVolumeSource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EmptyDirVolumeSource setSizeLimit(String sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }
    public String getSizeLimit() {
        return this.sizeLimit;
    }

}
