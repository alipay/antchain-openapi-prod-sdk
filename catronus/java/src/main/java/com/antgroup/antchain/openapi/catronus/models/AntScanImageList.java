// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class AntScanImageList extends TeaModel {
    // 镜像镜像扫描
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<AntScanImage> list;

    public static AntScanImageList build(java.util.Map<String, ?> map) throws Exception {
        AntScanImageList self = new AntScanImageList();
        return TeaModel.build(map, self);
    }

    public AntScanImageList setList(java.util.List<AntScanImage> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AntScanImage> getList() {
        return this.list;
    }

}
