// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SyncData extends TeaModel {
    // 源数据
    @NameInMap("source_data")
    @Validation(required = true)
    public String sourceData;

    // 目标数据
    @NameInMap("target_data")
    @Validation(required = true)
    public String targetData;

    public static SyncData build(java.util.Map<String, ?> map) throws Exception {
        SyncData self = new SyncData();
        return TeaModel.build(map, self);
    }

    public SyncData setSourceData(String sourceData) {
        this.sourceData = sourceData;
        return this;
    }
    public String getSourceData() {
        return this.sourceData;
    }

    public SyncData setTargetData(String targetData) {
        this.targetData = targetData;
        return this;
    }
    public String getTargetData() {
        return this.targetData;
    }

}
